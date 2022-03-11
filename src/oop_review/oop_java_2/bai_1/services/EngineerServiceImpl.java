package oop_review.oop_java_2.bai_1.services;


import oop_review.oop_java_2.bai_1.models.Engineer;

import java.util.ArrayList;
import java.util.List;

public class EngineerServiceImpl implements ICadresService {
    List<Engineer> engineerList = new ArrayList<>();

    @Override
    public void create(Engineer engineer) {
        engineerList.add(engineer);
    }

    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
