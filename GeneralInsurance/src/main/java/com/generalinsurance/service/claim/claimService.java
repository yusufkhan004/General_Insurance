package com.generalinsurance.service.claim;

import java.util.List;


import com.generalinsurance.model.Claim;


public interface claimService {
	public Claim add(Claim claim) ;
	public List<Claim> listAll();
	public Claim getById(int claimId);
	public void deleteById(int claimId);
	public Claim update(Claim claim);
}
