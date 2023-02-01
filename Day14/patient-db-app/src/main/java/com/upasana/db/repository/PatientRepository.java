package com.upasana.db.repository;

import com.upasana.db.model.Patient;
import org.springframework.data.repository.CrudRepository;


public interface PatientRepository extends CrudRepository<Patient, Integer>
{

}
