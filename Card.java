public class Card implements Comparable<Card> {
    private String suit;  // "Hearts", "Spades"
    private int rank;     // 1 to 13 for Ace to King

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.rank, other.rank); // Sort by rank
    }
    
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
