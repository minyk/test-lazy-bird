package com.minyk.test.lazybird.controller.healthcheck;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {

    @GetMapping("/healthcheck")
    public ResponseEntity<Void> healthcheck() {
        return ResponseEntity.ok().build();
    }
}
