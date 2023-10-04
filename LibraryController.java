package com.student.studentdetails.controller;

import com.student.studentdetails.entity.LibraryEntity;
import com.student.studentdetails.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

	@RestController
	public class LibraryController {

	    @Autowired
	    LibraryService libraryservice;
	    @GetMapping("/getbooks")
	    private List<LibraryEntity> getAllBooks()
	    {
		return libraryservice.getAllBooks();
	    }

	    @PostMapping("/saving")
	    private int saveBook(@RequestBody LibraryEntity libraryEntity){

	    libraryservice.saveOrUpdate(libraryEntity);
	    return libraryEntity.getId();
	    }

	    @DeleteMapping("/delete/{id}")
	    private void deleteLibraryBook(@PathVariable("id")int id){
	    libraryservice.delete(id);

	    }
	    @GetMapping("/getbook/{id}")
	    private LibraryEntity getbook(@PathVariable("id")int id){

	    return libraryservice.getBookById(id);
	    }

	    

	}


