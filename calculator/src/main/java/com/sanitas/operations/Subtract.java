package com.sanitas.operations;

import com.sanitas.dto.RequestDTO;

public class Subtract extends Operation {
	@Override
	public Integer calculate(RequestDTO request) {
		return request.getOp1() - request.getOp2();
	}
}
