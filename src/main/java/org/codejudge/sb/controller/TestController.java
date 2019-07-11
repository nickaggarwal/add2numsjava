package org.codejudge.sb.controller;

import java.io.IOException;

import org.codejudge.sb.dto.InputDTO;
import org.codejudge.sb.dto.OutputDTO;
import org.codejudge.sb.service.IOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

	@Autowired
	IOperation operation;
	
	@GetMapping("/")
	@ResponseBody 
	public String test() throws IOException {
		return "Hello Docker world!";
	}

	@PostMapping("/api/add")
	public ResponseEntity<OutputDTO> add(
			@RequestBody InputDTO inputDTO
	) throws Exception{
		OutputDTO outputDTO = new OutputDTO();
		outputDTO.setSum(operation.addNumber(inputDTO.getNumber1(), inputDTO.getNumber2()));
	return new ResponseEntity<OutputDTO>(outputDTO, HttpStatus.OK);
	}
}
