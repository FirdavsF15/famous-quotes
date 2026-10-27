package com.pluralsight;

import java.util.Scanner;

public class Quotes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] quotes = new String[10];

        quotes[0] = "Do not whine... Do not complain. Work harder. Spend more time alone.";
        quotes[1] = "The truth is, everyone is going to hurt you. You just got to find the ones worth suffering for.";
        quotes[2] = "If you’re lonely when you’re alone, you’re in bad company.";
        quotes[3] = "I’m not much but I’m all I have.";
        quotes[4] = "All i ever wanted was to reach out and touch another human being not just with my hands but with my heart";
        quotes[5] = "You only live once, but if you do it right, once is enough.";
        quotes[6] = "Be the change that you wish to see in the world";
        quotes[7] = "It is better to be hated for what you are than to be loved for what you are not.";
        quotes[8] = "It is not a lack of love, but a lack of friendship that makes unhappy marriages.";
        quotes[9] = "I like nonsense, it wakes up the brain cells. Fantasy is a necessary ingredient in living.";

        try{
            System.out.print("Select a number between 1 and 10: ");
            int num = Integer.parseInt(scanner.nextLine());


            System.out.println("\n" + quotes[num-1]);
        }catch(Exception e){
            System.out.println("Your number was out of range!");
        }




    }
}
