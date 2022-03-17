package case_study.models.person;

public class Employee extends Person {
    private String idEmployee, degree, position;
    private int salary;

    public Employee() {
    }

    public Employee(String idEmployee, String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String degree, String position, int salary) {
        super(name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toConvert() {
        return idEmployee + COMMA +
                super.toConvert() + COMMA +
                degree + COMMA +
                position + COMMA +
                salary
                ;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                super.toString() +
                ", degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
