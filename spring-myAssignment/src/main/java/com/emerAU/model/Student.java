package com.emerAU.model;

public class Student extends Person{
    private int gpa;
    public Student(int id, String name, int gpa) {
        super(id, name);
        this.gpa=gpa;
    }

    @Override
    public String toString(){
        return "Student [ID = " + id + ", Name = " + name + ", GPA = " + gpa + "]";
    }
}
