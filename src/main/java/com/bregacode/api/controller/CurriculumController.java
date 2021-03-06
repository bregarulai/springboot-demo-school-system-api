package com.bregacode.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bregacode.api.model.Curriculum;
import com.bregacode.api.service.CurriculumService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CurriculumController {
	@Autowired
	CurriculumService service;
	
	@GetMapping("/curriculums")
	public List<Curriculum> listCurriculums() {
		return service.listCurriculum();
	}
	
	@GetMapping("/curriculum")
	public Curriculum showACurriculum(@RequestParam String name) {
	
		return  service.findCurriculumByName(name);
	}
	
	@PostMapping("/addCurriculum")
	public Curriculum addCurriculum(@RequestBody String name) {
		return this.service.addCurriculum(name);
	}

}
