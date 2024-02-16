package com.bridgelabz.regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class Regex {
    public void firstnameValidation() throws CustomisedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter THe First Name(Caps First Letter)");
        String fname = scanner.nextLine();
        // regex of design pattern for the firstname validation(First Letter Caps,Must 3 charac)
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fname);
        if (matcher.matches())
            System.out.println("Valid First Name : " + fname);
        else
            throw new CustomisedException("Invalid First Name! :" + fname);
    }

    public void lastnameValidation() throws CustomisedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter THe First Name(Caps First Letter)");
        String lname = scanner.nextLine();
        // regex of design pattern for the lastname validation(First Letter Caps,Must 3 charac)
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        // Pattern object creation by compiling the given regular expression
        Pattern pattern = Pattern.compile(regex);
        // Matcher object creation to perform matching operations on the input string (lname)
        Matcher matcher = pattern.matcher(lname);
       // Checking if the matcher finds a complete match of the regex in the input string
        if (matcher.matches())
            System.out.println("Valid last Name : " + lname);
        else
            throw new CustomisedException("Invalid Last Name! :" + lname);
    }

    public void phoneValidation() throws CustomisedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Phone number");
        String phno = scanner.nextLine();
        // Defines regex for the input string validation +91 3432.....
        String regex = "^[+][91]+\\s[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phno);
        if (matcher.matches())
            System.out.println("Valid Phone Number : " + phno);
        else
            System.out.println("Invalid Phone number ! : " + phno);
    }

    public void emailValidation() throws CustomisedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email ID");
        String mail = scanner.nextLine();
        String regex = "^(?!.*(\\.\\.|.\\|\\./d|@\\.|@.*@|\\.com\\.com|@.*[^/w/d.-]|/.$|[^\\w\\d@.+-]))[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        if (matcher.matches())
            System.out.println("Valid Email ID : " + mail);
        else
            System.out.println("Invalid EMAIL ID : " + mail);
    }

    public void passwordValidation() throws CustomisedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Passsword");
        String pwd = scanner.nextLine();
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*//d)(?=.*[!@#$%^&*()_+=<>?]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pwd);
        if (matcher.matches())
            System.out.println("Valid Password : " + pwd);
        else
            System.out.println("Invalid Password : " + pwd);
    }
}
       /*
        if(ispwd(pwd))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

        private static boolean ispwd(String pwd){

           // String regex = "^[a-zA-Z0-9._\\-!@#$%&]{8,}$";
        return Pattern.matches(regex,pwd);
        }
        */
