package com.upasana.app.repository;

import com.upasana.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

public interface PrescriptionRepository extends MongoRepository<Prescription,String>{
    public Prescription save(Prescription prescription);
    public List<Prescription> findByPatientName(String patientName);
}
