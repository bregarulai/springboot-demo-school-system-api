package com.bregacode.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bregacode.api.model.Curriculum;
import com.bregacode.api.service.CurriculumService;

@RestController
@RequestMapping("/api")
public class CurriculumController {
	@Autowired
	CurriculumService service;
	
	@GetMapping("/curriculums")
	public List<Curriculum> listCurriculums() {
		return service.listCurriculum();
	}

}
