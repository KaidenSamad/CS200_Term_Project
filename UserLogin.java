package user;

import java.util.Scanner;

public class UserLogin {
    public boolean login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Simple validation (replace with real validation logic)
        return username.equals("admin") && password.equals("1234");
    }

    public void showOperatorMenu() {
        System.out.println("Operator Menu:");
        // Call methods from OperatorMenu class (e.g., manageMembers, manageProviders)
    }

    public void showProviderMenu() {
        System.out.println("Provider Menu:");
        // Call methods for adding service records and validations
    }

    public void showManagerMenu() {
        System.out.println("Manager Menu:");
        // Call report generation functions
    }
}

