import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Login System!");

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Sign Up
                    System.out.println("Sign Up");
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    Database.addUser(username, password);
                    System.out.println("Sign up successful!\n");
                    break;
                case 2:
                    // Sign In
                    System.out.println("Sign In");
                    System.out.print("Enter username: ");
                    String signInUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String signInPassword = scanner.nextLine();

                    User user = Database.getUser(signInUsername);
                    if (user != null && user.getPassword().equals(signInPassword)) {
                        System.out.println("Login successful. Welcome, " + user.getUsername() + "!");
                    } else {
                        System.out.println("Invalid username or password. Please try again.\n");
                    }
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}
