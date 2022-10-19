package com.generalinsurance.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generalinsurance.model.Vehicle;
import com.generalinsurance.myPackage.MyResourceNotFound;
import com.generalinsurance.repository.UserRegistrationRepository;
import com.generalinsurance.service.VehicleService;



@RestController
@RequestMapping("/Vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@Autowired
	private UserRegistrationRepository userRepo;
	
//	@PostMapping("/addVehicle")
//	public  Vehicle addVehicle(@RequestBody Vehicle vehicle) {
//		
//		return vehicleService.addVehicle(vehicle);
		//String body = "Vehicle saved with Id : " + insurance.getVehicleId();
		//return ResponseEntity.ok(body);
		
//	}
	
	@PostMapping("addVehicle/{userId}")
	public Vehicle getVehicle(@PathVariable int userId,@Validated @RequestBody Vehicle veh) {
		return userRepo.findById(userId).map(user ->{
			veh.setUser(user);
			return vehicleService.addVehicle(veh);
		}).orElseThrow(() -> new MyResourceNotFound("user", "userId",userId) );
	}

	
	@GetMapping("/showallVehicle")
	public List<Vehicle> allUser(){
		return vehicleService.allVehicle();
		
	}
	
	@GetMapping(value = "/{vehicleId}")
	public Vehicle getVehicleById(@PathVariable int vehicleId) {
		return vehicleService.getVehicleById(vehicleId);
	}
	
	@PutMapping(value = "/UpdateVehicle/{vehicleId}")
	public Vehicle updateVehicle(@PathVariable int vehicleId, @RequestBody Vehicle vehicle) {
		vehicle.setVehicleId(vehicleId);
		return vehicleService.updateVehicle(vehicle);
	}
}
