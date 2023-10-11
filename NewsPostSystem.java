import java.util.Scanner;
import java.util.List;

public class NewsPostSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        String username = "";

        System.out.println("Welcome to the News Post System!");

        while (true) {
            if (!loggedIn) {
                System.out.print("Enter username: ");
                String inputUsername = scanner.nextLine();
                System.out.print("Enter password: ");
                String inputPassword = scanner.nextLine();

                User user = Database.getUser(inputUsername);
                if (user != null && user.getPassword().equals(inputPassword)) {
                    loggedIn = true;
                    username = inputUsername;
                    System.out.println("Login successful. Welcome, " + username + "!");
                } else {
                    System.out.println("Invalid username or password. Please try again.\n");
                }
            } else {
                System.out.println("Select an option:");
                System.out.println("1. Add News Post");
                System.out.println("2. View News Posts");
                System.out.println("3. Delete News Post");
                System.out.println("4. Logout");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        // Add News Post
                        System.out.print("Enter news post title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter news post content: ");
                        String content = scanner.nextLine();
                        NewsPost newsPost = new NewsPost(title, content);
                        Database.addNewsPost(username, newsPost);
                        System.out.println("News post added successfully!\n");
                        break;
                    case 2:
                        // View News Posts
                        List<NewsPost> userPosts = Database.getNewsPosts(username);
                        if (userPosts != null && !userPosts.isEmpty()) {
                            System.out.println("News Posts:");
                            for (int i = 0; i < userPosts.size(); i++) {
                                NewsPost post = userPosts.get(i);
                                System.out.println((i + 1) + ". " + post.getTitle());
                                System.out.println("   " + post.getContent());
                            }
                        } else {
                            System.out.println("No news posts available.\n");
                        }
                        break;
                    case 3:
                        // Delete News Post
                        System.out.print("Enter the index of the news post to delete: ");
                        int index = scanner.nextInt();
                        Database.deleteNewsPost(username, index - 1);
                        System.out.println("News post deleted successfully!\n");
                        break;
                    case 4:
                        // Logout
                        loggedIn = false;
                        username = "";
                        System.out.println("Logged out successfully. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.\n");
                }
            }
        }
    }
}
