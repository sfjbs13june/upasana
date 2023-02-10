package com.upasana.app.controller;

import com.upasana.app.model.Appointment;
import com.upasana.app.repository.AppointmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    AppointmentRepository appointmentRepository;
    @RequestMapping(value ="/appointment", method = RequestMethod.GET)
    public List<Appointment> getAppointments(@RequestParam("doctorName") String doctorName)
    {
        return appointmentRepository.findByDoctorName();
    }

    @RequestMapping(value ="/save", method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {
        appointment = appointmentRepository.save(appointment);
        return appointment;
    }
}
