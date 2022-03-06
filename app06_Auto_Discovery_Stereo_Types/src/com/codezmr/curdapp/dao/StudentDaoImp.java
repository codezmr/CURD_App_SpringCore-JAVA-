package com.codezmr.curdapp.dao;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.codezmr.curdapp.dto.Student;

//@Component("studentDao")
@Repository("studentDao")
public class StudentDaoImp implements StudentDao {

	@Override
	public String add(Student student) {
		
		return null;
	}

	@Override
	public String search(String sid) {
		return null;
	}

	@Override
	public String update(Student student) {
		return null;
	}

	@Override
	public String delete(String sid) {
		return null;
	}

}
