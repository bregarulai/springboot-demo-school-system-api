package com.bregacode.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bregacode.api.service.CurriculumService;

@RestController
public class CurriculumController {
	@Autowired
	CurriculumService service;

}
