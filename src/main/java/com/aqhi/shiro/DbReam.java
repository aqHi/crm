package com.aqhi.shiro;

import javax.annotation.Resource;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;

import com.aqhi.model.Employee;
import com.aqhi.service.EmployeeService;
import com.aqhi.util.PasswordEncode;

public class DbReam extends AuthorizingRealm {

	@Resource
	EmployeeService employeeService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {
		String name = (String) authenticationToken.getPrincipal();
		String pass = new String((char[]) authenticationToken.getCredentials());
		// 把token转换成User对象
		Employee userLogin = tokenToUser((UsernamePasswordToken) authenticationToken);
		// 验证用户是否可以登录
		Employee employee = employeeService.selectEmployeeByName(userLogin.getNickname());
		if (employee == null) {
			System.out.println("未找到用户");
			throw new UnknownAccountException();// 异常处理，找不到数据
		} else {
			String salt = employee.getSalt();
			String password = PasswordEncode.encodePassword(pass, salt);
			System.out.println("------------" + password);
			System.out.println("employee" + employee.toString());
			System.out.println("userLogin" + userLogin.toString());
			if (password.equals(employee.getPassword())) {
				System.out.println("校验成功");
				// 设置session
				Session session = SecurityUtils.getSubject().getSession();

				// 当前 Realm 的 name
				String realmName = this.getName();
				// 登陆的主要信息: 可以是一个实体类的对象, 但该实体类的对象一定是根据 token 的 username 查询得到的.
				// Object principal = ui.getUsername();
				Object principal = authenticationToken.getPrincipal();
				return new SimpleAuthenticationInfo(principal, userLogin.getPassword(), realmName);
			} else {
				throw new IncorrectCredentialsException();// 密码错误
			}
		}

	}

	private Employee tokenToUser(UsernamePasswordToken authcToken) {
		Employee employee = new Employee();
		employee.setNickname(authcToken.getUsername());
		employee.setPassword(String.valueOf(authcToken.getPassword()));
		return employee;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	

}
