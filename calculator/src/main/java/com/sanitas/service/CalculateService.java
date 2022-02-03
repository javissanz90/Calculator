package com.sanitas.service;

import com.sanitas.dto.RequestDTO;
import com.sanitas.dto.ResponseDTO;

public interface CalculateService {
	
	/**
     * Perfom calculator operation
     * @param request
     *
     */
    ResponseDTO operate(final RequestDTO request);

}
