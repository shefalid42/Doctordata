package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.doctor.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}


