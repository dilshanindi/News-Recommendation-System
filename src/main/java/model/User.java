package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private String fullName;
    private String email;
    private String password;
    private List<String> readingHistory;  // List of article titles or IDs read by the user
    private Set<String> preferences;      // Preferred categories of articles
    private List<String> likedArticles;   // Articles liked by the user
    private List<String> skippedArticles; // Articles skipped by the user

    // Constructor
    public User(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.readingHistory = new ArrayList<>();
        this.preferences = new HashSet<>();
        this.likedArticles = new ArrayList<>();
        this.skippedArticles = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getReadingHistory() {
        return readingHistory;
    }

    public void addToReadingHistory(String article) {
        this.readingHistory.add(article);
    }

    public Set<String> getPreferences() {
        return preferences;
    }

    public void addToPreferences(String category) {
        this.preferences.add(category);
    }

    public List<String> getLikedArticles() {
        return likedArticles;
    }

    public void likeArticle(String article) {
        this.likedArticles.add(article);
    }

    public List<String> getSkippedArticles() {
        return skippedArticles;
    }

    public void skipArticle(String article) {
        this.skippedArticles.add(article);
    }
}
