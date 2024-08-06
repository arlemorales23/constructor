package dataReading;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Addition addition = new Addition();
        System.out.println("número 1: ");
        addition.n1 = lector.nextInt();
        System.out.println("número 2: ");
        addition.n2 = lector.nextInt();

        System.out.println("La suma es : " + addition.add() );
    }
}
