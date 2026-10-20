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


        System.out.print("Please enter your name: ");
        firstName = input.nextLine();
        fullName += firstName;
        System.out.println("First name: " + firstName);

        System.out.println("Middle name: ");
        middleName = input.nextLine();
        fullName += middleName;
        System.out.println("Middle name: " + middleName);





    }
}
