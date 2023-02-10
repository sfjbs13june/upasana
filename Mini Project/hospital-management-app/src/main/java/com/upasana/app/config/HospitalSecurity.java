package com.upasana.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.net.http.HttpResponse;

@Configuration
@EnableWebSecurity
public class HospitalSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/doctor/appointment").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.GET, "/doctor/myappointment").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.POST, "/doctor/save").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.POST, "/patient/save").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.GET, "/prescription/saveprescription").hasAnyRole("DOCTOR","PATIENT")
                .antMatchers(HttpMethod.GET, "/prescription/viewprescription").hasAnyRole("DOCTOR","PATIENT")
                .and().csrf().disable().headers()
                .frameOptions().disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("doctor123").password("{noop}password").roles("DOCTOR").and().withUser("patient123")
                .password("{noop}password").roles("PATIENT");
    }

}
