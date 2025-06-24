package com.bank.exception;

public class BankuserLoginException extends RuntimeException {
private String Usermsg;

public BankuserLoginException(String usermsg) {
	super();
	Usermsg = usermsg;
}

public BankuserLoginException() {
	super();
}

public String getUsermsg() {
	return Usermsg;
}

public void setUsermsg(String usermsg) {
	Usermsg = usermsg;
}

@Override
public String toString() {
	return "BankuserLoginException [Usermsg=" + Usermsg + "]";
}


}
