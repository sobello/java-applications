package com.session.seven;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String gender;

 
    Person() {
    };

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "[Name:" + name + "Age: " + age + "Gender: " + gender+"]";
    }

 

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

 

    public String getName() {
        return name;
    }

 

    public int getAge() {
        return age;
    }

 

    public String getGender() {
        return gender;
    }
    
}

 

 