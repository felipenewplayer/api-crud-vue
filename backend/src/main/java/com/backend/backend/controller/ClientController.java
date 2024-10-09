package com.backend.backend.controller;

import com.backend.backend.model.Patient;
import com.backend.backend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    //service

    @Autowired
    private PatientService patientService;

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World";
    }

    //add patient
    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
        return "Patient Added Successfully...";
    }

    //getPatientByID
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable("id") Long id){
        return patientService.getPatientById(id);
    }

    //getPatients
    @GetMapping("/patients")
    public List<Patient> getPatients(){
    return patientService.getPatient();
    }

    //updatPatient
    @PutMapping("/patient")
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    //deleltePatientById
    @DeleteMapping("/patient/{id}")
    public String deletePatient(@PathVariable("id") Long id){
        patientService.deletePatient(id);
        return "Patient Deleted";

    }
}
