package com.lwg.service;

import com.lwg.domain.Classes;
import com.lwg.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> selStudent();
    List<Classes> selClass(Integer id);
}
