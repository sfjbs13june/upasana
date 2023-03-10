package com.mongo.app.controller;

import com.mongo.app.model.Hospital;
import com.mongo.app.model.Patient;
import com.mongo.app.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Patient create(@RequestBody Patient patient) {
        patient = patientRepository.save(patient);
        return patient;
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public List<Patient> readPatient() {
        return patientRepository.findAll();
    }

    @RequestMapping(value = "/read/{name}", method = RequestMethod.GET)
    public Patient readByNamePatient(@PathVariable("name") String name) {
        return patientRepository.findByName(name);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateDoctor(@RequestParam String name, @RequestParam String disease)
    {
        Patient patient = patientRepository.findByName(name);
        patient.setDisease(disease);
        patientRepository.save(patient);

    }

    @RequestMapping(value="/delete", method = RequestMethod.DELETE)
    public void deleteByName(@RequestParam String name)
    {
        patientRepository.deleteByname(name);
    }
}


