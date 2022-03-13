package com.emerAU.model;

import java.util.Map;

public class Department {
    private String dept_name;
    private Map<Integer, Person> dept_members;

    public Department(String dept_name, Map<Integer, Person> dept_members) {
        this.dept_name = dept_name;
        this.dept_members = dept_members;
    }

    @Override
    public String toString() {
        String output="";
        output += "Department '" + dept_name + "' has members:\n";
        for (Integer i : dept_members.keySet()) {
            output+=dept_members.get(i)+"\n";
        }
        return output;
    }

    public void initDepartment() {
        System.err.println("Inititalising Department '"+dept_name +"'");
    }

    public void destDepartment(){
        System.err.println("Destroying Department '"+dept_name +"'");
    }
}
