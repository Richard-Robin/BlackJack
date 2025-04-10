package ca.sheridancollege.project;

import java.util.Scanner;

public class BlackjackGame extends Game{
    private Deck deck;
    private BlackjackPlayer dealer;
    public BlackjackGame(String name)
    {
        super(name);
        deck=new Deck();
        deck.shuffle();
        dealer=new BlackjackPlayer("Dealer");
    }
   
    
    @Override
    public void play()
    {
        Scanner scanner = new Scanner (System.in);
        for(Player player: getPlayers())
        {
            BlackjackPlayer blackjackPlayer= (BlackjackPlayer) player;
            blackjackPlayer.addCard(deck.drawCard());
            blackjackPlayer.addCard(deck.drawCard());
            System.out.println(blackjackPlayer.getName()+ "'s hand: " + blackjackPlayer.getHand());
            
           while (true) {
    System.out.println("Do you want to hit or stand? (h/s)");
    String choice = scanner.nextLine();

    if (choice.equalsIgnoreCase("h")) {
        blackjackPlayer.addCard(deck.drawCard());
        System.out.println(blackjackPlayer.getName() + "'s hand: " + blackjackPlayer.getHand());

        if (blackjackPlayer.getHandValue() > 21) {
            System.out.println(blackjackPlayer.getName() + " busts!");
            break;
        }
    } else if (choice.equalsIgnoreCase("s")) {
        break;
    } else {
        System.out.println("Invalid choice. Please enter 'h' or 's'.");
    }
}

        }
        
        dealer.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
        System.out.println("Dealer's hand: "+ dealer.getHand());
        while(dealer.getHandValue()<17)
        {
        dealer.addCard(deck.drawCard());
        System.out.println("Dealer's hand: " + dealer.getHand());
        }
        
        declareWinner();
        
    }
    
    @Override
    public void declareWinner()
    {
        for(Player player: getPlayers())
        {
            BlackjackPlayer blackjackPlayer= (BlackjackPlayer) player;
            int playerValue=blackjackPlayer.getHandValue();
            int dealerValue=dealer.getHandValue();
            
            if(playerValue>21)
            {
                System.out.println(blackjackPlayer.getName() + "busts and loses.");
                
              
            } else if(dealerValue >21 || playerValue> dealerValue)
            {
                System.out.println(blackjackPlayer.getName()+ " wins!");
                        
            }else if(playerValue==dealerValue)
            {
                System.out.println(blackjackPlayer.getName()+ " ties with the dealer.");
                
            }
            else {
                System.out.println(blackjackPlayer.getName()+ " loses.");
                
            }
        }
        

    }
}