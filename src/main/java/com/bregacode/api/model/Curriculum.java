package com.bregacode.api.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Curriculum implements Serializable{

	private static final long serialVersionUID = 3557751050027405097L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	//@OneToMany(mappedBy = "curriculum",cascade = CascadeType.ALL)
	 @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	    @JoinTable(name = "curriculums_courses",
	            joinColumns = {
	                    @JoinColumn(name = "curriculum_id", referencedColumnName = "id")},
	            inverseJoinColumns = {
	                    @JoinColumn(name = "course_id", referencedColumnName = "id")})
	private final Set<Course> courses = new HashSet<>();
	

}
