package com.bridgelabz.regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class Regex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter THe First Name(Caps First Letter)");
        String fname = scanner.nextLine();

        System.out.println("Enter Last Name(Caps first Letter)");
        String lname = scanner.nextLine();

        System.out.println("Enter Phone number");
        String phno = scanner.nextLine();

        System.out.println("Enter Email ID");
        String mail = scanner.nextLine();

        System.out.println("Enter Passsword");
        String pwd = scanner.nextLine();

        if (isFirstName(fname))
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
        if(isLastName(lname))
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");
        if(isEmail(mail))
            System.out.println("Valid E-mail");
        else
            System.out.println("Invalid E-mail");
        if(isphno(phno))
            System.out.println("Valid PHone Number");
        else
            System.out.println("Invalid Phone number");
        if(ispwd(pwd))
            System.out.println("Valid Password");
        else
            System.out.println("Onvalid Password");
    }
        private static boolean isFirstName(String fname)
        {   String regex = "^[A-Z][a-zA-Z]{2,}$";
            return Pattern.matches(regex,fname);
        }
        private static boolean isLastName(String lname)
        {
            String regex = "^[A-Z][a-zA-Z]{2,}$";
            return Pattern.matches(regex,lname);
        }
        private static boolean isEmail(String mail){
            String regex = "^[A-Za-z0-9._%+-]+@[a-zA-z0-9.-]+\\.[a-zA-Z]{2,}";
            return Pattern.matches(regex,mail);
        }
        private static boolean isphno(String phno){
            String regex = "^[+][91]+\\s[0-9]{10}$";
            return Pattern.matches(regex,phno);
        }
        private static boolean ispwd(String pwd){
       String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*//d).{8,}$";
           // String regex = "^[a-zA-Z0-9._\\-!@#$%&]{8,}$";
        return Pattern.matches(regex,pwd);
        }
    }