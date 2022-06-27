package com.company;

public class Dog {
    private int age;
    private String gender;
    private String color;

    public Dog( int age, String gender, String color) {
        this.age = age;
        this.gender = gender;
        this.color = color;
    }


    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    //@Override
    public String toStringg() {
        return " age: " + age +
                ", gender: '" + gender + '\'' +
                ", color: '" + color + '\'';
    }
    @Override
    public String toString() {
        return " age: " + age +
                ", gender: '" + gender + '\'' +
                ", color: '" + color + '\'';
    }
}
