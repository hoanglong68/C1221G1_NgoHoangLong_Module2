package collection_review.services;

import collection_review.models.Candidate;

import java.util.ArrayList;

public interface IcandidateService {
    ArrayList<Candidate> candidateArrayList = new ArrayList<>();
    void create();
    void update();
    void delete();
    void search();
    void baseInformation();
}
