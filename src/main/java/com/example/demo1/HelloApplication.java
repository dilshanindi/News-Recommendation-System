package com.example.demo1;

import model.User;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the User Management System!");
            System.out.println("1. Log In");
            System.out.println("2. Create Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1: // Log In
                    System.out.println("Enter Email:");
                    String loginEmail = scanner.nextLine();

                    System.out.println("Enter Password:");
                    String loginPassword = scanner.nextLine();

                    // Simulate login (this will integrate with UserManager later)
                    System.out.println("\n[Login simulation]");
                    System.out.println("Logged in as: " + loginEmail);
                    break;

                case 2: // Create Account
                    System.out.println("Enter Full Name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter Email:");
                    String email = scanner.nextLine();

                    System.out.println("Enter Password:");
                    String password = scanner.nextLine();

                    // Create a new User object
                    User newUser = new User(name, email, password);
                    System.out.println("\nAccount created successfully!");
                    System.out.println("Name: " + newUser.getName());
                    System.out.println("Email: " + newUser.getEmail());
                    break;

                case 3: // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
