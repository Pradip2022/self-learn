import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Methods {
    HashMap<String, List<String>> deckHolder = new HashMap<>();
    static final List<String> deck = Arrays.asList("A","2","3","4","5","6","7","8","9","T","J","Q","K");
    LinkedList<String> heartDeck = new LinkedList<>(deck);
    LinkedList<String> spadeDeck = new LinkedList<>(deck);
    LinkedList<String> clubDeck = new LinkedList<>(deck);
    LinkedList<String> diamondDeck = new LinkedList<>(deck);



    public void deckNumbers(){
        deckHolder.put("Heart", deck);
        deckHolder.put("Spade", deck);
        deckHolder.put("Club", deck);
        deckHolder.put("Diamond", deck);

    }
    public void removeCard(){
        System.out.println("\n\ndeck atm: " + deckHolder);
        if (true){
            heartDeck.remove("A");
        }else if(true){
            spadeDeck.remove("A");
        }else if(true){
            clubDeck.remove("A");
        }else if (true){
            diamondDeck.remove("A");
        }else{
            System.out.println("ERROR in removing card");
        }
        System.out.println("\n\n");
        heartDeck.remove("A");
        changeCardLinkedList();
        System.out.println("deck at the end: " + deckHolder);
    }
    public void changeCardLinkedList(){
        deckHolder.replace("Heart",heartDeck);
    }
}
