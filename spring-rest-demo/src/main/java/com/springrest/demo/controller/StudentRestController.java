package com.springrest.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.demo.entity.Student;
import com.springrest.demo.exception.StudentNotFoundException;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> students;

	@PostConstruct
	public void loadData() {
		students = new ArrayList<>();
		students.add(new Student("Taher", "Ali"));
		students.add(new Student("Amith", "Kumar"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}

	@GetMapping("/student/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		if (studentId > students.size() || studentId < 0) {
			throw new StudentNotFoundException("Student Id Not Found", new Throwable());
		}
		return students.get(studentId);
	}

}
