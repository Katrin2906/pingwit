package pingwit.homework_29.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static java.util.Objects.requireNonNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@AutoConfigureMockMvc
@SpringBootTest
class OrderControllerIT2 {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void makeOrder() throws Exception {

        MvcResult response = (MvcResult) mockMvc.perform(MockMvcRequestBuilders.post("/tonometr/order")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"1L\":\"123\"}"))
                .andExpect(MockMvcResultMatchers.status().isBadRequest());

        String message = requireNonNull(response.getResolvedException(), "No message").getMessage();
        assertTrue(message.contains("default message [name]"));

    }
}