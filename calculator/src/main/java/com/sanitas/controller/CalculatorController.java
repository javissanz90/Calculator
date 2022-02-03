package com.sanitas.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;


@RequestMapping(path = CalculatorController.ROOT_CALCULATOR_ENDPOINT_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public interface CalculatorController {
    public static final String ROOT_CALCULATOR_ENDPOINT_URL = "/calculator";

    /**
     * Allows you to update a user
     *
     * @param request object {UserDTO} to update
     *
     * @return 204 if everything is correct
     */
    @GetMapping
    void calculate();

}
