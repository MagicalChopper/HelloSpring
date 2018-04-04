package com.coder.iocaop.entity;

public class UserFather {

    private User fatherUser;

    private String fatherName;

    public User getFatherUser() {
        return fatherUser;
    }

    public void setFatherUser(User fatherUser) {
        this.fatherUser = fatherUser;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}
