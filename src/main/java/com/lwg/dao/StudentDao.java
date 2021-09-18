package com.lwg.dao;

import com.lwg.domain.Classes;
import com.lwg.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selStudent();

    List<Classes> selClass(Integer id);
}
