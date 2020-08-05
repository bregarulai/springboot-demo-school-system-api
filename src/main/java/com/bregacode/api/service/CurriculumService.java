package com.bregacode.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bregacode.api.model.Curriculum;
import com.bregacode.api.repository.CurriculumRepository;

@Service
public class CurriculumService {
	
	@Autowired
	private CurriculumRepository repo;

	public List<Curriculum> listCurriculum() {
		return repo.findAll();
	}

}
