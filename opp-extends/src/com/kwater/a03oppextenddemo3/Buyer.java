package com.kwater.a03oppextenddemo3;

public class Buyer extends Maintainer{
    public Buyer() {
    }

    public Buyer(String id, String name, String duty) {
        super(id, name, duty);
    }

    @Override
    public void work() {
        System.out.println("采购员:" + getName() + "id:" + getId() + "负责:" + getDuty());
    }
}
