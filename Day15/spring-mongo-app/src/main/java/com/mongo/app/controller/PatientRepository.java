package com.mongo.app.controller;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {

    public Patient findByName(String name);

    public Patient save(Patient patient);

}
