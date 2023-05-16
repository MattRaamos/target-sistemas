package com.exercicios.targetsistemas;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        int c = 1;
        String sequence = "0, 1";

        while (c < num) {
            sequence += ", " + c;
            a = b;
            b = c;
            c = a + b;
        }

        if (c == num) {
            sequence += ", " + c;
            System.out.println("O número " + num + " pertence à sequência de com.exercicios.targetsistemas.Fibonacci: " + sequence);
        } else {
            System.out.println("O número " + num + " não pertence à sequência de com.exercicios.targetsistemas.Fibonacci");
        }
    }
}
