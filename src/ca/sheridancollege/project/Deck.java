package ca.sheridancollege.project;

public class Deck extends GroupOfCards{
    public Deck()
    {
        super(52);
        String[] suits ={"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks={"2","3","4","5","6","7","8","10","Jack","Queen","King","Ace"};
        
        for(String suit: suits)
        {
            for(String rank: ranks)
            {
                getCards().add(new BlackjackCard(suit,rank));
                
            }
        }
        
    }
    
    public Card drawCard()
    {
        return getCards().remove(0);
    }
}