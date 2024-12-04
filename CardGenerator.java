import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardGenerator {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final Random random = new Random();

    public static List<Card> generateCards(int size) {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String suit = SUITS[random.nextInt(SUITS.length)]; // Random suit selection
            int rank = random.nextInt(13) + 1; // Random cards from 1 - 13
            cards.add(new Card(suit, rank)); // Add cards to a list
        }
        return cards;
    }
    // Compare if the list is sorted 
    public static boolean isSorted(List<Card> cards) {
        for (int i = 1; i < cards.size(); i++) { // Compare current card with previous card
            if (cards.get(i - 1).compareTo(cards.get(i)) > 0) {
                return false;
            }
        }
        return true;
    }
}
