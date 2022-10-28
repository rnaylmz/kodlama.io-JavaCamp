package week1.miniproject;

import java.util.Scanner;

//Asal sayı mı?

public class mini1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();

        //Asal sayılar sadece 1'e ve kendisine bölünür.

        boolean isPrime = true;

        if (number < 1) {
            System.out.println("Geçersiz sayı");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                isPrime = false;
        }

        if (isPrime && number != 1)
            System.out.println("asal sayıdır.");
        else
            System.out.println("asal sayı değildir.");
    }
}
