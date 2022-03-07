package oop_review.oop_java_2.bai_1.models;

public class Cadres {
    private String name,gender,address;
    private int birhDate;

    public Cadres() {
    }

    public Cadres(String name, String gender, String address, int birhDate) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birhDate = birhDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirhDate() {
        return birhDate;
    }

    public void setBirhDate(int birhDate) {
        this.birhDate = birhDate;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birhDate=" + birhDate;
    }
}
