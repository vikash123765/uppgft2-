package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {

            List<Integer> primeNumbers = new ArrayList<>();

            for (int numberToCheck = 2; numberToCheck <= 350000; numberToCheck++) {
                boolean isPrime = true;
                for (int factor = 2; factor <= numberToCheck/2; factor++) {
                    if (numberToCheck % factor == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumbers.add(numberToCheck);

                }
            }
            System.out.println("The prime numbers to 350000 are");
            for (int number : primeNumbers);


            System.out.println(primeNumbers);
        });

        Thread thread2 = new Thread(() -> {

            List<Integer> primeNumbers = new ArrayList<>();

            for (int numberToCheck = 2; numberToCheck <= 150000; numberToCheck++) {
                boolean isPrime = true;
                for (int factor = 2; factor <= numberToCheck/2; factor++) {
                    if (numberToCheck % factor == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumbers.add(numberToCheck);

                }
            }
            System.out.println("The prime numbers to 150000 are");
            for (int number : primeNumbers);


            System.out.println(primeNumbers);

        });

        thread.start();
        thread.join();


        thread2.start();




}}