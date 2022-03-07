package oop_review.oop_java_2.bai_1.models;

public class Staff extends Cadres {
    String task;

    public Staff() {
    }

    public Staff(String name, String gender, String address, int birhDate, String task) {
        super(name, gender, address, birhDate);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "task='" + task + '\'' +
                '}';
    }
}
