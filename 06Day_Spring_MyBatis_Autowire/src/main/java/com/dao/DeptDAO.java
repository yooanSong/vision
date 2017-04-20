package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.entity.DeptDTO;

public class DeptDAO {

	@Autowired
	private SqlSessionTemplate template;

	public void insert(DeptDTO dto){
		int n = template.insert("bbb", dto);
	}
	public List<DeptDTO> select(){
		
		return template.selectList("all");
		
	}
	
}




