package br.ufc.minicurso.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.minicurso.school.model.Student;
import br.ufc.minicurso.school.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	public Student addStudent(Student student) {
		studentRepository.save(student);
		return student;
	}

	public Iterable<Student> getStudents() {
		return studentRepository.findAll();
	}

}
