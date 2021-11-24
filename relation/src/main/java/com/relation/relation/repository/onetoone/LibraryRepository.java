package com.relation.relation.repository.onetoone;

import com.relation.relation.entity.onetoone.Library;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
