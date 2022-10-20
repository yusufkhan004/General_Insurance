package com.generalinsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generalinsurance.model.InsurancePlan;

public interface InsurancePlanRepository extends JpaRepository<InsurancePlan, Integer>{

}
