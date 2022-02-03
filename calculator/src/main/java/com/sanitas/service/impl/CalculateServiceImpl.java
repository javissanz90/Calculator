package com.sanitas.service.impl;

import org.springframework.stereotype.Service;

import com.sanitas.dto.RequestDTO;
import com.sanitas.dto.ResponseDTO;
import com.sanitas.exception.ConstantException;
import com.sanitas.service.CalculateService;

import io.corp.calculator.TracerImpl;

@Service
public class CalculateServiceImpl implements CalculateService {
	
	public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String RESULT_MSG = "Result: ";
	
    /**
	 * {@inheritDoc}
	 */
	@Override
    public ResponseDTO operate(RequestDTO request) {

        TracerImpl tracer = new TracerImpl();
        String message;
        Integer result = 0;
        switch(request.getOperation()){
            case ADD:
                result = request.getOp1() + request.getOp2();
                message = RESULT_MSG + result;
                break;
            case SUBTRACT:
                result = request.getOp1() - request.getOp2();
                message = RESULT_MSG + result;
                break;
            default:
                message = ConstantException.OPERATION_NOT_SUPPORTED;
        }

        tracer.trace(result);
        return ResponseDTO.builder().message(message).build();
    }

}
