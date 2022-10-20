package com.generalinsurance.service.claim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalinsurance.model.Claim;
import com.generalinsurance.repository.ClaimRepository;

@Service
public class claimServiceImpl implements claimService {
	
	@Autowired
	ClaimRepository claimRepository;
	
	@Override
	public Claim add(Claim claim) {
		return claimRepository.save(claim);
	}

	public List<Claim> listAll(){
		return claimRepository.findAll();
	}

	@Override
	public Claim getById(int claimId) {
		return claimRepository.findById(claimId).get();
	}

	@Override
	public void deleteById(int claimId) {
		claimRepository.deleteById(claimId);
		
	}

	@Override
	public Claim update(Claim claim) {
		return claimRepository.save(claim);
	}
	
	
	
}
