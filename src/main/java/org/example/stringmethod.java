package org.example;

import java.util.Scanner;

public class stringmethod {
    public static void main(String[] args) {
        String sentence = "This is a sentence.";
        System.out.println(sentence);
        //adding a method
        System.out.println("The length is " + sentence.length());


        //Upper and lower case

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());


        //indexing a position in a sentence

        System.out.println("The word 'sentence' is found at " + sentence.indexOf("sentence"));

        //replacing part of a string

        System.out.println(sentence.replace("sentence", "sandwich"));
        System.out.println("Does the sentence start with 'T'? " + sentence.startsWith("T"));
        System.out.println("Does the sentence end with '!'? " + sentence.endsWith("!"));


        String e = "";
        boolean empty = e.isEmpty();
        System.out.println("Is string e empty? " + empty);

    }
}
