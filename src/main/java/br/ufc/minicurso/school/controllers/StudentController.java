package br.ufc.minicurso.school.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String getStudents() {
		return "Student Api";
	}
}
