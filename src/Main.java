import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner INPUT = new Scanner((System.in));

        String secretPassword = "paris";

        System.out.println("Welcome to the Secure Login Service.");
        System.out.println("\nPlease enter your username.\n>>");
        INPUT.nextLine();

        System.out.println("\nPlease enter your password.\n>>");

        String attempt;
        attempt = INPUT.nextLine();

        if (attempt.equals(secretPassword)){
            System.out.println("Access Granted!");
        }
        else{

            while(!attempt.equals(secretPassword)){
            System.out.println("Password is incorrect. Please try again.\n>>");
            attempt = INPUT.nextLine();

        }
            System.out.println("Access Granted!");
    }
}}