package com.relation.relation.repository.onetomany;

import com.relation.relation.entity.onetomany.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
