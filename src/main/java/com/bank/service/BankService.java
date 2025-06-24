package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.BankDetails;
import com.bank.Dao.BankUserDao;
import com.bank.entity.BankDetailsEntity;
import com.bank.exception.BankException;
import com.bank.exception.BankuserLoginException;

@Service
public class BankService {
	@Autowired
	private BankUserDao dao;

	public boolean userRegistrationData(BankDetails bd) {
		if (bd.getEmail().contains("@gmail.com")) {

		} else {
			throw new BankException("invalid Email");
		}
		String adhar = bd.getAadharNumber() + "";
		if (adhar.length() == 12) {
		} else {
			throw new BankException("invalid Addhar");
		}
		if (bd.getMobile() >= 6000000000l && bd.getMobile() <= 9999999999l) {
		} else {
			throw new BankException("invalid mobile number ");
		}
		BankDetailsEntity bdentity = new BankDetailsEntity();
		bdentity.setAadharNumber(bd.getAadharNumber());
		bdentity.setAddress(bd.getAddress());
		bdentity.setGender(bd.getGender());
		bdentity.setEmail(bd.getEmail());
		bdentity.setMobile(bd.getMobile());
		bdentity.setName(bd.getName());
		bdentity.setAmount(bd.getAmount());
		BankDetailsEntity entity = dao.insertBankUser(bdentity);
		if (entity.getId() > 0) {
			return true;
		} else {
			throw new BankException("Server 500 ERROR");
		}

	}

	public boolean userLoginData(int id) {
		System.out.println("Service :" + id);
		if (dao.selectUserUsingId(id)) {
			return true;
		} else {
			throw new BankuserLoginException("invalid User Id");
		}
	}

	public List<BankDetailsEntity> selectAllBankUser() {
		return dao.selectAlluserDetails();
	}

	public void inserstars(BankDetailsEntity entity) {
		String addhar = entity.getAadharNumber() + "";
		String mobile = entity.getAddress() + "";
		String add1 = addhar.substring(0, 3);
		String mobile1 = mobile.substring(0, 3);
		for (int i = 0; i < 6; i++) {
			add1 += "*";
		}
		for (int j = 0; j < 4; j++) {
			mobile1 += "*";
		}
		mobile1.substring(mobile.length() - 3);
		add1.substring(addhar.length() - 3);

	}

	public boolean deleteUserByid(int userid) {
		return dao.deleteByid(userid);
	}

	public BankDetailsEntity updateuserusingid(int userid) {
		return dao.selectBankUserDetails(userid);
	}

	public BankDetailsEntity updateUserDb(BankDetails dto) {
		BankDetailsEntity e= dao.selectBankUserDetails(dto.getUserid());
		e.setName(dto.getName());
		e.setEmail(dto.getEmail());
		e.setAddress(dto.getAddress());
		e.setMobile(dto.getMobile());
		return dao.updateUserDb(e);
	}

	public List<BankDetailsEntity> filterByUSerName(String name) {
		return dao.getUserDetailsByName(name);
	}
}
