package collection_review.models;

public class InternCandidate extends Candidate {
    private String majors,universityName;
    private int semester;

    public InternCandidate() {
    }

    public InternCandidate(int candidateId, int birthDate, int phone, int candidateType, String firstName, String lastName, String address, String email, String majors, String universityName, int semester) {
        super(candidateId, birthDate, phone, candidateType, firstName, lastName, address, email);
        this.majors = majors;
        this.universityName = universityName;
        this.semester = semester;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "InternCandidate{" + super.toString() +
                "majors='" + majors + '\'' +
                ", universityName='" + universityName + '\'' +
                ", semester=" + semester +
                '}';
    }
}
