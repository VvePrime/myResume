package com.vivek.myresume.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.myresume.dtos.CandidateDTO;
import com.vivek.myresume.entities.Candidate;
import com.vivek.myresume.repositories.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService{
	
	@Autowired
	CandidateRepository candidateRepository;

	@Override
	public String createCandidate(CandidateDTO candidateDto) {
		// TODO Auto-generated method stub
		Candidate candidate = new Candidate(candidateDto.getName(), candidateDto.getEmail(), candidateDto.getSummary(), candidateDto.getExperienceInMonths());
		candidateRepository.save(candidate);
		return null;
	}

}
