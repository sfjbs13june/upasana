package com.upasana.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest({CalculatorController.class})
public class CalculatorAppIntegrationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCalculatorAdd() throws Exception{
        String a = "10.0";
        String b = "20.0";

        ResultActions responseEntity  = mockMvc.perform(get("/add").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("30.0", result);
    }

    @Test
    public void testCalculatorSub() throws Exception{
        String a = "10.0";
        String b = "20.0";

        ResultActions responseEntity  = mockMvc.perform(get("/sub").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("-10.0", result);
    }

    @Test
    public void testCalculatorMultiply() throws Exception{
        String a = "10.0";
        String b = "20.0";

        ResultActions responseEntity  = mockMvc.perform(get("/multiply").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("200.0", result);
    }

    @Test
    public void testCalculatorDivide() throws Exception{
        String a = "40.0";
        String b = "20.0";

        ResultActions responseEntity  = mockMvc.perform(get("/divide").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("2.0", result);
    }

}
