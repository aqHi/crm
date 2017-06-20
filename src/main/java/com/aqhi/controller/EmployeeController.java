package com.aqhi.controller;

import java.util.Iterator;
import java.util.List;



import javax.annotation.Resource;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aqhi.model.Employee;
import com.aqhi.model.UUserRole;
import com.aqhi.service.EmployeeService;
import com.aqhi.service.UUserRoleService;
import com.aqhi.util.Message;

@Controller
@RequestMapping("/empl")
public class EmployeeController {
	
	@Resource
	EmployeeService employeeService;
	

	
	
	
	@RequestMapping("/login")
	public String login(String nickname , String password , ModelMap modelMap){
		System.out.println("go -- login");

		
		Employee emp = employeeService.selectByEmplId((long) 10000);
		
		System.out.println(emp.toString());
		
		
		if(nickname!=null && password!=null){
			UsernamePasswordToken token = new UsernamePasswordToken(nickname , password);
			Message msg =  employeeService.login(token);
			modelMap.put("msg", msg.getMsg());
			if(msg.isStatus()){
				return "index";
			}else{
				return "login";
			}
		}else{
			return "login";
		}
		
		
	}
	
	@RequestMapping("/goindex")
	public String goIndex(){
		System.out.println("jinru -----");
		List <Employee> lst =  employeeService.selectEmployee();
		for (Employee emp : lst) {
			System.out.println(emp.toString());
		}
		return "index";
	}
	

}
