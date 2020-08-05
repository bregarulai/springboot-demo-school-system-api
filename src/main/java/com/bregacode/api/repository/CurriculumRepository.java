package com.bregacode.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bregacode.api.model.Curriculum;

@Repository
interface CurriculumRepository extends JpaRepository<Curriculum, Long> {

}
