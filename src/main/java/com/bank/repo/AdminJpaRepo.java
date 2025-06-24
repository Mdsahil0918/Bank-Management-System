package com.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.AdminEntity;
public interface AdminJpaRepo extends JpaRepository<AdminEntity, Integer>{

}
