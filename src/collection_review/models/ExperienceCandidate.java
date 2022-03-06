package collection_review.models;

public class ExperienceCandidate extends Candidate {
    private int expInYear;
    private String proSkill;

    public ExperienceCandidate() {
    }

    public ExperienceCandidate(int candidateId, int birthDate, String phone, int candidateType, String firstName, String lastName, String address, String email, int expInYear, String proSkill) {
        super(candidateId, birthDate, phone, candidateType, firstName, lastName, address, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'';
    }
}
