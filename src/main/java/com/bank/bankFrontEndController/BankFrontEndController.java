package com.bank.bankFrontEndController;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.bank.bakconfig.BankConfig;

public class BankFrontEndController extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	Class BankConfig[]= {BankConfig.class};
		return BankConfig;
	}

	@Override
	protected String[] getServletMappings() {
		String mapping[]= {"/bank/*"};
		return mapping;
	}

}
