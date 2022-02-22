package ss5_access_modifier_and_static.bai_tap.build_write_only;

public class Student {
    private String name = "john";
    private String classes = "C02";

    public Student() {
    }

     void setName(String name) {
        this.name = name;
    }

     void setClasses(String classes) {
        this.classes = classes;
    }

}
