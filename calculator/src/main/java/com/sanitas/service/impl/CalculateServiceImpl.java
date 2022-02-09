package com.sanitas.service.impl;

import java.util.function.Supplier;

import org.springframework.stereotype.Service;

import com.sanitas.dto.RequestDTO;
import com.sanitas.operations.Operation;
import com.sanitas.service.CalculateService;
import com.sanitas.utility.OperationSearch;

@Service
public class CalculateServiceImpl implements CalculateService {
	
    /**
	 * {@inheritDoc}
	 */
	@Override
    public Integer operate(RequestDTO request) {
        Supplier<Operation> op = OperationSearch.supplyOperation(request.getOperation());
        return op.get().calculate(request);
    }

}
