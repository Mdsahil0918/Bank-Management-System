package com.bank.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.BankDetailsEntity;

public interface BankUserJpaRepo  extends JpaRepository<BankDetailsEntity, Integer>{

	List<BankDetailsEntity> findByName(String name);
}
