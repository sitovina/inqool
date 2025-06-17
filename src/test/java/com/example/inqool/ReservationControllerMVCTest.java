package com.example.inqool;

import com.example.inqool.controller.ReservationController;
import com.example.inqool.model.Customer;
import com.example.inqool.model.GameType;
import com.example.inqool.model.Reservation;
import com.example.inqool.service.CustomerService;
import com.example.inqool.service.ReservationService;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.assertj.core.api.Fail.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ReservationControllerMVCTest {
    @Autowired
    MockMvc mvc;

    @MockitoBean
    ReservationService reservationService;
    @MockitoBean
    CustomerService customerService;

    @Test
    public void testPostReservationCreation() throws Exception {

        fail("servlet does not seem to accept any requests");

        String jsonString = "{\"reservationStart\": \"2020-08-21 00:10:00\",\"reservationEnd\":\"2020-08-21 00:30:00\",\"gameType\": 0,\"reservationCourt\": 1,\"owner\": 2}";

        mvc.perform(post("/api/reservations")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonString)
                )
                .andExpect(status().isOk());



    }
}
