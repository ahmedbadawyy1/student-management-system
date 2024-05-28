package com.aaa.sys.service.impl;

import com.aaa.sys.model.Students;
import com.aaa.sys.repo.StudentRepo;
import com.aaa.sys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public Students getStudent(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public List<Students> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Students saveStudent(Students student) {
        return studentRepo.save(student);
    }

    @Override
    public Students updateStudent(Students student) {
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
