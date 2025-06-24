package com.bank.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.BankDetails;
import com.bank.entity.BankDetailsEntity;
import com.bank.exception.BankException;
import com.bank.repo.BankUserJpaRepo;

@Repository
public class BankUserDao {
	@Autowired
	private BankUserJpaRepo repo;

	public BankDetailsEntity insertBankUser(BankDetailsEntity entity) {
		return repo.save(entity);
	}

	public boolean selectUserUsingId(int id) {
		System.out.println("Dao :" + id);
		Optional<BankDetailsEntity> entity = repo.findById(id);
		System.out.println(entity);
		return entity.isPresent();
	}

	public List<BankDetailsEntity> selectAlluserDetails() {
		List<BankDetailsEntity> bankuserdetails = repo.findAll();
		return bankuserdetails;
	}

	public boolean deleteByid(int userid) {
		repo.deleteById(userid);
		return true;
	}

	public BankDetailsEntity selectBankUserDetails(int userid) {
		Optional<BankDetailsEntity> entity = repo.findById(userid);
//		if(entity.isPresent()) {
//			return entity.get();
//		}
//		else {
//			throw new BankException("invalid user id");
//		}
		return entity.orElseThrow(() -> new BankException("invalid user id"));
	}

	public BankDetailsEntity updateUserDb(BankDetailsEntity e) {
		return repo.save(e);
	}

	public List<BankDetailsEntity> getUserDetailsByName(String name) {
		return repo.findByName(name);
	}
}
