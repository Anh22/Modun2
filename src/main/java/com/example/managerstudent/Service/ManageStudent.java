package com.example.managerstudent.Service;

import com.example.managerstudent.Model.Student;

import java.util.List;

public interface ManageStudent {
    List<Student> findAll();
    void addStudent(Student student);

    Student findById(int id);
    int findIndexID(int id);
    void delete(int id);

    void update(int id,  Student student);

}
