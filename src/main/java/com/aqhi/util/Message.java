package com.aqhi.util;

import org.springframework.expression.spel.ast.BooleanLiteral;

public class Message {
	
	private String msg;
	
	private boolean status = false;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
