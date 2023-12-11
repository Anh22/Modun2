package com.example.managerstudent.Model;

public class Student {
    private int id;
    private String name;
    private int age;
    private String sexes;
    private String address;
    private double score;

    public Student(int id, String name, int age, String sexes, String address, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sexes = sexes;
        this.address = address;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int   id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexes() {
        return sexes;
    }

    public void setSexes(String sexes) {
        this.sexes = sexes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sexes='" + sexes + '\'' +
                ", address='" + address + '\'' +
                ", score=" + score +
                '}';
    }
}
