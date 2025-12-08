package com.kwater.a03oppextenddemo3;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }
    public Maintainer(String id, String name, String duty) {
        super(id, name, duty);
    }

    @Override
    public void work() {
        System.out.println("管理员:" + getName() + "id:" + getId() + "负责:" + getDuty());
    }
}
