package com.mongo.app.controller;

import com.mongo.app.model.Hospital;
import com.mongo.app.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/hospital")

public class HospitalController {
    @Autowired
    HospitalRepository hospitalRepository;

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public Hospital create(@RequestBody Hospital hospital)
    {
        hospital=hospitalRepository.save(hospital);
        return hospital;
    }
    @RequestMapping(value="/read", method = RequestMethod.GET)
    public List<Hospital> readHospital()
    {
        return hospitalRepository.findAll();
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateDoctor(@RequestParam String name, @RequestParam String doctorName)
    {
        Hospital hospital = hospitalRepository.findByName(name);
        hospital.setDoctorName(doctorName);
        hospitalRepository.save(hospital);

    }

    @RequestMapping(value="/delete", method = RequestMethod.DELETE)
    public void deleteByName(@RequestParam String name)
    {
        hospitalRepository.deleteByname(name);
    }


}
