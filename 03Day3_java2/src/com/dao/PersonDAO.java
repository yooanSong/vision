package com.dao;

import java.util.Arrays;
import java.util.List;

import com.dto.Person;

public class PersonDAO {

	public List<Person> list(){
		return Arrays.asList(new Person("�����", 20), new Person("������", 44), new Person("������", 20));
	}
}
