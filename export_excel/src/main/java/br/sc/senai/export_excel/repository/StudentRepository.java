package br.sc.senai.export_excel.repository;

import br.sc.senai.export_excel.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
