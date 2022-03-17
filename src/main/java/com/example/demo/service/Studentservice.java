package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface Studentservice 
{
   
	public List<Student> getAllStudents();
	
	public void saveStudent(Student student);
	
	public Student getStudentById(int id);
	
	public	Student updateStudent(Student student);
	
	public void deleteStudentById(int id);
}
