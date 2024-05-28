package com.aaa.sys.controller;

import com.aaa.sys.model.Students;
import com.aaa.sys.service.StudentService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {
        Students students = new Students();
        model.addAttribute("students", students);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("students") Students students) {
        studentService.saveStudent(students);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String updateStudent(@PathVariable Long id, Model model) {
        model.addAttribute("students", studentService.getStudent(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("students") Students students, Model model) {

        Students existing = studentService.getStudent(id);
        existing.setId(id);
        existing.setFristName(students.getFristName());
        existing.setLastName(students.getLastName());
        existing.setEmail(students.getEmail());
        studentService.updateStudent(existing);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

}
