package com.bridgelabz.regex;
import java.util.regex.Pattern;
import java.util.Scanner;
class Regex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter THe First Name");
        String fname = scanner.nextLine();

        System.out.println("Enter Last Name");
        String lname = scanner.nextLine();

        System.out.println("Enter Phone number");
        String phno = scanner.nextLine();

        System.out.println("Enter Email ID");
        String mail = scanner.nextLine();

        if (isFirstName(fname))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
        private static boolean isFirstName(String fname)
        {   String regex = "^[A-Z][a-zA-Z]{2,}$";
            return Pattern.matches(regex,fname);
        }
    }
