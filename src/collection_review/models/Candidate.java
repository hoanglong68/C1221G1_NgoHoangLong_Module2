package collection_review.models;

public abstract class Candidate {
    private int candidateId, birthDate, phone, candidateType;
    private String firstName, lastName, address, email;

    public Candidate() {
    }

    public Candidate(int candidateId, int birthDate, int phone, int candidateType, String firstName, String lastName, String address, String email) {
        this.candidateId = candidateId;
        this.birthDate = birthDate;
        this.phone = phone;
        this.candidateType = candidateType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "candidateId=" + candidateId +
                        ", birthDate=" + birthDate +
                        ", phone=" + phone +
                        ", candidateType=" + candidateType +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", address='" + address + '\'' +
                        ", email='" + email + "@gmail.com" + '\'';
    }
}
