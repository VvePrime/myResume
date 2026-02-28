package com.vivek.myresume.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.myresume.dtos.CandidateDTO;
import com.vivek.myresume.services.CandidateService;

@RestController
@RequestMapping("api/v1")
public class CandidateController {
	
	@Autowired
	CandidateService candidateService;
	
	@PostMapping("/create-candidate")
	public ResponseEntity<String> createCandidate(@RequestBody CandidateDTO candidateDto){
		candidateService.createCandidate(candidateDto);
		return new ResponseEntity<>("Candidate Added",HttpStatus.CREATED);
	}

}
