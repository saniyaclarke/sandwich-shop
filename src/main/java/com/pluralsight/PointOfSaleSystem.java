package com.pluralsight;

import java.util.Scanner;

public class PointOfSaleSystem {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        float sandwichCost1 = 5.45f;
        float sandwichCost2 = 8.95f;

        System.out.println("""
                 Sandwhich Menu:
                A. 1: Regular: base price $5.45
                B. 2: Large: base price $8.95
                """);

        System.out.println("Enter A or B for which size you are buying.");
        String sandwichSelection = myScanner.nextLine();

        if
        (sandwichSelection.equals("A")) {
            System.out.println(" You selected a regular size");
        } else
            System.out.println(" You selected the large size");

        System.out.println("Enter your age, to see if you are eligible for any discount.");
        int age = myScanner.nextInt();

        if
        (age <= 17) {
            System.out.println("Receives a 10% discount!: ");

            if
                (sandwichSelection.equalsIgnoreCase("A"))
                System.out.println(sandwichCost1 - sandwichCost1 * .10 );

            if
                (sandwichSelection.equalsIgnoreCase("B"))
                System.out.println(sandwichCost2 - sandwichCost2* .10);


        } else
            if (age >= 65) {
            System.out.println("Receives a 20% discount!: ");

            if
                (sandwichSelection.equalsIgnoreCase("A"))
                    System.out.println(sandwichCost1 - sandwichCost1 * .20 );

            if
                (sandwichSelection.equalsIgnoreCase("B"))
                    System.out.println(sandwichCost2 - sandwichCost2 * .20);}

            else
            {
                System.out.println("No discount ");

                if (sandwichSelection.equalsIgnoreCase("A"))
                System.out.println(sandwichCost1);

                else
                    System.out.println(sandwichCost2);
                }



        }


    }

 ///Step 1
 /// Prompt the user for the size of the sandwich (1 or 2):
 /// a. 1: Regular: base price $5.45
 /// b. 2: Large: base price $8.95
 /// Prompt the user for their age:
 /// a. Student (17 years old or younger) – receive a 10% discount
 /// b. Seniors (65 years old or older) – receive a 20% discount
 /// c. Everyone else won't receive a discount
 /// Display the cost of the sandwich to the screen