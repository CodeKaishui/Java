package com.kwater.a03oppextenddemo3;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String id, String name, String duty) {
        super(id, name, duty);
    }

    @Override
    public void work() {
        System.out.println("助教:" + getName() + "id:" + getId() + "负责" + getDuty());
    }
}
