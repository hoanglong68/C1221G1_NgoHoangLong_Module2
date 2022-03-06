package collection_review.view;

import collection_review.controllers.CandidateController;

public class View {
    public static void main(String[] args) {
        CandidateController candidateController = new CandidateController();
        candidateController.mainMenu();
    }
}
