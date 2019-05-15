package edu.coursera.parallel;

import edu.coursera.parallel.ReciprocalArraySum;

public class Main {

    public static void main(String[] args) {

        double [] ten_numbers = new double[10];
        double [] hundred_integers = new double[100];
        double [] thousand_integers = new double[1000];
        double [] ten_thousand_integers = new double[10000];

        for (int i = 0; i < ten_numbers.length; i++) {
            ten_numbers[i] = i + 1;
        }

        for (int i=0; i < hundred_integers.length; i++) {
            hundred_integers[i] = i + 1;
        }

        for (int i=0; i < thousand_integers.length; i++) {
            thousand_integers[i] = i + 1;
        }

        for (int i=0; i < ten_thousand_integers.length; i++) {
            ten_thousand_integers[i] = i + 1;
        }

        // Sum of first ten numbers is 2.9289682539682538
        // Sum of first hundred numbers is 5.187377517639621
        // Sum of first thousand numbers is 7.485470860550345
        // Sum of first ten thousand numbers is 9.787606036044386
        System.out.println("Sum of first ten numbers is " + ReciprocalArraySum.parManyTaskArraySum(ten_numbers, 5));
        System.out.println("Sum of first hundred numbers is " + ReciprocalArraySum.parManyTaskArraySum(hundred_integers, 5));
        System.out.println("Sum of first thousand numbers is " + ReciprocalArraySum.parManyTaskArraySum(thousand_integers, 5));
        System.out.println("Sum of first ten thousand numbers is " + ReciprocalArraySum.parManyTaskArraySum(ten_thousand_integers, 5));


        // Sum of first ten numbers is 2.9289682539682538
        // Sum of first hundred numbers is 5.187377517639621
        // Sum of first thousand numbers is 7.485470860550343
        // Sum of first ten thousand numbers is 9.78760603604438
        System.out.println("Sum of first ten numbers is " + ReciprocalArraySum.parManyTaskArraySum(ten_numbers, 5));
        System.out.println("Sum of first hundred numbers is " + ReciprocalArraySum.parManyTaskArraySum(hundred_integers, 10));
        System.out.println("Sum of first thousand numbers is " + ReciprocalArraySum.parManyTaskArraySum(thousand_integers, 20));
        System.out.println("Sum of first ten thousand numbers is " + ReciprocalArraySum.parManyTaskArraySum(ten_thousand_integers, 40));
    }
}
