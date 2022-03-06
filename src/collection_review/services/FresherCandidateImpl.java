package collection_review.services;

import collection_review.models.FresherCandidate;

import java.util.ArrayList;
import java.util.Scanner;

public class FresherCandidateImpl implements IcandidateService {
    private int candidateId, birthDate, phone, candidateType;
    private String firstName, lastName, address, email;
    Scanner scanner = new Scanner(System.in);
    ArrayList<FresherCandidate> fresherCandidateArrayList = new ArrayList();

    @Override
    public void create() {
        this.baseInformation();
        System.out.print("enter graduation date");
        int graduationDate = Integer.parseInt(scanner.nextLine());
        System.out.print("enter graduation rank");
        String graduationRank = scanner.nextLine();
        System.out.print("enter education");
        String education = scanner.nextLine();
        FresherCandidate fresherCandidate = new FresherCandidate(candidateId, birthDate, phone, candidateType, firstName, lastName, address, email, graduationDate, graduationRank, education);
        fresherCandidateArrayList.add(fresherCandidate);
        candidateArrayList.add(fresherCandidate);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    @Override
    public void baseInformation() {
        System.out.print("enter id");
        candidateId = Integer.parseInt(scanner.nextLine());
        System.out.print("enter birth date");
        birthDate = Integer.parseInt(scanner.nextLine());
        System.out.print("enter phone number");
        phone = Integer.parseInt(scanner.nextLine());
        System.out.print("enter candidate type");
        candidateType = Integer.parseInt(scanner.nextLine());
        System.out.print("enter first name");
        firstName = scanner.nextLine();
        System.out.print("enter last name");
        lastName = scanner.nextLine();
        System.out.print("enter address");
        address = scanner.nextLine();
        System.out.print("enter email");
        email = scanner.nextLine();
    }
}
