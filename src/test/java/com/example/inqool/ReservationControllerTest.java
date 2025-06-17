package com.example.inqool;

import com.example.inqool.controller.ReservationController;
import com.example.inqool.model.GameType;
import com.example.inqool.model.Reservation;
import com.example.inqool.service.ReservationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReservationControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void testCourtByIDSuccess() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/reservations/court/1", String.class)
                .contains("\"reservationStart\":\"2020-08-20T22:00:00.000+00:00\",\"reservationEnd\":\"2020-08-20T23:00:00.000+00:00\""));
    }

    @Test
    void testCourtByIDFailure() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/reservations/court/1547", String.class).isEmpty());
    }

}
