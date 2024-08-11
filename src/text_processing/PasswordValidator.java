package text_processing;

import java.util.Scanner;

public class PasswordValidator {

    public static String currentUsername = "johndoe";
    public static String currentPassword = "ABC_1234";

    public static void main(String[] args) {

        printPasswordRules();
        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do {
            System.out.println("Enter your new password:");
            var proposedPassword = scanner.nextLine();
            valid = changePassword(proposedPassword);
        } while (!valid);

        System.out.println("The proposed password is valid.");

        scanner.close();
    }

    public static void printPasswordRules() {
        System.out.println("Your new password must meet the following requirements");
        System.out.println("* at least 8 character long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public static boolean changePassword(String newPassword) {

        boolean valid = true;

        if (newPassword.length() < 8) {
            valid = false;
        }

        if (newPassword.equals(newPassword.toLowerCase())) {
            valid = false;
        }

        if (newPassword.matches("[a-zA-Z0-9 ]")) {
            valid = false;
        }

        if (newPassword.toUpperCase().contains(currentUsername.toUpperCase())) {
            valid = false;
        }

        if (newPassword.equals(currentPassword)) {
            valid = false;
        }

        if (!valid) {
            return false;
        }

        return valid;
    }
}
