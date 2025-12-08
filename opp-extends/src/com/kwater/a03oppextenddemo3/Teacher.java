package com.kwater.a03oppextenddemo3;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name,String duty) {
        super(id, name,duty);
    }

    @Override
    public void work() {
        super.work();
    }
}
