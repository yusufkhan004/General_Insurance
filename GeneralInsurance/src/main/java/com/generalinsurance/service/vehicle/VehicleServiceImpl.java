package com.generalinsurance.service.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalinsurance.model.Vehicle;
import com.generalinsurance.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService{
 
	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
	    return vehicleRepository.save(vehicle);
		
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		
		return vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle getVehicleById(int vehicleId) {
		
		return vehicleRepository.findById(vehicleId).get();
	}

	@Override
	public List<Vehicle> allVehicle() {
		
		return vehicleRepository.findAll();
	}

}
