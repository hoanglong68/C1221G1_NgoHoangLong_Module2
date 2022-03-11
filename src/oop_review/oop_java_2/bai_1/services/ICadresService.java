package oop_review.oop_java_2.bai_1.services;

import oop_review.oop_java_2.bai_1.models.Engineer;

public interface ICadresService {
    void create(Engineer engineer);
    void read();
    void update();
    void delete();
}
