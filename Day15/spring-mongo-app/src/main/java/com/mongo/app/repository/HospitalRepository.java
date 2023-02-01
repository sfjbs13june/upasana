package com.mongo.app.repository;

import com.mongo.app.model.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HospitalRepository extends MongoRepository<Hospital, String> {

    public Hospital findByName(String name);
    public Hospital findByAddress(String address);
    public void deleteByname(String name);
    public Hospital save(Hospital hospital);
}
