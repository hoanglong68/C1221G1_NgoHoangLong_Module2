package collection_review.services;

import collection_review.models.InternCandidate;

import java.util.ArrayList;
import java.util.Scanner;

public class InternCandidateImpl implements IcandidateService {
    private int candidateId, birthDate, candidateType, semester;
    private String firstName, lastName, address, email, phone, majors, universityName;
    Scanner scanner = new Scanner(System.in);
    static ArrayList<InternCandidate> internCandidateArrayList = new ArrayList();

    static {
        InternCandidate internCandidate1 = new InternCandidate(2001, 2002, "1910100000", 2, "ho", "Joana", "dak lak", "hola", "accountant", "DTU", 3);
        InternCandidate internCandidate2 = new InternCandidate(2002, 2001, "1910100001", 2, "Filipa", "Maria", "sai gon", "hola1", "human resource", "DTU", 4);
        candidateArrayList.add(internCandidate1);
        candidateArrayList.add(internCandidate2);
        internCandidateArrayList.add(internCandidate1);
        internCandidateArrayList.add(internCandidate2);
    }

    @Override
    public void create() {
        this.baseInformation();
        System.out.print("enter majors: ");
        majors = scanner.nextLine();
        System.out.print("enter name of university: ");
        universityName = scanner.nextLine().toUpperCase();
        System.out.print("enter semester: ");
        semester = Integer.parseInt(scanner.nextLine());
        InternCandidate internCandidate = new InternCandidate(candidateId, birthDate, phone, candidateType, firstName, lastName, address, email, majors, universityName, semester);
        internCandidateArrayList.add(internCandidate);
        candidateArrayList.add(internCandidate);
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
        for (int i = 0; i < internCandidateArrayList.size(); i++) {
            if (internCandidateArrayList.get(i).getFirstName().toLowerCase().contains(name) || internCandidateArrayList.get(i).getLastName().toLowerCase().contains(name)) {
                System.out.println(
                        internCandidateArrayList.get(i).getFirstName() + " " + internCandidateArrayList.get(i).getLastName() + " | "
                                + internCandidateArrayList.get(i).getBirthDate() + " | "
                                + internCandidateArrayList.get(i).getAddress() + " | "
                                + internCandidateArrayList.get(i).getPhone() + " | "
                                + internCandidateArrayList.get(i).getEmail() + " | "
                                + internCandidateArrayList.get(i).getCandidateType()
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
        candidateType = 2;
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
