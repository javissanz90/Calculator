package com.sanitas.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.sanitas.exception.ConstantException;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestDTO {

    @NotEmpty(message = ConstantException.OPERATION_MANDATORY)
    private String operation;
    
    @NotNull(message = ConstantException.OPERATOR1_MANDATORY)
    private Integer op1;
    
    @NotNull(message = ConstantException.OPERATOR2_MANDATORY)
    private Integer op2;
}
