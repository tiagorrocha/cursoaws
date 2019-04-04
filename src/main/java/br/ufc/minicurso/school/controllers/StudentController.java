package br.ufc.minicurso.school.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.minicurso.school.model.Student;
import br.ufc.minicurso.school.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Student addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return student;
	}

}
