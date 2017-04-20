package com.service;

import java.util.List;

import com.dao.BoardDAO;
import com.dao.PersonDAO;
import com.dto.Person;

public class MyService {
	
	private BoardDAO dao;

	public BoardDAO getDao() {
		return dao;
	}

	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	public List<String> listBoard(){
		return dao.list();
	}
	
	
	private PersonDAO dao2;

	public PersonDAO getDao2() {
		return dao2;
	}

	public void setDao2(PersonDAO dao2) {
		this.dao2 = dao2;
	}

	public List<Person> listPerson(){
		PersonDAO dao2 = new PersonDAO();
		return dao2.list();
	}
}
