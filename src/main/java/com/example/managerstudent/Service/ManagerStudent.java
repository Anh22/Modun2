package com.example.managerstudent.Service;

import com.example.managerstudent.Model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerStudent implements ManageStudent {
    List<Student>students=new ArrayList<>();
    public ManagerStudent(){
        students.add(new Student(1,"A",12,"nam","ha nội",8.5));
        students.add(new Student(25,"A",12,"nam","ha nội",8.5));
        students.add(new Student(3,"A",12,"nam","ha nội",8.5));
        students.add(new Student(46,"A",12,"nam","ha nội",8.5));
        students.add(new Student(5,"A",12,"nam","ha nội",8.5));
    }

    @Override
    public List<Student> findAll() {
        return students;

    }

    @Override
    public void addStudent(Student student) {
        students.add(student);

    }


    @Override
    public Student findById(int id) {
        for (Student student:students) {
            if (student.getId()==id)
                return student;

        }
        return null;

    }

    @Override
    public int findIndexID(int id) {
        int index =-1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId()==id)
                index=i;
        }

        return index;
    }

    @Override
    public void delete(int id) {
        Student blog=findById(id);
        students.remove(blog);

    }

    @Override
    public void update(int id, Student student) {
        int indexOf = findIndexID(id);
        students.set(indexOf,student);


    }
    public void sortByID() {
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student student1, Student student2) {
                return Integer.compare(student1.getId(), student2.getId());
            }
        });
    }
}
