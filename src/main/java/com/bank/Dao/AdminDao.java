package com.bank.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.AdminEntity;
import com.bank.exception.AdminException;
import com.bank.repo.AdminJpaRepo;

@Repository
public class AdminDao {
 @Autowired
 private AdminJpaRepo repo;
 public AdminEntity insertAdminData(AdminEntity entity) {
	 return repo.save(entity);
 }
  
 public boolean selectUsingId(int id) {
	Optional<AdminEntity> admin =repo.findById(id);
	return admin.isPresent();
 }
 public AdminEntity selectUsingIddata(int id) {
	    return repo.findById(id)
	        .orElseThrow(() -> new AdminException("Admin not found with id: " + id));  // Returns the AdminEntity or throws exception
	}

public AdminEntity updateAdminpasswordInDb(AdminEntity entity) {
	return repo.save(entity);

}
}
