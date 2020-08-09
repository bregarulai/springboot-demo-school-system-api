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

	private Curriculum curriculum;

	public List<Curriculum> listCurriculum() {
		return repo.findAll();
	}
	
	public Curriculum findCurriculumByName(String name) {
		
		return repo.findByName(name);
	}

	public Curriculum addCurriculum(String name) {
		this.curriculum = new Curriculum();
		this.curriculum.setName(name);
		return repo.save(this.curriculum);
		
	}

}
