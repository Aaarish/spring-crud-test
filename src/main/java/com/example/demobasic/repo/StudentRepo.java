package com.example.demobasic.repo;

import com.example.demobasic.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    Student findByStudentName(String studentName);
}
