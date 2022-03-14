package com.greatlearning.labOne;

import java.util.Random;

public class CredentialService {

    public static String generatePassword() {
        int length = 8;
        final String charAlphanum = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        final String charSpecial = "!@#$%&*()-_";
        final String characters = charAlphanum.concat(charSpecial);
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            int randomPass = random.nextInt(characters.length());
            sb.append(characters.charAt(randomPass));
        }
        return sb.toString();

    }

    public void showCredentials(String firstName, String mail) {
        System.out.println("Hello " + firstName + " your generated credentials are as follows");
        System.out.println("EmailId is ->" + mail);
        System.out.println("Password is ->" + generatePassword());
    }


    public String generateEmailAddress(String firstName, String lastName, String department) {
        return firstName + lastName + "@" + department + ".greatlearning.com";
    }
}
