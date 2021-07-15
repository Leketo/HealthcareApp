package com.swnat.service;


import com.swnat.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatienceService {

    @Autowired
    private PatientRepository patientRepository;
}
