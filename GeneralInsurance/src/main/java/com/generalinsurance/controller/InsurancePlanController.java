package com.generalinsurance.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.generalinsurance.model.InsurancePlan;
import com.generalinsurance.myPackage.MyResourceNotFound;
import com.generalinsurance.repository.UserRegistrationRepository;
import com.generalinsurance.service.planservice.InsurancePlanService;
@RestController
@RequestMapping("/insurancePlan")
public class InsurancePlanController {

	@Autowired
	InsurancePlanService planService;
	
	@Autowired
	UserRegistrationRepository userRepo;
	
	
//	@PostMapping("/add")
//	public InsurancePlan addInsurancePlan(@RequestBody InsurancePlan insurancePlan)
//	{
//		return PlanService.addPlan(insurancePlan);
//	}
//	
	@PostMapping("addPlan/{userId}")
	public InsurancePlan addInsurancePlan(@PathVariable int userId,@Validated @RequestBody InsurancePlan plan) {
		return userRepo.findById(userId).map(user ->{
			plan.setUser(user);
			return planService.addPlan(plan);
		}).orElseThrow(() -> new MyResourceNotFound("user", "userId",userId) );
	}
	
	
	@GetMapping("/list")
	public List<InsurancePlan> insurancePlans(){
		return planService.allInsurancePlan();
	}
}
