package com.nissandigital.salesforcepoc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nissandigital.salesforcepoc.model.DummyCardContract;
import com.nissandigital.salesforcepoc.service.DummyCardContractService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
@Api(value = "salesforce POC controller", description = "Salesforce POC REST endpoint ")
@RequestMapping("contracts")
public class DummyCardContractController {
	
	@Autowired
	private DummyCardContractService service;

	@ApiOperation(value="get data of all Dummy Card Contracts")
	@ApiResponses(value= {
			@ApiResponse(code = 400, message = "Bad Request!!. Please Check your URL"),
			@ApiResponse(code = 200, message = "OK! records fetched")
	})
	@GetMapping(produces = "application/json")
	public List<DummyCardContract> getAllDummyContracts()
	{
		return service.getAllCardContracts();
	}	
	
	@ApiOperation(value = "get data of a specific dummy contract using contract ID")
	@ApiResponses(value= {
			@ApiResponse(code = 400, message = "Bad Request!!. Please Check your URL"),
			@ApiResponse(code = 200, message = "OK! record fetched")
	})
	@GetMapping(value = "/{id}", produces = "application/json")
	public DummyCardContract getOneDummyContract(@PathVariable("id") String Id)
	{
		return service.getOneCardContract(Id);
	}
	
	@ApiOperation("post a new Dummy card contract through Request Body")
	@ApiResponses(value= {
			@ApiResponse(code = 201, message = "No content as response!!. Record succesfully created"),
			@ApiResponse(code = 500, message = "Internal error! our bad so sorry")
	})
	@PostMapping
	public 	ResponseEntity<DummyCardContract> postoneCustomer(@RequestBody DummyCardContract dummyCardContract)
	{ 
		return service.postDummyCardContract(dummyCardContract);	 
	}
	
	
	@ApiOperation("update an already created dummy card contract record using contract ID")
	@ApiResponses(value= {
			@ApiResponse(code = 204, message = "No Content as response!!. Record succesfully updated"),
			@ApiResponse(code = 500, message = "Internal error! our bad so sorry")
	})
	@PutMapping("/{id}")
	public ResponseEntity<DummyCardContract> updateDummyContract(@RequestBody DummyCardContract dummyCardContract,@PathVariable String id )
	{
		return service.updateDummyCardContractByID(dummyCardContract, id);
	}
	
	@ApiOperation("delete an already created dummy card contract record using contract id")
	@ApiResponses(value= {
			@ApiResponse(code = 204, message = "No content!!. Record succesfully deleted"),
			@ApiResponse(code = 500, message = "Internal error! our bad so sorry")
	})
	@DeleteMapping("/{id}")
	public ResponseEntity<DummyCardContract> deleteDummyContract(@PathVariable("id") String ID)
	{
		return service.deleteDummyCardContractByID(ID);
	}
}