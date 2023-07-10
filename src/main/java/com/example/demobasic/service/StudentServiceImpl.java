package com.example.demobasic.service;

import com.example.demobasic.converter.StudentConverter;
import com.example.demobasic.dto.StudentDto;
import com.example.demobasic.entity.Student;
import com.example.demobasic.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private StudentConverter studentConverter;

    @Override
    public StudentDto getStudent(Long studentId) {
        Student student = studentRepo.findById(studentId)
                .orElseThrow(() -> new RuntimeException("student with this id does not exist"));

        return studentConverter.convertStudentToDto(student);
    }

    @Override
    public List<StudentDto> getStudents() {
        List<Student> students = studentRepo.findAll();

        return students.stream()
                .map(student -> studentConverter.convertStudentToDto(student))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        Student student = studentConverter.convertDtoToStudent(studentDto);
        Student savedStudent = studentRepo.save(student);

        return studentConverter.convertStudentToDto(savedStudent);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepo.deleteById(studentId);
    }
}
