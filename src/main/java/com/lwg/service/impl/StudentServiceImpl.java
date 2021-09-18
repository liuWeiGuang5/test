package com.lwg.service.impl;

import com.lwg.dao.StudentDao;
import com.lwg.domain.Classes;
import com.lwg.domain.Student;
import com.lwg.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao dao;

    public StudentServiceImpl() {
    }

    public StudentServiceImpl(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> selStudent() {
        return dao.selStudent();
    }

    @Override
    public List<Classes> selClass(Integer id) {
        return dao.selClass(id);
    }
}
