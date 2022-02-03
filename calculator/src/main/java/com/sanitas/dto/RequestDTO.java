package com.sanitas.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

import com.sanitas.exception.ConstantException;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestDTO {

    @NotNull(groups = { CreateValidationGroup.class}, message = ConstantException.OPERATION_MANDATORY)
    private String operation;
    
    @NotNull(groups = { CreateValidationGroup.class}, message = ConstantException.OPERATOR1_MANDATORY)
    private Integer op1;
    
    @NotNull(groups = { CreateValidationGroup.class}, message = ConstantException.OPERATOR2_MANDATORY)
    private Integer op2;

    public static interface CreateValidationGroup extends Default {
        /* Validation group */ }
}
