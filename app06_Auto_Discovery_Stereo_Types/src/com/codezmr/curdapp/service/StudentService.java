package com.codezmr.curdapp.service;

import com.codezmr.curdapp.dto.Student;

public interface StudentService {
	public String addStudent(Student student);
	public String searchStudent(String sid);
	public String updateStudent(Student student);
	public String deleteStudent(String sid);
	
}
