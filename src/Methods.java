import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Methods {
    List<String> deck = Arrays.asList("A","2","3","4","5","6","7","8","9","T","J","Q","K");
    LinkedList<String> heartDeck = new LinkedList<>(deck);
    HashMap<String, List<String>> test = new HashMap<>();
    public boolean deckNumbers(){
        System.out.println(deck);
        test.put("Heart", deck);
        test.put("Spade", deck);
        test.put("Club", deck);
        test.put("Diamond", deck);
        return true;
    }
    public void removeCard(){
        heartDeck.remove("A");
        test.replace("Heart",heartDeck);
        System.out.println(test.get("Heart"));



    }
}
