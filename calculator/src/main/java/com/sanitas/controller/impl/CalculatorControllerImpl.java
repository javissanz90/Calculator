package com.sanitas.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.controller.CalculatorController;
import com.sanitas.dto.RequestDTO;
import com.sanitas.dto.ResponseDTO;
import com.sanitas.service.CalculateService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
@Validated
public class CalculatorControllerImpl implements CalculatorController {

	private final CalculateService calculateService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ResponseEntity<ResponseDTO> calculate(@RequestBody final RequestDTO request) {
		log.info("Calculate the {} of {} and {}", request.getOperation(), request.getOp1(), request.getOp2());
		return ResponseEntity.ok(calculateService.operate(request));
	}
}
