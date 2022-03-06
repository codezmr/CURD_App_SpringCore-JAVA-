package com.codezmr.curdapp.controller;

import com.codezmr.curdapp.dto.Student;

public interface StudentController {
	public String addStudent(Student student);
	public String searchStudent(String sid);
	public String updateStudent(Student student);
	public String deleteStudent(String sid);
}
