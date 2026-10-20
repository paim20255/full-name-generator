package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;
        String suffix;
        String fullName = "";

        System.out.print("Please enter your name \n" );
        System.out.print("First name: ");
        firstName = input.nextLine();
        fullName += firstName + " ";

        System.out.print("Middle name: ");
        middleName = input.nextLine();
        fullName += middleName + " ";

        System.out.print("Last name: ");
        lastName = input.nextLine();
        fullName += lastName + " ";

        System.out.print("Suffix: ");
        suffix = input.nextLine();
        fullName += suffix;

        System.out.print("Your full name: " + fullName);








    }
}
