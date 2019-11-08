package com.nissandigital.salesforcepoc.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nissandigital.salesforcepoc.model.DummyCardContract;
import com.nissandigital.salesforcepoc.repo.DummyCardContractRepo;

@Service
public class DummyCardContractService {
	
	@Autowired
	private DummyCardContractRepo repo;
	
	public List<DummyCardContract> getAllCardContracts(){
		return repo.findAll();
	}
	
	public DummyCardContract getOneCardContract(String Id) {
		
		return repo.findById(Id).orElse(new DummyCardContract());
	}
	
	public ResponseEntity<DummyCardContract> postDummyCardContract(DummyCardContract dummyCardContract) {
		DummyCardContract savedCardContract = repo.save(dummyCardContract);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{contractID}")
				.buildAndExpand(savedCardContract.getCardNumberHouse()).toUri();

		return ResponseEntity.created(location).build();
		
	}
	
	public ResponseEntity<DummyCardContract> updateDummyCardContractByID(DummyCardContract dummyCardContact, String id) {
		
		Optional<DummyCardContract> dummyCardContractOptional = repo.findById(id);

		if (!dummyCardContractOptional.isPresent())
			return ResponseEntity.notFound().build();

		dummyCardContact.setCardNumberHouse(id);
		
		repo.save(dummyCardContact);

		return ResponseEntity.noContent().build();
	}
	
	public ResponseEntity<DummyCardContract> deleteDummyCardContractByID(String id)
	{

		Optional<DummyCardContract> dummyCardContractOptional = repo.findById(id);

		if (!dummyCardContractOptional.isPresent())
			return ResponseEntity.notFound().build();
		
		repo.deleteById(id);
		return ResponseEntity.noContent().build();
		
	}

}
