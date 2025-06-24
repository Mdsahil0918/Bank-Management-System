package com.bank.exception;

public class adminloginExcepttion extends RuntimeException{
private String msg;


public adminloginExcepttion() {
	super();
}


public adminloginExcepttion(String msg) {
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
	return "adminloginExcepttion [msg=" + msg + "]";
}


}
