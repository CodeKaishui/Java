package com.kwater.a03oppextenddemo3;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name, String duty) {
        super(id, name, duty);
    }

    @Override
    public void work() {
        System.out.println("讲师:" + getName() + "id:" + getId() + "负责:" + getDuty());
    }
}
