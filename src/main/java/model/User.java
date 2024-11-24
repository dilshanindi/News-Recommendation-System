package model;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String name;
    private String email;
    private String password;
    private Set<String> preferences;

    // Constructor
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.preferences = new HashSet<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for preferences
    public Set<String> getPreferences() {
        return preferences;
    }

    // Add a preference
    public void addPreference(String preference) {
        this.preferences.add(preference);
    }

    // Remove a preference
    public void removePreference(String preference) {
        this.preferences.remove(preference);
    }

    // Override toString for better debugging
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", preferences=" + preferences +
                '}';
    }
}
