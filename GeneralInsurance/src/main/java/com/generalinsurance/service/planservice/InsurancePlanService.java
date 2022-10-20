package com.generalinsurance.service.planservice;

import java.util.List;


import com.generalinsurance.model.InsurancePlan;

public interface InsurancePlanService {


	public List<InsurancePlan> allInsurancePlan();
	InsurancePlan addPlan(InsurancePlan insurancePlan);
}
