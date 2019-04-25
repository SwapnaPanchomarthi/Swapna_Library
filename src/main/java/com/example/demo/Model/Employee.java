package com.example.demo.Model;

import javax.persistence.*;
import java.util.Date;


public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "Employee_Id")
    private Long employeeId;
    private String firstName;
    private String lastName;
    private Date empDob;
    private String email;
    private String RoleType;

    @OneToOne(cascade = CascadeType.ALL)
    private DigitalProfile profile;

    public Employee(){

    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public Date getEmpDob() {
        return empDob;
    }

    public void setEmpDob(Date empDob) {
        this.empDob = empDob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleType() {
        return RoleType;
    }

    public void setRoleType(String roleType) {
        RoleType = roleType;
    }
}
