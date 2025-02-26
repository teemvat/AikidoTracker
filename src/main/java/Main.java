import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PracticeTracker tracker = new PracticeTracker();

        while (true) {
            System.out.println("\n===== Aikido Practice Tracker =====");
            System.out.println("1. Add Practice Session");
            System.out.println("2. View Total Practice Time");
            System.out.println("3. Check Graduation Eligibility");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Session Date: " + LocalDate.now());
                    System.out.print("Enter session duration (minutes): ");
                    int duration = scanner.nextInt();
                    tracker.addSession(LocalDate.now(), duration);
                    System.out.println("Session added successfully!");
                    break;
                case 2:
                    System.out.println("Total practice time: " + tracker.getTotalPracticeTime() + " minutes");
                    break;
                case 3:
                    System.out.println(tracker.isEligibleForGraduation() ? "You are eligible for Kyu graduation!" : "Keep practicing!");
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
