package com.upasana.app.repository;

import com.upasana.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AppointmentRepository extends MongoRepository<Appointment,String> {

    public Appointment save(Appointment appointment);
    public List<Appointment> findByDoctorName(String doctorName);
    public List<Appointment> findByPatientName(String patientName);

}
