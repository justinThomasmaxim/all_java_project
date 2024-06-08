package Lesson6_1;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        Deck d = new Deck();
        d.shuffle(); // Panggil metode shuffle
        d.print();

        // Bagian Deal the Hand
        Hand playerHand = new Hand();
        playerHand.dealHand(d);
        playerHand.play(d);

        // Buat dan mainkan tangan dealer
        Hand dealerHand = new Hand();
        dealerHand.dealHand(d);
        dealerHand.play(d);
    }
}

class Deck {
    Card[] cardArray = new Card[52];

    Deck() { // konstruktor
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for (int i = 1; i <= suits; i++)
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++)
            System.out.println(cardArray[i]);
    }

    // Fitur A: Metode shuffle
    public void shuffle() {
        Collections.shuffle(Arrays.asList(cardArray));
    }
}

class Hand {
    Card[] hand = new Card[5];
    int handValue = 0;
    int cardCount = 0;

    // Fitur B: Deal the Hand
    public void dealHand(Deck deck) {
        for (int i = 0; i < 2; i++) {
            hand[cardCount] = deck.cardArray[cardCount];
            cardCount++;
        }
        calculateHandValue();
    }

    // Fitur C: Sesuaikan poin untuk Ace
    private void calculateHandValue() {
        handValue = 0; // Reset hand value before recalculating
        int aceCount = 0;

        for (Card card : hand) {
            handValue += card.points;
            if (card.name.equals("Ace")) {
                aceCount++;
            }
        }

        // Adjust for Aces
        while (aceCount > 0 && handValue > 21) {
            handValue -= 10; // Count Ace as 1 instead of 11
            aceCount--;
        }
    }

    // Fitur B: Tampilkan Tangan
    public void displayHand() {
        for (int i = 0; i < cardCount; i++) {
            System.out.println(hand[i]);
        }
        System.out.println("Total Poin: " + handValue);
    }

    // Fitur B: Pemain bermain
    public void play(Deck deck) {
        // Fitur B: Player plays
        while (handValue < 21) {
            displayHand();
            // Anggap input pengguna untuk kesederhanaan
            System.out.println("Apakah Anda ingin kartu lain? (ya/tidak)");
            // Di sini Anda akan menangani input pengguna untuk memutuskan apakah akan mengambil kartu lain
            // Untuk kesederhanaan, mari asumsikan pemain selalu ingin kartu lain
            hand[cardCount] = deck.cardArray[cardCount];
            cardCount++;
            calculateHandValue();
        }

        // Fitur D: Dealer bermain
        while (handValue < 16) {
            hand[cardCount] = deck.cardArray[cardCount];
            cardCount++;
            calculateHandValue();
        }

        // Tampilkan tangan akhir
        displayHand();
    }
}

// Bagian kode Card tetap tidak berubah
class Card{
	String suit,name;
	int points;
	Card(int n1, int n2){
	suit = getSuit(n1);
	name = getName(n2);
	points = getPoints(name);
	}
	
	public String toString(){
		return "The " + name + " \t of " + suit;
	}
	
	public String getName(int i){
		if(i == 1) return "Ace";
		if(i == 2) return "Two";
		if(i == 3) return "Three";
		if(i == 4) return "Four";
		if(i == 5) return "Five";
		if(i == 6) return "Six";
		if(i == 7) return "Seven";
		if(i == 8) return "Eight";
		if(i == 9) return "Nine";
		if(i == 10) return "Ten";
		if(i == 11) return "Jack";
		if(i == 12) return "Queen";
		if(i == 13) return "King";
		return "error";
	}
	
	public int getPoints(String n){
		if(n == "Jack" ||n == "Queen" ||n == "King"||n == "Ten")
			return 10;
		if(n == "Two")
			return 2;
		if(n == "Three")
			return 3;
		if(n == "Four")
			return 4;
		if(n == "Five")
			return 5;
		if(n == "Six")
			return 6;
		if(n == "Seven")
			return 7;
		if(n == "Eight")
			return 8;
		if(n == "Nine")
			return 9;
		if(n == "Ace")
			return 1;
		return -1;
	}
	public String getSuit(int i){
		if(i == 1) return "Diamonds";
		if(i == 2) return "Clubs";
		if(i == 3) return "Spades";
		if(i == 4) return "Hearts";
		return "error";
	}
}