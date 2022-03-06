package com.codezmr.curdapp.dao;

import com.codezmr.curdapp.dto.Student;

public interface StudentDao {
	
	public String add(Student student);
	public String search(String sid);
	public String update(Student student);
	public String delete(String sid);
}
