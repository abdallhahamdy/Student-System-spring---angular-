package com.spring.student.service;

import com.spring.student.dao.StudentRepository;
import com.spring.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public Student getStudentById (Long id){
        return studentRepository.findById(id).get();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public Student editStudent(Student student){
        return studentRepository.save(student);
    }

    public void removeStudent(@RequestParam Long id){
        studentRepository.deleteById(id);
    }
}