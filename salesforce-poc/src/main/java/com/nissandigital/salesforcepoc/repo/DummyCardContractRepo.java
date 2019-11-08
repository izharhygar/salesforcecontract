package com.nissandigital.salesforcepoc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.nissandigital.salesforcepoc.model.DummyCardContract;

@Component
public interface DummyCardContractRepo extends JpaRepository<DummyCardContract, String>{

	

}
