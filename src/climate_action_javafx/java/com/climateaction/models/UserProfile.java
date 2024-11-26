
package climate_action_javafx.java.com.climateaction.models;

public class UserProfile {
    private String username;
    private String email;
    private String preferences;

    public UserProfile(String username, String email, String preferences) {
        this.username = username;
        this.email = email;
        this.preferences = preferences;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
}