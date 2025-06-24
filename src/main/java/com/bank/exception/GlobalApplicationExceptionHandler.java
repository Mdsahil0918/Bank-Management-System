package com.bank.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalApplicationExceptionHandler {
//	@ResponseBody
	@ExceptionHandler(BankException.class)
	public String bankUserDataException(BankException be, Model m) {
		String responce = be.getMessage();
		m.addAttribute("responce", responce);
		System.out.println("bank user data exeption");
		return "registration";
	}
	@ExceptionHandler(BankuserLoginException.class)
	public String bankUserLoginException(BankuserLoginException loginexcep,Model m1) {
		String response= loginexcep.getUsermsg();
		m1.addAttribute("response", response);
		return "login";
	}

//	@ResponseBody
	@ExceptionHandler(AdminException.class)
	public String adminExceptionHandeler(AdminException adex, Model m) {
		String response = adex.getMsg();
		m.addAttribute("res", response);
		return "adminreg";

	}

	@ExceptionHandler(adminloginExcepttion.class)
	public String adminloginExceptionHandeler(adminloginExcepttion adex, Model m) {
		String response = adex.getMsg();
		m.addAttribute("res1", response);
		return "adminlogin";

	}

}
