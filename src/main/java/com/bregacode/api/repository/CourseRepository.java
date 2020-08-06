package com.bregacode.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bregacode.api.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
