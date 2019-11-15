package com.user.esoftwrica.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDetail {

    String name, address, gender;
    int age;

    static List<StudentDetail> studentDetailList = new ArrayList<>();

    public StudentDetail(String name, String address, String gender, int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }


    public List<StudentDetail> getStudentDetailList() {
        return studentDetailList;
    }

    public void setStudentDetailList(List<StudentDetail> studentDetailList) {
        this.studentDetailList = studentDetailList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
