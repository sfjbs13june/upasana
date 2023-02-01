package com.mongo.app.repository;

import com.mongo.app.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {

    public Patient findByName(String name);

    public Patient save(Patient patient);

}
