package com.sanitas.service;

import com.sanitas.dto.RequestDTO;

public interface CalculateService {
	
	/**
     * Perfom calculator operation
     * @param request
     *
     */
    Integer operate(final RequestDTO request);

}
