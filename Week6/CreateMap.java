package Week6;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class CreateMap {
    
    public static void main(String[] args){

    }

    public Map<String, List<Card>> gameBoard(int numPlayers){
        Map<String, List<Card>> gameMap = new HashMap<>();
        Deck deck = new Deck();
        deck.shuffle();

        for(int i = 0; i < numPlayers; i++){
            List<Card> playerList = new ArrayList<>(); // create a list of cards for a player
            String playerName = "Player " + i; // name the player
            for(int j = 0; i < 52/numPlayers; i++){ // deal the player the proper number of cards
                playerList.add(deck.draw()); // dealing one card into the player list
            }
            gameMap.put(playerName, playerList); // add the player name as the key, and the list of the players cards as the value
        }

        if(52%numPlayers != 0){
            System.out.println("You have " + 52 % numPlayers + " cards leftover because you didn't read the box.");
        } else {
            System.out.println("All the cards have been dealt");
        }

        return gameMap;

    }



}
