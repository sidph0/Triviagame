package org.example;

class Casting {
    public static void main(String[] args) {
        //Converting datatypes

        int loan = 100;
        float interestRate = 0.787f;

        int interest = (int) (loan * interestRate);
        System.out.println(interest);
    }
}

class ternary {
    public static void main(String[] args) {

        int exam = 75;
        int prize = 0;

        if(exam >= 75) {
            // prize = 10;
        } else // prize = 0;

        System.out.println(prize);

        prize = exam >= 75 ? 10 : 0;
        System.out.println(prize);
    }
}
