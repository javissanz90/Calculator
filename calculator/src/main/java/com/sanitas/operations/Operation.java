package com.sanitas.operations;

import com.sanitas.dto.RequestDTO;


public abstract class Operation {
    public abstract Integer calculate(final RequestDTO request);
}
