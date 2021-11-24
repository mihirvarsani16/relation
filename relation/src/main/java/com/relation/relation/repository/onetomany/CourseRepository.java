package com.relation.relation.repository.onetomany;

import com.relation.relation.entity.onetomany.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    public Course findByCid(int id);
}
