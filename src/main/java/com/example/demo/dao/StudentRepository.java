package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Student;
@RepositoryRestResource(path="stu")
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
