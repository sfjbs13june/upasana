package controller;

import com.upasana.app.controller.CalcController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(CalcController.class)

public class OperationControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

}
