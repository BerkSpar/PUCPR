/*
 * Print the Collatz Conjecture.
 * https://en.wikipedia.org/wiki/Collatz_conjecture
 */

import java.util.Scanner;

public class Collatz {
    static void collatz(int number) {
        System.out.println(number);
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }

            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please type a positive integer number: ");
        int inputData = in.nextInt();

        if (inputData < 1) {
            System.out.println("Invalid number");
            return;
        }

        collatz(inputData);
    }
}
