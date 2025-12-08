package com.kwater.a03oppextenddemo3;

public class Employee {
    private String id;
    private String name;
    private String duty;

    public Employee() {
    }

    public Employee(String id, String name,String duty) {
        this.id = id;
        this.name = name;
        this.duty = duty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void work(){
        System.out.println("工作");
    }

}
