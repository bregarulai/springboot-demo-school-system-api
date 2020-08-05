package com.bregacode.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bregacode.api.model.Curriculum;
import com.bregacode.api.repository.CurriculumRepository;

@Service
public class CurriculumService {
	private CurriculumRepository repo;

	public List<Curriculum> listCurriculum() {
		return repo.findAll();
	}

}
