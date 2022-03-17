package case_study.models.person;

public abstract class Person {
    private String name, dateOfBirth, gender, idCard, phoneNumber, email;
    protected static final String COMMA = ",";

    public Person() {
    }

    public Person(String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toConvert() {
        return name + COMMA +
                dateOfBirth + COMMA +
                gender + COMMA +
                idCard + COMMA +
                phoneNumber + COMMA +
                email
                ;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", gender='" + gender + '\'' +
                        ", idCard='" + idCard + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", email='" + email + '\''
                ;
    }
}
