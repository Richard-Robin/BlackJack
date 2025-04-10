package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;


public class BlackjackMain{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Blackjack Game!");
        Scanner scanner = new Scanner(System.in);
       BlackjackGame game= new BlackjackGame("Blackjack");
       ArrayList<Player> players= new ArrayList<>();
       System.out.println("Enter number of players: ");
       int numberOfPlayers=Integer.parseInt(scanner.nextLine());
       
       for(int i=1; i<=numberOfPlayers; i++)
       {
           System.out.print("Enter name for Player " + i + ": ");
           String name= scanner.nextLine();
           players.add(new BlackjackPlayer(name));
           
       }
       System.out.println(" ");
       game.setPlayers(players);
       game.play();
    }
                
}