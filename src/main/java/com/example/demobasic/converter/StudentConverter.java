package com.example.demobasic.converter;

import com.example.demobasic.dto.StudentDto;
import com.example.demobasic.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {

    public StudentDto convertStudentToDto(Student student) {
        StudentDto studentDto = new StudentDto();

        studentDto.setStudentId(student.getStudentId());
        studentDto.setStudentName(student.getStudentName());
        studentDto.setStudentRollNo(student.getStudentRollNo());
        studentDto.setStudentAddress(student.getStudentAddress());
        studentDto.setUsername(student.getUsername());

        return studentDto;
    }

    public Student convertDtoToStudent(StudentDto studentDto) {
        Student student = new Student();

        student.setStudentId(studentDto.getStudentId());
        student.setStudentName(studentDto.getStudentName());
        student.setStudentRollNo(studentDto.getStudentRollNo());
        student.setStudentAddress(studentDto.getStudentAddress());
        student.setUsername(studentDto.getUsername());

        return student;
    }
}
