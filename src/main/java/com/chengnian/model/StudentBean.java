package com.chengnian.model;


import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentBean {
    @Id
    private String name;
    private Integer age;
    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
