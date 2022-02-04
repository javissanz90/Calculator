package com.sanitas.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanitas.dto.RequestDTO;
import com.sanitas.dto.ResponseDTO;


@RequestMapping(path = CalculatorController.ROOT_CALCULATOR_ENDPOINT_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public interface CalculatorController {
    public static final String ROOT_CALCULATOR_ENDPOINT_URL = "/calculator";

    /**
     * Allows you to calculate
     *
     * @param request object {RequestDTO} to calculate
     *
     * @return Object {ResponseDTO}
     */
    @GetMapping
    ResponseEntity<ResponseDTO> calculate(@RequestBody final RequestDTO request);

}
