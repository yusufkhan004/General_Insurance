package com.generalinsurance.service.vehicle;

import java.util.List;

import com.generalinsurance.model.Vehicle;


public interface VehicleService {
	
	public Vehicle addVehicle(Vehicle vehicle);
	public Vehicle updateVehicle(Vehicle vehicle);
	public Vehicle getVehicleById(int insuranceId);
	public List<Vehicle> allVehicle();
	
	

}
