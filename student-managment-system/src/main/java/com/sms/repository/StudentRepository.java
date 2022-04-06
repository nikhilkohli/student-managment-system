package com.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.enity.Student;

public interface StudentRepository extends 	JpaRepository<Student, Long> {

}
