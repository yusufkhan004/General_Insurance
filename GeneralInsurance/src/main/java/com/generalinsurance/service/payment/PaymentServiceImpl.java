package com.generalinsurance.service.payment;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalinsurance.model.Payment;
import com.generalinsurance.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentRepository paymentRepository;
	
	@Override
	public Payment addPayment(Payment payment) {
		 return paymentRepository.save(payment);	
		
	}

	@Override
	public List<Payment> allPayments() {
		return paymentRepository.findAll();
	}

}
