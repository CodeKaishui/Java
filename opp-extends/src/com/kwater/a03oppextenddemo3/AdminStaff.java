package com.kwater.a03oppextenddemo3;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String duty) {
        super(id, name,duty);
    }

    @Override
    public void work() {
        super.work();
    }
}
