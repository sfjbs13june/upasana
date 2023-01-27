package com.upasana.app.controller;

import com.upasana.app.model.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class DoctorController {
    @GetMapping("/get/appointment")

    public List<Appointment> getAppointments(){
        List appointmentList = new ArrayList();

        Appointment ap1 =  new Appointment("101","ABC","DR. WXY","01-01-2023" );
        appointmentList.add(ap1);
        return appointmentList;


    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment);
        return appointment;

    }


}
