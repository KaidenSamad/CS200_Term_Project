
package main;

import user.UserLogin;

import java.util.Scanner;

public class Team25main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserLogin userLogin = new UserLogin();

        System.out.println("Welcome to the Service Management System");
        if (userLogin.login()) {
            while (true) {
                System.out.println("\nMain Menu:");
                System.out.println("1. Operator Menu");
                System.out.println("2. Provider Menu");
                System.out.println("3. Manager Menu");
                System.out.println("4. Run Accounting Procedure");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> userLogin.showOperatorMenu();
                    case 2 -> userLogin.showProviderMenu();
                    case 3 -> userLogin.showManagerMenu();
                    case 4 -> runMainAccountingProcedure();
                    case 5 -> {
                        System.out.println("Exiting... Goodbye!");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
        } else {
            System.out.println("Invalid login. Exiting...");
        }
    }

    public static void runMainAccountingProcedure() {
        System.out.println("Running Main Accounting Procedure...");
        // Call report generation methods here.
    }
}
