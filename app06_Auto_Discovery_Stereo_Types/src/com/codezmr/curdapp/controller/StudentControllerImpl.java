package com.codezmr.curdapp.controller;

import org.springframework.stereotype.Controller;

import com.codezmr.curdapp.dto.Student;

@Controller("studentController")
public class StudentControllerImpl implements StudentController {

	@Override
	public String addStudent(Student student) {
		return null;
	}

	@Override
	public String searchStudent(String sid) {
		return null;
	}

	@Override
	public String updateStudent(Student student) {
		return null;
	}

	@Override
	public String deleteStudent(String sid) {
		return null;
	}

}
