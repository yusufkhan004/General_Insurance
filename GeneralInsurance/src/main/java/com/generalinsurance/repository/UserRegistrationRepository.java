package com.generalinsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generalinsurance.model.User;
@Repository
public interface UserRegistrationRepository extends JpaRepository<User, Integer>{

	public User findByEmail(String email);

	public User findByEmailAndPassword(String tempEmail, String tempPass);



}
