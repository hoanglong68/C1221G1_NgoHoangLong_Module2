package collection_review.services;

import collection_review.models.FresherCandidate;

import java.util.ArrayList;
import java.util.Scanner;

public class FresherCandidateImpl implements IcandidateService {
    private int candidateId, birthDate, candidateType, graduationDate;
    private String firstName, lastName, address, email, phone, graduationRank, education;
    String[] rankOfGraduation = {"Excellence", "Good", "Fair", "Poor"};
    Scanner scanner = new Scanner(System.in);
    static ArrayList<FresherCandidate> fresherCandidateArrayList = new ArrayList();

    static {
        FresherCandidate fresherCandidate1 = new FresherCandidate(1001, 2000, "1900100000", 0, "Calderon ", "Motta ", "ha noi", "honglam", 2022, "Good", "DTU");
        FresherCandidate fresherCandidate2 = new FresherCandidate(1002, 1999, "1900100001", 0, "Aelbrecht", "Carine", "sai gon", "honglam1", 2021, "Good", "DUE");
        candidateArrayList.add(fresherCandidate1);
        candidateArrayList.add(fresherCandidate2);
        fresherCandidateArrayList.add(fresherCandidate1);
        fresherCandidateArrayList.add(fresherCandidate2);
    }

    @Override
    public void create() {
        this.baseInformation();
        System.out.print("enter graduation date: ");
        graduationDate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rankOfGraduation.length; i++) {
            System.out.println(i + 1 + ". " + rankOfGraduation[i]);
        }
        System.out.print("choose graduation rank: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                graduationRank = rankOfGraduation[0];
                break;
            case 2:
                graduationRank = rankOfGraduation[1];
                break;
            case 3:
                graduationRank = rankOfGraduation[2];
                break;
            case 4:
                graduationRank = rankOfGraduation[3];
                break;
            default:
                System.out.println("valid !!!");
        }
        System.out.print("enter education");
        education = scanner.nextLine().toUpperCase();
        FresherCandidate fresherCandidate = new FresherCandidate(candidateId, birthDate, phone, candidateType, firstName, lastName, address, email, graduationDate, graduationRank, education);
        fresherCandidateArrayList.add(fresherCandidate);
        candidateArrayList.add(fresherCandidate);
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
        for (int i = 0; i < fresherCandidateArrayList.size(); i++) {
            if (fresherCandidateArrayList.get(i).getFirstName().toLowerCase().contains(name) || fresherCandidateArrayList.get(i).getLastName().toLowerCase().contains(name)) {
                System.out.println(
                        fresherCandidateArrayList.get(i).getFirstName() + " " + fresherCandidateArrayList.get(i).getLastName() + " | "
                                + fresherCandidateArrayList.get(i).getBirthDate() + " | "
                                + fresherCandidateArrayList.get(i).getAddress() + " | "
                                + fresherCandidateArrayList.get(i).getPhone() + " | "
                                + fresherCandidateArrayList.get(i).getEmail() + " | "
                                + fresherCandidateArrayList.get(i).getCandidateType()
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
        candidateType = 1;
        System.out.print("enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("enter last name: ");
        lastName = scanner.nextLine();
        System.out.print("enter address: ");
        address = scanner.nextLine();
        System.out.print("enter email: ");
        email = scanner.nextLine();
    }
}
