import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Database {
    private static HashMap<String, User> users = new HashMap<>();
    private static HashMap<String, List<NewsPost>> newsPosts = new HashMap<>();

    public static void addUser(String username, String password) {
        User user = new User(username, password);
        users.put(username, user);
        newsPosts.put(username, new ArrayList<>());
    }

    public static User getUser(String username) {
        return users.get(username);
    }

    public static List<NewsPost> getNewsPosts(String username) {
        return newsPosts.get(username);
    }

    public static void addNewsPost(String username, NewsPost newsPost) {
        List<NewsPost> userPosts = newsPosts.get(username);
        if (userPosts != null) {
            userPosts.add(newsPost);
        }
    }

    public static void deleteNewsPost(String username, int index) {
        List<NewsPost> userPosts = newsPosts.get(username);
        if (userPosts != null && index >= 0 && index < userPosts.size()) {
            userPosts.remove(index);
        }
    }
}
