package com.dao;

import java.util.Arrays;
import java.util.List;

import com.dto.Person;

public class PersonDAO {

	public List<Person> list(){
		return Arrays.asList(new Person("결명자", 20), new Person("유자차", 44), new Person("감잎차", 20));
	}
}
