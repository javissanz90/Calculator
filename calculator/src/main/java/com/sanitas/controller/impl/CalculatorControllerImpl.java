package com.sanitas.controller.impl;

import com.sanitas.controller.CalculatorController;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorControllerImpl implements CalculatorController {


    /**
     * {@inheritDoc}
     */
    @Override
    public void calculate() {
        System.out.print("Hellow World");
    }
}
