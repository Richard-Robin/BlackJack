package ca.sheridancollege.project;

public class BlackjackPlayer extends Player{
    private GroupOfCards hand;
    
    public BlackjackPlayer(String name)
    {
        super(name);
        hand=new GroupOfCards(2);
    }
    
    public void addCard(Card card)
    {
        hand.getCards().add(card);
    }
    
    public int getHandValue()
    {
        int value=0;
        int aceCount=0;
        for(Card card: hand.getCards())
        {
            BlackjackCard blackjackCard=(BlackjackCard) card;
            value+= blackjackCard.getValue();
            if(blackjackCard.getValue()==11)
            {
                aceCount++;
            }
            
        }
        while(value>21 && aceCount>0)
        {
            value-=10;
            aceCount--;
    
        }
        
        return value;
    }
    
    public String getHand()
    {
        return hand.getCards().toString();
    }
    
    @Override
    public void play()
    {
    }
}