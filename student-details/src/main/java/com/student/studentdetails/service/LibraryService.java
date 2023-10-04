package com.student.studentdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.studentdetails.entity.LibraryEntity;
import com.student.studentdetails.repository.LibraryRepo;

import java.util.ArrayList;
import java.util.List;
	@Service
	public class LibraryService {
	    @Autowired
	    LibraryRepo libraryrepo ;
	    public List<LibraryEntity> getAllBooks() {
	    	List<LibraryEntity> libraryEntityList = (List<LibraryEntity>) libraryrepo.findAll();
	        return libraryEntityList;
	    }

	    public void saveOrUpdate(LibraryEntity libraryEntity) {
	        libraryrepo.save(libraryEntity);
	    }

	    public void delete(int id) {
	        libraryrepo.deleteById(id);
	    }

	    public LibraryEntity getBookById(int id) {
	        return libraryrepo.findById(id).get();
	    }
	}


