package br.ufc.minicurso.school.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.ufc.minicurso.school.model.Student;

@Repository
public interface StudentRepository extends CrudRepository <Student, Long> {
}
