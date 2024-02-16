package com.bridgelabz.regex;

public class DriverCLass {
    public static void main(String[] args) throws CustomisedException {
        Regex reg = new Regex();
        reg.firstnameValidation();
        reg.lastnameValidation();
        reg.phoneValidation();
        reg.emailValidation();
        reg.passwordValidation();
        System.out.println("Verfification done Successfully!!");
    }
}