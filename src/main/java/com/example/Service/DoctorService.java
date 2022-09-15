package com.example.Service;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctor.Doctor;
import com.example.repository.DoctorRepository;

@Service
public class DoctorService {

		@Autowired
		public DoctorRepository doctorRepo;

	public List<Doctor> getAlldoctors() {
		// TODO Auto-generated method stub
		List<Doctor> Doctor =new ArrayList<>();
		doctorRepo.findAll().forEach(Doctor::add);
		return Doctor;
	}

	public Doctor getDoctor(Integer id) {
		// TODO Auto-generated method stub
	   try
	   {
		return doctorRepo.findById(id).get();
	   }
	   catch(Exception e)
	   {
	  	 return null;
	   }
	}

	public void addDoctor(Doctor Doctor) {
		doctorRepo.save(Doctor);
		// TODO Auto-generated method stub
		
	}

	public void updateDoctor(Integer id, Doctor Doctor) {
		// TODO Auto-generated method stub
		doctorRepo.save(Doctor);
		}

	public void deleteDoctor(Integer id) {
		// TODO Auto-generated method stub
		doctorRepo.deleteById(id);
		}
	}



