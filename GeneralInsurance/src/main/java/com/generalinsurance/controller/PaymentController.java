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

import com.generalinsurance.model.Claim;
import com.generalinsurance.model.Payment;
import com.generalinsurance.myPackage.MyResourceNotFound;
import com.generalinsurance.repository.InsurancePlanRepository;
import com.generalinsurance.service.payment.PaymentServiceImpl;


@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentServiceImpl paymentServiceImpl;
	@Autowired
	InsurancePlanRepository planRepo;
	
	@GetMapping("/list")
	public List<Payment> payments(){
		return paymentServiceImpl.allPayments();
		
	}
	@PostMapping("/add")
	public Payment addPayment(@RequestBody Payment payment) {
		return paymentServiceImpl.addPayment(payment);
	}
	@PostMapping("addPayment/{planId}")
	public Payment addClaim(@PathVariable int planId,@Validated @RequestBody Payment payment) {
		return planRepo.findById(planId).map(plan ->{
			payment.setPlan(plan);
			return paymentServiceImpl.addPayment(payment);
		}).orElseThrow(() -> new MyResourceNotFound("user", "userId",planId) );
	}
	
}