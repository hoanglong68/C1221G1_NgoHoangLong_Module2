package collection_review.services;

import collection_review.models.ExperienceCandidate;

import java.util.ArrayList;
import java.util.Scanner;

public class ExperienceCandidateImpl implements IcandidateService {
    private int candidateId, birthDate, phone, candidateType;
    private String firstName, lastName, address, email;
    Scanner scanner = new Scanner(System.in);
    ArrayList<ExperienceCandidate> experienceCandidateArrayList = new ArrayList();

    @Override
    public void create() {
        this.baseInformation();
        System.out.print("enter year of experience");
        int expInYear = Integer.parseInt(scanner.nextLine());
        System.out.print("enter professional skill");
        String proSkill = scanner.nextLine();
        ExperienceCandidate experienceCandidate = new ExperienceCandidate(candidateId, birthDate, phone, candidateType, firstName, lastName, address, email, expInYear, proSkill);
        experienceCandidateArrayList.add(experienceCandidate);
        candidateArrayList.add(experienceCandidate);
    }


    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {
        for (int i = 0; i <candidateArrayList.size() ; i++) {
            System.out.println(candidateArrayList.get(i));
        }
        System.out.println("enter first name or last name to search");
        String name = scanner.nextLine();
        System.out.println("enter candidate type");
        candidateType = Integer.parseInt(scanner.nextLine());
        
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
