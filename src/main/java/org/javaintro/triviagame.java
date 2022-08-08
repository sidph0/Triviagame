package org.javaintro;

import java.awt.*;
import java.util.Scanner;

public class triviagame {
    public static void main(String[] args) {

        String ques1 = "What is 3 + 2?";
        String ques2 = "What state are you in?";
        String ques3 = "What IDE is this?";

        int ans1 = 5;
        String ans2 = "California";
        String ans3 = "IntelliJ";

        int points = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Welcome to the quiz! Answer all 3 questions.");
        System.out.println("--------------------------------------------------");
        System.out.println(ques1);
        int Input = scanner.nextInt();

        if (Input == ans1) {
            points++;
            System.out.println("Correct Answer! You now have " + points + " points.");
        } else {
            System.out.println("Incorrect answer. You have " + points + " points.");
        }

        System.out.println(ques2);
        String stringInput = scanner.next();

        if (stringInput.equalsIgnoreCase(ans2)) {
            points++;
            System.out.println("Correct Answer! You now have " + points + " points.");
        } else {
            System.out.println("Incorrect answer. You have " + points + " points.");
        }

        System.out.println(ques3);
        String stringInput2 = scanner.next();

        if (stringInput2.equalsIgnoreCase(ans3)) {
            points++;
            System.out.println("Correct Answer! You now have " + points + " points.");
        } else {
            System.out.println("Incorrect answer. You have " + points + " points.");
        }
/*
        System.out.println("Would you like to lose one point?");
        String stringInput3 = scanner.next();
        if (stringInput3.equals("yes")) {
            points--;
            System.out.println("you have lost one point.");

        } else
            System.out.println("You have lost 0 points.");


 */

        if(points >=2) {
            System.out.println("");
            System.out.println("You passed the trivia game with " + points + " points!");
        } else {
            System.out.println("");
            System.out.println("You failed the trivia game with " + points + " points.");
        }
    }
}
