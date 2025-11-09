package com.minyk.test.lazybird.controller.healthcheck;

import com.minyk.test.lazybird.LazyBirdApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Healthcheck.class)
@ContextConfiguration(classes = LazyBirdApplication.class)
public class HealthcheckTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void healthcheckReturnsOk() throws Exception {
        mvc.perform(get("/healthcheck"))
                .andExpect(status().isOk())
                .andExpect(content().string("OK"));
    }
}
