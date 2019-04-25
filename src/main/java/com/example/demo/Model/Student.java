package com.example.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "Student_Id")
    private Long studentId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String studentEmail;
    private String homeRoomTeacher;

    @Autowired
    public Student(){

    }
    public Student(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getHomeRoomTeacher() {
        return homeRoomTeacher;
    }

    public void setHomeRoomTeacher(String homeRoomTeacher) {
        this.homeRoomTeacher = homeRoomTeacher;
    }
}
