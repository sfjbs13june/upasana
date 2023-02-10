package com.upasana.app;

import com.upasana.app.model.Prescription;
import com.upasana.app.model.PrescriptionController;
import com.upasana.app.repository.PrescriptionRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrescriptionControllerTest {
    @InjectMocks
    PrescriptionController prescriptionController;

    @Mock
    PrescriptionRepository prescriptionRepository;

    @Mock
    Prescription prescription;
    @BeforeEach
    void setUp(){
        prescription = Mockito.mock(Prescription.class);
        PrescriptionRepository = Mockito.mock(PrescriptionRepository.class);
    }

    @Test
    public void getAllPrescriptionTest(){
        List list = new ArrayList();
        when(prescriptionRepository.findByPatientName(anyString())).thenReturn(list);
        List result = prescriptionController.getAllPrescription("ABC");
        assertEquals(list,result);
    }

    @Test
    public voidSavePrescription(){
        Prescription prescription1 = new Prescription();
        when(prescriptionRepository.save(any(Prescription.class))).thenReturn(prescription1);
        Prescription result = prescriptionController.savePrescription(prescription);

        assertEquals(prescription1,result);
    }

}
