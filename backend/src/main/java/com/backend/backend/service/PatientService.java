package com.backend.backend.service;

import com.backend.backend.model.Patient;
import com.backend.backend.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    public Patient addPatient(Patient patient);
    public  Patient getPatientById(long id);
    public List<Patient> getPatient();
    public void deletePatient(long id);
    public Patient updatePatient(Patient patient);
}
