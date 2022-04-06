package com.sms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sms.enity.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository repo;
	
	

	public StudentServiceImpl(StudentRepository repo) {
		super();
		this.repo = repo;
	}



	@Override
	public List<Student> getAllStudents() {
	
		return repo.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		
		return repo.save(student);
	}



	@Override
	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		return repo.findById(id).get();
		
	}



	@Override
	public void deleteStudentById(Long id) {
		repo.deleteById(id);
		
	}

}
