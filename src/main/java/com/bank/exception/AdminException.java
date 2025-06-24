package com.bank.exception;

public class AdminException extends RuntimeException {

	private String msg;

	
	public AdminException() {
		super();
	}


	public AdminException(String msg) {
		super();
		this.msg = msg;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	@Override
	public String toString() {
		return "AdminException [msg=" + msg + "]";
	}
	
}
