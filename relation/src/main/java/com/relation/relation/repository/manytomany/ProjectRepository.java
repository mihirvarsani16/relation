package com.relation.relation.repository.manytomany;

import com.relation.relation.entity.manytomany.Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
