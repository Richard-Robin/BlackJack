package ca.sheridancollege.project;
import java.util.List;

public class Dealer{
    private List<Card> hand;
    private Deck deck;
    
    
    public Dealer()
    {
        this.deck=new Deck();
        this.deck.shuffle();
    }
}
