package com.example.projecttest;

public class PasswordManager {
    private String savedPassword = "";

    public void setPassword(String password) {
        this.savedPassword = password;
    }
    public String getPassword() {
        return this.savedPassword; }
    public boolean verifyPassword(String input) {
        return this.savedPassword.equals(input);
    }
}