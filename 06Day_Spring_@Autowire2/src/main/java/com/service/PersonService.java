package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.PersonDAO;
import com.dto.Person;

public class PersonService {
	
	@Autowired
	private PersonDAO dao;
	

	public List<Person> list(){
		
		return dao.list();
	}
}
