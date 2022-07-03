package pingwit.homework_29.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import pingwit.homework_29.dto.TonometrDto;

import static pingwit.homework_29.entity.TonometrProducer.OMRON;

@AutoConfigureMockMvc
@SpringBootTest
class OrderControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void makeOrder() throws Exception {
        //Given
        String path = "/tonometr/order";

        TonometrDto tonometrDto = new TonometrDto(2L, OMRON.name(), 112);

        MockHttpServletRequestBuilder order = MockMvcRequestBuilders
                .post(path)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(tonometrDto));

        String expected = "pingwit.homework_29.entity.TonometrOrder";
        //When
        MvcResult mvcResult = mockMvc.perform(order)
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andReturn();
        //Then
        String actual = mvcResult.getResponse().getContentAsString();
        Assertions.assertTrue(actual.contains(expected));
    }

    @Test
    void popular() throws Exception {
        //Given
        String path = "/tonometr/order/popular";
        MockHttpServletRequestBuilder getPopular = MockMvcRequestBuilders
                .get(path)
                .contentType(MediaType.APPLICATION_JSON);

        String expected = "pingwit.homework_29.entity.Tonometr";
        //When
        MvcResult mvcResult = mockMvc.perform(getPopular)
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andReturn();

        //Then
        Assertions.assertEquals(expected, mvcResult.getResponse().getContentAsString());
    }
}