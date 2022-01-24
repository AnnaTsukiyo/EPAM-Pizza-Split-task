package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner input = new Scanner(System.in);
        int numberOfPeople = input.nextInt();
        int pizzaPieces = input.nextInt();
        System.out.println(lcm(numberOfPeople, pizzaPieces) / pizzaPieces);
        System.out.println();
    }

    static int gcf(int a, int b) {
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcf(a, b);
    }
}

