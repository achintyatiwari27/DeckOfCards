package com.BridgeLabz;

import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        System.out.println("Welcome to Deck of Cards gaming program :) ");
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] player = {"Player 1", "Player 2", "Player 3", "Player 4"};
        String[][] deck = new String[suits.length][ranks.length];
        int card = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[i][j] = suits[i] + " " + ranks[j];
                System.out.println(deck[i][j]);
                card++;
            }
        }
        System.out.println("Total number of cards are:" + card);
    }
}

