package com.aaa.sys.service;

import com.aaa.sys.model.Students;

import java.util.List;

public interface StudentService   {

    Students getStudent(Long id);
    List<Students> getAllStudents();
    Students saveStudent(Students student);
    Students updateStudent(Students student);
    void deleteStudent(Long id);
}
