package com.student.studentdetails.repository;

import com.student.studentdetails.entity.LibraryEntity;

import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.repository.CrudRepository;

	public interface LibraryRepo extends CrudRepository<LibraryEntity,Integer> {

	}



