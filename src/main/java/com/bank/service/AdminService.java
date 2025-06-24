package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.AdminDetails;
import com.bank.Dao.AdminDao;
import com.bank.entity.AdminEntity;
import com.bank.entity.BankDetailsEntity;
import com.bank.exception.AdminException;
import com.bank.exception.adminloginExcepttion;

@Service
public class AdminService {
	@Autowired
	private AdminDao dao;

	public boolean adminDataValidation(AdminDetails admin) {
		String pass = admin.getPassword();

		if (admin.getEmail().contains("@gmail.com") && pass.length() == 4) {

		} else {
			throw new AdminException("invalid admin data");
		}
		AdminEntity entity = new AdminEntity();
		entity.setEmail(admin.getEmail());
		entity.setPassword(admin.getPassword());
		entity.setRole(admin.getRole());
		AdminEntity entity1 = dao.insertAdminData(entity);
		if (entity1.getId() > 0) {
			return true;
		} else {
			throw new AdminException("Server Error 500");
		}

	}
//	 public AdminEntity selectAdminDetailsUsingId(int id) {
//		 AdminEntity e=dao.selectUsingId(id);
//		 if(e.getId()>0) {
//			 return e;
//		 }else {
//			 throw new AdminException("no  data found");
//		 }
//		 
//	}
	public boolean selectAdminid(int id) {
		if(dao.selectUsingId(id)){
			return true;
		}
		else {
			throw new adminloginExcepttion("Invalid Id");
		}
	}
	
	public AdminEntity getAdminById(int id) {
	    return dao.selectUsingIddata(id);  // This will either return the AdminEntity or throw an exception
	}
	public AdminEntity updateAdminPass(AdminDetails admin) {
	AdminEntity entity=dao.selectUsingIddata(admin.getId());
	entity.setPassword(admin.getPassword());
	return dao.updateAdminpasswordInDb(entity);
	}


}
