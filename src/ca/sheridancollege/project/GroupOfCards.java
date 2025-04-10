package ca.sheridancollege.project;

import ca.sheridancollege.project.Card;
import java.util.ArrayList;
import java.util.Collections;


public class GroupOfCards
{
    private ArrayList<Card> cards;
    private int size;
    
    
    public GroupOfCards(int size)
    {
        this.size = size;
        cards=new ArrayList<>(size);
    }

public ArrayList<Card> getCards()
{return cards;}

public int getSize()
{return size;}

public void setSize(int size)
{this.size=size;}

public void shuffle()
{
Collections.shuffle(cards);
}

}