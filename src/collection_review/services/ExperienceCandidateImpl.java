package collection_review.services;

import collection_review.models.ExperienceCandidate;

import java.util.ArrayList;
import java.util.Scanner;

public class ExperienceCandidateImpl implements IcandidateService {
    private int candidateId, birthDate, candidateType, expInYear;
    private String firstName, lastName, address, email, phone, proSkill;
    Scanner scanner = new Scanner(System.in);
    static ArrayList<ExperienceCandidate> experienceCandidateArrayList = new ArrayList();

    static {
        ExperienceCandidate experienceCandidate1 = new ExperienceCandidate(9001, 1995, "1900100000", 0, "Ahlgren", "Maria", "da nang", "hoanglong", 3, "java");
        ExperienceCandidate experienceCandidate2 = new ExperienceCandidate(9002, 1997, "1900100001", 0, "Cabrera ", "Cornide", "da nang", "hoanglong1", 2, "java");
        candidateArrayList.add(experienceCandidate1);
        candidateArrayList.add(experienceCandidate2);
        experienceCandidateArrayList.add(experienceCandidate1);
        experienceCandidateArrayList.add(experienceCandidate2);
    }

    @Override
    public void create() {
        this.baseInformation();
        do {
            System.out.print("enter year of experience: ");
            expInYear = Integer.parseInt(scanner.nextLine());
        } while (expInYear < 0 || expInYear > 100);
        System.out.print("enter professional skill: ");
        proSkill = scanner.nextLine().toUpperCase();
        ExperienceCandidate experienceCandidate = new ExperienceCandidate(candidateId, birthDate, phone, candidateType, firstName, lastName, address, email, expInYear, proSkill);
        experienceCandidateArrayList.add(experienceCandidate);
        candidateArrayList.add(experienceCandidate);
    }

    @Override
    public void read() {
        for (int i = 0; i < candidateArrayList.size(); i++) {
            System.out.println(candidateArrayList.get(i));
        }
    }


    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {
        System.out.println("enter first name or last name to search");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < experienceCandidateArrayList.size(); i++) {
            if (experienceCandidateArrayList.get(i).getFirstName().toLowerCase().contains(name) || experienceCandidateArrayList.get(i).getLastName().toLowerCase().contains(name)) {
                System.out.println(
                        experienceCandidateArrayList.get(i).getFirstName() + " " + experienceCandidateArrayList.get(i).getLastName() + " | "
                                + experienceCandidateArrayList.get(i).getBirthDate() + " | "
                                + experienceCandidateArrayList.get(i).getAddress() + " | "
                                + experienceCandidateArrayList.get(i).getPhone() + " | "
                                + experienceCandidateArrayList.get(i).getEmail() + " | "
                                + experienceCandidateArrayList.get(i).getCandidateType()
                );
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("not exist in list");
        }
    }


    @Override
    public void baseInformation() {
        System.out.print("enter id: ");
        candidateId = Integer.parseInt(scanner.nextLine());
        do {
            System.out.print("enter birth date: ");
            birthDate = Integer.parseInt(scanner.nextLine());
            if (birthDate < 1900 || birthDate > 2022) {
                System.out.println("birth date is not valid");
            }
        } while (birthDate < 1900 || birthDate > 2022);
        do {
            System.out.print("enter phone number: ");
            phone = scanner.nextLine();
            if (phone.length() < 10) {
                System.out.println("phone number is not valid");
            }
        } while (phone.length() < 10);
        candidateType = 0;
        System.out.print("enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("enter last name: ");
        lastName = scanner.nextLine();
        System.out.print("enter address: ");
        address = scanner.nextLine();
        System.out.print("enter email (@gmail.com): ");
        email = scanner.nextLine();
    }
}
