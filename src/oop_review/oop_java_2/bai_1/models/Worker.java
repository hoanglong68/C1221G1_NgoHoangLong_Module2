package oop_review.oop_java_2.bai_1.models;

public class Worker extends Cadres {
    int degree;

    public Worker() {
    }

    public Worker(String name, String gender, String address, int birhDate, int degree) {
        super(name, gender, address, birhDate);
        this.degree = degree;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                "degree=" + degree +
                '}';
    }
}
