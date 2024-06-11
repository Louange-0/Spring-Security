package com.codebase.my_security.services;

import com.codebase.my_security.entity.Student;
import com.codebase.my_security.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public void addStudent(Student st) {
        repo.save(st);
    }
}

