package com.airTicket.passenger;

import com.airTicket.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "passengers")
public class Passenger extends BaseEntity {
    private String firstName;
    private String secondName;
    private String fatherName;
    private String passportNum;
    private int age;

    public Passenger() {
        super();
    }

    public Passenger(String firstName, String secondName, String fatherName, String passportNum, int age) {
        super();
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.passportNum = passportNum;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
