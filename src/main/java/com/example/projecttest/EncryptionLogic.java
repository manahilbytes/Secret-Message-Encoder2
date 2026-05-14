package com.example.projecttest;

public interface EncryptionLogic extends DataStorable{

    String encrypt(String input);
    String decrypt(String input);
}