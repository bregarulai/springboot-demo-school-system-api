package com.bregacode.api.model;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class CourseCode {
	
	@EmbeddedId
	private CurriculumCourseKey id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("course_id")
	@JoinColumn(name = "course_id")
	private Course course;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@MapsId("curriculum_id")
	@JoinColumn(name = "curriculum_id")
	private Curriculum curriculum;
	
	int code;
}
