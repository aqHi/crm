package com.aqhi.service;

import java.util.List;


import org.apache.shiro.authc.UsernamePasswordToken;

import com.aqhi.model.Employee;
import com.aqhi.util.Message;

public interface EmployeeService {
	
	/**
	 * 查询员工列表
	 * @return
	 */
	List<Employee> selectEmployee();
	
	/**
	 * 员工登录
	 * @param token
	 * @return 消息
	 */
	Message login(UsernamePasswordToken token); 
	
	
	/**
	 * 通过用户名查询员工信息
	 * @param nickname
	 * @return 员工信息
	 */
	Employee selectEmployeeByName(String nickname);
	
	
	Employee selectByEmplId (Long empl_id);

}
