package com.sanitas.operations;

import com.sanitas.dto.RequestDTO;
import com.sanitas.dto.ResponseDTO;
import com.sanitas.utility.Constant;

public class Subtract extends Operation{
    @Override
    public ResponseDTO calculate(RequestDTO request) {
        return ResponseDTO.builder().message(Constant.MESSAGE + (request.getOp1() - request.getOp2())).build();
    }
}
