package com.generalinsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generalinsurance.model.Claim;
import com.generalinsurance.model.Vehicle;
import com.generalinsurance.myPackage.MyResourceNotFound;
import com.generalinsurance.repository.UserRegistrationRepository;
import com.generalinsurance.service.claim.claimServiceImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/claim")
public class ClaimController {
	
	@Autowired
	private claimServiceImpl claimService;
	
	@Autowired
	private UserRegistrationRepository userRepo;
//	@PostMapping(value = "/addClaim")
//	public Claim addClaim(@RequestBody Claim claim) {
//		return claimService.add(claim);
//	}
	@PostMapping("addClaim/{userId}")
	public Claim addClaim(@PathVariable int userId,@Validated @RequestBody Claim claim) {
		return userRepo.findById(userId).map(user ->{
			claim.setUser(user);
			return claimService.add(claim);
		}).orElseThrow(() -> new MyResourceNotFound("user", "userId",userId) );
	}
	
	@GetMapping("/listAllClaims")
	public List<Claim> listAll() {
		return claimService.listAll();
	}

	@GetMapping("/getById/{claimId}")
	public Claim getById(@PathVariable int claimId ) {
		return claimService.getById(claimId);
	}
	
	@DeleteMapping("/deleteById/{claimId}")
	public void deleteById(@PathVariable int claimId) {
		claimService.deleteById(claimId);
	}
	
	@PutMapping("/update")
	public Claim update(@RequestBody Claim claim) {
		return claimService.update(claim);
	}
}
