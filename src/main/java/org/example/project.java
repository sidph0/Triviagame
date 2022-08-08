package org.example;

import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");

        int x = 10;

        int y = 34;
        System.out.println("What is 10 + 34?");
        System.out.println(x + y);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your user name:");
        String input = scanner.next();

        System.out.println("Your user name is " + input);

         */
        /*
        boolean questionsAsked = false;
        boolean doesTheCode = true;

        System.out.println("Did I ask? " + questionsAsked);
        System.out.println("But does the code work? " + doesTheCode);



        int healthPoints = 3;

        boolean isAlive = healthPoints > 0;

        System.out.println("Are you alive? " + isAlive + ", You have " + healthPoints + " HP remaining!");

        boolean maxHP = healthPoints == 20;
        boolean failedClass = !isAlive;

        System.out.println("Have you failed the class? " + failedClass);

         */


    }
}


class IfElse {

    public static void main(String[] args) {

        int exam1 = 49;
        int exam2 = 93;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Exam 1 Results");
        exam1 = scanner.nextInt();
        System.out.println("Exam 2 Results");
        exam2 = scanner.nextInt();


        if (exam1 >= 50) {
            System.out.println("you have passed exam1!");
        } else {
            System.out.println("you have failed exam1.");

        }
        if (exam2 >= 50) {
            System.out.println("you have passed exam2!");
        } else {
            System.out.println("you have failed exam2.");

        }

        if (exam1 >= 50 && exam2 >= 50) {
            System.out.println("You passed both exams!");
        }

    }

    class string_method {
        public static void main(String[] args) {
            String sentence = "It is 40.2 meters!";
            System.out.println(sentence);
        }
    }


}
