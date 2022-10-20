package com.generalinsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generalinsurance.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}