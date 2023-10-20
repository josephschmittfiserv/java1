package com.xpanxion.assignments.student;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {
    }

    //
    // Public methods
    //

    public void ex1() {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Student 1: ex1.");
        System.out.println("Enter in your name: ");
        input = sc.nextLine();

        System.out.println("Your name in lower case is: " + input.toLowerCase());
    }

    public void ex2() {
        Scanner sc = new Scanner(System.in);
        String input;
        int count = 0;
        System.out.println("Student 1: ex2.");
        System.out.println("Enter in a string: ");
        input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                count++;
            }
        }
        System.out.println("The amount of uppercase letters in this are: " + count);
    }

    public void ex3() {
        Scanner sc = new Scanner(System.in);
        String input;
        int count = 0;
        System.out.println("Student 1: ex3.");
        System.out.println("Enter in a sentence: ");
        input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input);

        System.out.println("Every other word capatalized is: ");

        while (st.hasMoreTokens()) {

            if (count % 2 == 0)
                System.out.println(st.nextToken().toUpperCase());

            else
                System.out.println(st.nextToken().toLowerCase());

            count++;
        }
    }

    public void ex4() {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Student 1: ex4.");
        System.out.print("Enter in a word to see if palindrome:");
        input = sc.next();

        String sb = new StringBuilder(input).reverse().toString();

        if (input.equals(sb))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public void ex5() {
        Scanner sc = new Scanner(System.in);
        String input = "", vowel = "aeiou", consonant = "bcdfghjklmnpqrstvwxyz";
        int vowelCount = 0, consantCount = 0;
        System.out.println("Student 1: ex5.");
        while (!input.equals("quit")) {
            System.out.print("Enter in a word to see constants and vowels:");
            input = sc.nextLine().toLowerCase();
            if (input.equals("quit"))
                break;

            for (int i = 0; i < input.length(); i++) {
                if (vowel.indexOf(input.charAt(i)) != -1)
                    vowelCount++;
                else if (consonant.indexOf(input.charAt(i)) != -1)
                    consantCount++;
            }

            System.out.println("The number of vowels are: " + vowelCount +
                    " and the number of constants are: " + consantCount);
            vowelCount = 0;
            consantCount = 0;
        }

    }

    public void ex6() {
        Scanner sc = new Scanner(System.in);
        int input1, input2;

        System.out.println("Student 1: ex6.");

        System.out.print("Enter first number:");
        input1 = sc.nextInt();
        System.out.print("Enter first number:");
        input2 = sc.nextInt();
        
        System.out.println("Result: " + (input1 + input2));
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
    public static void main(String[] args) {
        JavaOne javaOne = new JavaOne();
        javaOne.ex6();
    }
}
