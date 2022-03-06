package collection_review.services;

import collection_review.models.InternCandidate;

import java.util.ArrayList;
import java.util.Scanner;

public class InternCandidateImpl implements IcandidateService {
    private int candidateId, birthDate, phone, candidateType;
    private String firstName, lastName, address, email;
    Scanner scanner = new Scanner(System.in);
    ArrayList<InternCandidate> internCandidateArrayList = new ArrayList();

    @Override
    public void create() {
        this.baseInformation();
        System.out.print("enter majors");
        String majors = scanner.nextLine();
        System.out.print("enter name of university");
        String universityName = scanner.nextLine();
        System.out.print("enter semester");
        int semester = Integer.parseInt(scanner.nextLine());
        InternCandidate internCandidate = new InternCandidate(candidateId, birthDate, phone, candidateType, firstName, lastName, address, email, majors, universityName, semester);
        internCandidateArrayList.add(internCandidate);
        candidateArrayList.add(internCandidate);
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
