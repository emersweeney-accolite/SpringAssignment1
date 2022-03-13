package com.emerAU.model;

public class Teacher extends Person{
    private String position;

    public Teacher(){}
    public Teacher(int id, String name, String position) {
        super(id,name);
        this.position=position;
    }

    @Override
    public String toString() {
        return "Teacher [ID = " + id + ", Name = " + name + ", position = " + position + "]";
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPosition(String position){
        this.position=position;
    }
}
