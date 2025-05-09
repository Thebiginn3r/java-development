package com.plurasight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter player 1 name: ");
            String player1Name = scanner.nextLine();

            System.out.print("Enter player 2 name: ");
            String player2Name = scanner.nextLine();

        while (true) {

            Deck deck = new Deck();
            deck.shuffle();

            Hand player1Hand = new Hand();
            player1Hand.deal(deck.deal());
            player1Hand.deal(deck.deal());

            Hand player2Hand = new Hand();
            player2Hand.deal(deck.deal());
            player2Hand.deal(deck.deal());

            int player1Score = player1Hand.getValue();
            System.out.println(player1Name + "'s hand");
            player1Hand.print();
            System.out.println(player1Name + " score is " + player1Score);

            System.out.println();

            int player2Score = player2Hand.getValue();
            System.out.println(player2Name + "'s hand");
            player2Hand.print();
            System.out.println(player2Name + " score is " + player2Score);

            System.out.println();




            int player1Scoree = player1Hand.getValue();
            int player2Scoree = player2Hand.getValue();

            if (player1Score < 21){
                System.out.print("Would you like to hit " + player1Name + "? (y/n): ");
                String addCard = scanner.nextLine();
                if(addCard.equalsIgnoreCase("y")){
                    player1Hand.deal(deck.deal());
                    player1Hand.print();
                    player1Scoree = player1Hand.getValue();
                    System.out.println("Your new hand amount is " + player1Scoree);
                    if (player1Scoree > 21){
                        System.out.println(player1Name + " lost");
                    }
                }
            }

            if (player2Score < 21){
                System.out.print("Would you like to hit " + player2Name + "? (y/n): ");
                String addCard2 = scanner.nextLine();
                if(addCard2.equalsIgnoreCase("y")){
                    player2Hand.deal(deck.deal());
                    player2Hand.print();
                    player2Scoree = player2Hand.getValue();
                    System.out.println("Your new hand amount is " + player2Scoree);
                    if (player2Scoree > 21){
                        System.out.println(player2Name + " lost");
                    }
                }
            }

            if (player1Scoree <= 21 && (player1Scoree > player2Scoree || player2Scoree > 21)) {
                System.out.println(player1Name + " wins");
            } else if (player2Scoree <= 21 && (player2Scoree > player1Scoree || player1Scoree > 21)) {
                System.out.println(player2Name + " wins");
            } else {
                System.out.println("Its a tie");
            }

            System.out.println("Would you like to play again?(y/n)");
            String escCont = scanner.nextLine();
            if (!escCont.equalsIgnoreCase("y")){
                break;
            }

            //scanner.close();
        }
    }
}
