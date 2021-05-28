package entities;

public class User {

    // for tests using JsonObject
    public static final String LOGIN = "login";
    public static final String ID = "id";

    private String login;
    private int id;

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }
}
