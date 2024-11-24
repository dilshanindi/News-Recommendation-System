package model;

public class Admin {
    private String name;
    private String email;
    private String password;

    // Constructor
    public Admin(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Optional: Display admin details
    public String toString() {
        return "Admin: " + name + " (" + email + ")";
    }
}
