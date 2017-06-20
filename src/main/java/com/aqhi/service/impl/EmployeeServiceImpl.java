package com.aqhi.service.impl;

import java.util.List;



import javax.naming.AuthenticationException;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aqhi.mapper.EmployeeMapper;
import com.aqhi.model.Employee;
import com.aqhi.service.EmployeeService;
import com.aqhi.util.Message;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeMapper employeeMapper;

	@Override
	public List<Employee> selectEmployee() {
		return employeeMapper.selectEmployee();
	}

	@Override
	public Message login(UsernamePasswordToken token) {
		
		Message msg = new Message();
		
		Subject subject = SecurityUtils.getSubject();
		try{
			subject.login(token);
			msg.setStatus(true);
		} catch  ( UnknownAccountException uae ) {
			msg.setMsg("用户不存在或者密码错误！");
		} catch  ( IncorrectCredentialsException ice ) { 
			msg.setMsg("用户不存在或者密码错误！");
		} catch  ( LockedAccountException lae ) {
			msg.setMsg("用户不存在或者密码错误！");
		} catch  ( ExcessiveAttemptsException eae ) { 
			msg.setMsg("尝试此时太多");
		}
		return msg;
	}

	@Override
	public Employee selectEmployeeByName(String nickname) {
		return employeeMapper.selectByNickname(nickname);
	}

	@Override
	public Employee selectByEmplId(Long empl_id) {
		// TODO Auto-generated method stub
		return employeeMapper.selectByEmplId(empl_id);
	}

}
