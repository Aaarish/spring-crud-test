package com.example.demobasic.service;

import com.example.demobasic.dto.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto getStudent(Long studentId);

    List<StudentDto> getStudents();

    StudentDto addStudent(StudentDto studentDto);

    void deleteStudent(Long studentId);
}
