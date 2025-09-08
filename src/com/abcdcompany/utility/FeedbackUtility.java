package com.abcdcompany.utility;

import com.abcdcompany.entity.Phase;
import com.abcdcompany.entity.SessionInfo;
import com.abcdcompany.service.FeedbackService;
import com.abcdcompany.service.FeedbackServiceImpl;

import java.util.List;
import java.util.Scanner;

public class FeedbackUtility {
    public static void main(String[] args) {
        FeedbackService service = new FeedbackServiceImpl();
        char choice;
        Scanner scanner = new Scanner(System.in);
        List<Phase> phaseList = service.getAllPhases();
        do {
            if (phaseList.isEmpty()) {
                System.out.println("No phases found in the system.");
                return;
            }

            System.out.println("Choose a Phase: ");
            for (int i = 0; i < phaseList.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, phaseList.get(i).getPhaseName());
            }
            int phaseChoice = readChoice(scanner, phaseList.size());
            Phase chosenPhase = phaseList.get(phaseChoice - 1);
            List<SessionInfo> sessions = service.getSessionsByPhase(chosenPhase.getId());
            if (sessions.isEmpty()) {
                System.out.println("No sessions available in this phase.");
                return;
            }
            System.out.println("\nChoose a Session:");
            for (int i = 0; i < sessions.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, sessions.get(i).getSessionTitle());
            }
            int sessionChoice = readChoice(scanner, sessions.size());
            SessionInfo chosenSession = sessions.get(sessionChoice - 1);

            System.out.println("\n------ Feedback for Session: " + chosenSession.getSessionTitle() + " ------");
            service.displayFeedbackForSession(chosenSession.getId());
            
            System.out.println("Do you want to continue? (y/n) :");
            choice = scanner.next().charAt(0);
        }while(choice == 'y');
    }
    /**
     * name :readChoice("inputs choice")
     * @param scanner
     * @param max
     * @return choice
     */
    private static int readChoice(Scanner scanner, int max) {
        int choice = -1;
        while (choice < 1 || choice > max) {
            System.out.print("Enter choice (1-" + max + "): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next(); 
                System.out.println("Invalid input. Try again.");
            }
        }
        return choice;
    }
}
