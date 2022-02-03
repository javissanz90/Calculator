package com.sanitas.operations;

import com.sanitas.dto.RequestDTO;
import com.sanitas.dto.ResponseDTO;

public abstract class Operation {
    protected final String MESSAGE = "Result: ";
    public abstract ResponseDTO calculate(final RequestDTO request);
}
