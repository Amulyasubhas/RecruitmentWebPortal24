
package com.recruit.springboot.RecruitmentWebPortal.DTO;

public class CreateUserDTO {

    private String name;
    private String email;
    private String password;
    private String role; // e.g., "RECRUITER", "HR", etc.

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
