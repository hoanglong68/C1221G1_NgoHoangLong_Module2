package oop_review.oop_java_2.bai_1.models;

public class Engineer extends Cadres {
    String majors;

    public Engineer() {
    }

    public Engineer(String name, String gender, String address, int birhDate, String majors) {
        super(name, gender, address, birhDate);
        this.majors = majors;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    @Override
    public String toString() {
        return "Engineer{" + super.toString() +
                "majors='" + majors + '\'' +
                '}';
    }
}
