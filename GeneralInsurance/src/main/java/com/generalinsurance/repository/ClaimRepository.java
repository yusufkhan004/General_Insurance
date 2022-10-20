package com.generalinsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generalinsurance.model.Claim;


public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}