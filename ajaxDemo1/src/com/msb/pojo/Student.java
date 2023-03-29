package com.msb.pojo;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int shengao;
    private String gender;
    private String sge;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShengao() {
        return shengao;
    }

    public void setShengao(int shengao) {
        this.shengao = shengao;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSge() {
        return sge;
    }

    public void setSge(String sge) {
        this.sge = sge;
    }

    public Student() {
    }

    public Student(String name, int shengao, String gender, String sge) {
        this.name = name;
        this.shengao = shengao;
        this.gender = gender;
        this.sge = sge;
    }
}
