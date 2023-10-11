import java.util.HashMap;

public class Database {
    private static HashMap<String, User> users = new HashMap<>();

    public static void addUser(String username, String password) {
        User user = new User(username, password);
        users.put(username, user);
    }

    public static User getUser(String username) {
        return users.get(username);
    }
}
