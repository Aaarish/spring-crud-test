package com.example.demobasic.controller;

import com.example.demobasic.dto.StudentDto;
import com.example.demobasic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{studentId}")
    public StudentDto getStudent(@PathVariable Long studentId) {
        return studentService.getStudent(studentId);
    }

    @PostMapping
    public StudentDto addStudent(@RequestBody StudentDto studentDto) {
        return studentService.addStudent(studentDto);
    }

    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentService.getStudents();
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Long studentId) {
        studentService.deleteStudent(studentId);
    }

}
