package com.bank.exception;

public class BankException extends RuntimeException {
	private String message;

	public BankException(String message) {

		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "BankException [message=" + message + "]";
	}

}
