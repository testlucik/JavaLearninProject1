package com.tekwillacademy.operationsandciclingfunctions;

public class PrintNumberService {
    public static void main(String[] args) {

        int min = 3;
        int max = 1009;

        //Print only Numbers where i % 2 = 0
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Print only Numbers where i % 2 != 0
        int i = min;
        while (i < max) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

      //Print only Numbers where i % 2 = 1
        int b = max;
        do {
            if (b % 2 == 1) {
                System.out.println(b);
            }
            b--;
        } while(b >= min);


    }
}
