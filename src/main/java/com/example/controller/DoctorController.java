package com.example.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.UserNotFoundException;
import com.example.Service.DoctorService;
import com.example.doctor.Doctor;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorservice;
	@RequestMapping("/Doctor")
	public List<Doctor> getAllDoctors()
	{
		List<Doctor> Doctor = doctorservice.getAlldoctors();
		
		if(Doctor.size() <= 0)
			throw new UserNotFoundException("Doctor data are not available, please update first.");
			
	  return Doctor;
	}
	@GetMapping("/doctor/{id}")
	public Doctor getDoctor(@PathVariable Integer id)
	{
		Doctor Doctor = doctorservice.getDoctor(id);
		
		if(Doctor ==  null)
			throw new UserNotFoundException("Doctor ID are not present");
			
	  return Doctor;
	}
	@RequestMapping(method =RequestMethod.POST , value="/doctor" )
	public void addDoctor(@RequestBody Doctor Doctor)
	{
		doctorservice.addDoctor(Doctor);
	}
	@RequestMapping(method =RequestMethod.PUT , value="/doctor/{id}" )
	public void updateDoctor(@PathVariable Integer id ,@RequestBody Doctor Doctor)
	{
		doctorservice.updateDoctor(id,Doctor);
	}
	@RequestMapping(method =RequestMethod.DELETE , value="/doctor/{id}" )
	public void DeleteDoctor(@PathVariable Integer id)
	{
		doctorservice.deleteDoctor(id);
	}
}




