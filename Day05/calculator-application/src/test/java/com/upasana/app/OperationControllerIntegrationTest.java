package com.upasana.app;

import com.upasana.app.controller.CalcController;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CalcController.class)

public class OperationControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addTest() throws Exception
    {
        long a = (long) 10.0;
        long b = (long) 20.0;
        ResultActions resultActions = mockMvc.perform(get("/add").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        resultActions.andExpect(status().isOk());
        String result = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        Assertions.assertEquals(result, "30");
    }

    @Test
    public void subTest() throws Exception
    {
        long a = (long) 13.0;
        long b =(long) 9.0;
        ResultActions resultActions = mockMvc.perform(post("/sub").param("a", String.valueOf(a)).param("b", String.valueOf(b)));
        resultActions.andExpect(status().isOk());
        String result = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        Assertions.assertEquals(result,"4");
    }

    @Test
    public void mulTest() throws Exception
    {
        long a = (long) 3.0;
        long b = (long) 6.0;
        ResultActions resultActions = mockMvc.perform(put("/mul").param("a", String.valueOf(a)).param("b",String.valueOf(b)));
        resultActions.andExpect(status().isOk());
        String result = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        Assertions.assertEquals(result,"18");
    }

    @Test
    public void divTest() throws Exception
    {
        long a = (long) 10.0;
        long b = (long) 5.0;
        ResultActions resultActions = mockMvc.perform(delete("/div").param("a",String.valueOf(a)).param("b", String.valueOf(b)));
        String result = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        Assertions.assertEquals(result,"2");
    }

}
