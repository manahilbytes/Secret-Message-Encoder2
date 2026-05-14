package com.example.projecttest;

public class ProcessingManager implements EncryptionLogic, DataStorable {
    private String lastResult = "";

    @Override
    public String encrypt(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch == ' ') result.append(' ');
            else if (ch == 'a') result.append('@');
            else if (ch == 'e') result.append('#');
            else if (ch == 'i') result.append('*');
            else if (ch == 'o') result.append('$');
            else if (ch == 'u') result.append('&');
            else if (ch == 'A') result.append('^');
            else if (ch == 'E') result.append('!');
            else if (ch == 'I') result.append('+');
            else if (ch == 'O') result.append('=');
            else if (ch == 'U') result.append('?');

            else result.append((char) (ch + 3));
        }
        return result.toString();
    }

    @Override
    public String decrypt(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch == ' ') result.append(' ');
            else if (ch == '@') result.append('a');
            else if (ch == '#') result.append('e');
            else if (ch == '*') result.append('i');
            else if (ch == '$') result.append('o');
            else if (ch == '&') result.append('u');
            else if (ch == '^') result.append('A');
            else if (ch == '!') result.append('E');
            else if (ch == '+') result.append('I');
            else if (ch == '=') result.append('O');
            else if (ch == '?') result.append('U');
            else result.append((char) (ch - 3));
        }
        return result.toString();
    }

    @Override
    public void storeResult(String result) { this.lastResult = result; }
    @Override
    public String getResult() { return lastResult; }
}