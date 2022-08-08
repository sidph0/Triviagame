package org.javaintro;

import java.util.Scanner;

public class TriviaGamePart2 {
    public static void main(String[] args) {

        String[] questions = new String[5];
        questions[0] = "What is 3 + 2?";
        questions[1] = "What state are you in?";
        questions[2] = "What IDE is this?";
        questions[3] = "What is the chemical symbol of iron?";
        questions[4] = "What is the capital of the UK?";

        String[] answers = new String[5];
        answers[0] = "5";
        answers[1] = "California";
        answers[2] = "IntelliJ";
        answers[3] = "Fe";
        answers[4] = "London";

        Scanner scanner = new Scanner(System.in);
        int points = 0;

        while (true) {
            printTitle();

            for (int i = 0; i < questions.length; i++) {
                printQuestions(questions[i]);
                String userAnswer = scanner.next();

                if (isCorrect(userAnswer, answers[i])) {
                    printCorrect();
                    points = increasePoints(points);
                    printCurrentPoints(points);
                } else {
                    printIncorrect();
                    printCorrectAns(answers[i]);
                }
            }
            System.out.println("--------------------------------------------------");
            printTotalPoints(points);
            System.out.println("--------------------------------------------------");
// PLay game again

            boolean acceptableAnswer = false;
            printPlayAgain();
            while (!acceptableAnswer) {
                String userAnswer = scanner.next();
                if (userAnswer.equalsIgnoreCase("Y")) {
                    points = 0;
                    acceptableAnswer = true;
                    continue;
                } else if (userAnswer.equalsIgnoreCase("N")) {
                    printBye();
                    System.exit(0);
                } else {
                    System.out.println("Did not understand answer, please use Y/N");
                    printPlayAgain();
                }
            }

        }

    }

    //Methods in use for strings

    public static void printTitle() {
        System.out.println("--------------------------------------------------");
        System.out.println("Sid's Trivia Game!");
        System.out.println("--------------------------------------------------");
    }

    public static int increasePoints(int points) {
        return points + 1;
    }

    public static void printCurrentPoints(int points) {
        System.out.println("You have " + points + " points!");
    }

    public static void printTotalPoints(int points) {
        System.out.println("You had " + points + " points!");
    }

    public static void printPlayAgain() {
        System.out.println("Play Again? Y/N");
    }

    public static void printBye() {
        System.out.println("--------------------------------------------------");
        System.out.println("Thank you for playing Sid's Trivia Game!");
        System.out.println("--------------------------------------------------");
    }

    public static void printQuestions(String question) {
        System.out.println(question);
    }

    public static boolean isCorrect(String userAnswer, String realAnswer) {
        return userAnswer.equalsIgnoreCase(realAnswer);
    }

    public static void printCorrect() {
        System.out.println("--------------------------------------------------");
        System.out.println("Correct Answer! Good job.");
        System.out.println("--------------------------------------------------");
    }

    public static void printIncorrect() {
        System.out.println("--------------------------------------------------");
        System.out.println("Incorrect answer. Nice try.");
    }

    public static void printCorrectAns(String realAnswer) {
        System.out.println("The correct answer is: " + realAnswer);
        System.out.println("--------------------------------------------------");
    }


}




