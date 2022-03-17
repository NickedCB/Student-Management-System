package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Student;
@Service
public class Studentserviceimpl implements Studentservice
{
	@Autowired
	private StudentRepository dao;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void saveStudent(Student student) {
		
		 dao.save(student);
	}

	
	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		dao.deleteById(id);
	}

	
}
