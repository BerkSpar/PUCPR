/*
 * Print the Collatz Conjecture.
 * https://en.wikipedia.org/wiki/Collatz_conjecture
 */

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please type a positive integer number: ");
        int inputData = in.nextInt();

        if(inputData < 1) {
            System.out.println("Invalid number");
            return;
        }

        int currentNumber = inputData;
        while (currentNumber != 1) {
            if(currentNumber%2 == 0) {
                currentNumber = currentNumber/2;
            } else {
                currentNumber = 3 * currentNumber + 1;
            }

            System.out.println(currentNumber);
        }
    }
}
