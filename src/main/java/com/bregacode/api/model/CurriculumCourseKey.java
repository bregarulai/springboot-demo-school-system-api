package com.bregacode.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Getter
@Setter
public class CurriculumCourseKey implements Serializable {
	
	private static final long serialVersionUID = -7423407856413132890L;
	@Column(name = "curriculum_id")
	long curriculumId;
	@Column(name = "course_id")
	long courseId;

}
