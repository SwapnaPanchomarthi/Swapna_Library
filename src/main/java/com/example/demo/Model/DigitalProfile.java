package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name="digital_profile")
public class DigitalProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String type; //Student or employee type
    private String UserId;
    private String password;

    public DigitalProfile()
    {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
