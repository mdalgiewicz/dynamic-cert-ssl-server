package com.dalgim.example.sb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mateusz Dalgiewicz on 09.04.2017.
 */
@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class RestApiController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Void> connect() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
