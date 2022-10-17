package com.generalinsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generalinsurance.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
