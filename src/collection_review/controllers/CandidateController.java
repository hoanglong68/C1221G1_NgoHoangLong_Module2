package collection_review.controllers;

import collection_review.services.ExperienceCandidateImpl;
import collection_review.services.FresherCandidateImpl;
import collection_review.services.InternCandidateImpl;

import java.util.Scanner;

public class CandidateController {
    public void mainMenu() {
        int choice = -1;
        String choose;
        ExperienceCandidateImpl experienceCandidateImpl = new ExperienceCandidateImpl();
        FresherCandidateImpl fresherCandidateImpl = new FresherCandidateImpl();
        InternCandidateImpl internCandidateImpl = new InternCandidateImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---CANDIDATE MANAGEMENT SYSTEM---");
        do {
            System.out.println(
                    "1.\tExperience" + "\n" +
                            "2.\tFresher" + "\n" +
                            "3.\tInternship" + "\n" +
                            "4.\tSearching" + "\n" +
                            "5.\tExit"
            );
            System.out.println("Please choose to Create");
            System.out.println("enter your choice !");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    experienceCandidateImpl.create();
                    do {
                        System.out.println("do you want to continue(Y/N)");
                        choose = scanner.nextLine().toUpperCase();
                        if ("Y".equals(choose)) {
                            experienceCandidateImpl.create();
                        } else if ("N".equals(choose)) {
                            experienceCandidateImpl.read();
                        } else {
                            System.out.println("choose is not valid");
                            break;
                        }
                    } while ("Y".equals(choose));
                    break;
                case 2:
                    fresherCandidateImpl.create();
                    do {
                        System.out.println("do you want to continue(Y/N)");
                        choose = scanner.nextLine().toUpperCase();
                        if ("Y".equals(choose)) {
                            fresherCandidateImpl.create();
                        } else if ("N".equals(choose)) {
                            fresherCandidateImpl.read();
                        } else {
                            System.out.println("choose is not valid");
                            break;
                        }
                    } while ("Y".equals(choose));
                    break;
                case 3:
                    internCandidateImpl.create();
                    do {
                        System.out.println("do you want to continue(Y/N)");
                        choose = scanner.nextLine().toUpperCase();
                        if ("Y".equals(choose)) {
                            internCandidateImpl.create();
                        } else if ("N".equals(choose)) {
                            internCandidateImpl.read();
                        } else {
                            System.out.println("choose is not valid");
                            break;
                        }
                    } while ("Y".equals(choose));
                    break;
                case 4:
                    experienceCandidateImpl.read();
                    System.out.println("enter candidate type to search");
                    int candidateType = Integer.parseInt(scanner.nextLine());
                    switch (candidateType) {
                        case 0:
                            experienceCandidateImpl.search();
                            break;
                        case 1:
                            fresherCandidateImpl.search();
                            break;
                        case 2:
                            internCandidateImpl.search();
                            break;
                        default:
                            System.out.println("type is not valid");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("wrong choice !");
            }
        } while (choice != 5);
    }
}
