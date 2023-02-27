package br.sc.senai.export_excel.service;

import br.sc.senai.export_excel.entities.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    List< Student > getTheListStudent();
}
