import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.*;

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
    public void removeCard(String card){
        System.out.println("\n\ndeck atm: " + deckHolder);
        if (true){
            heartDeck.remove(card);
           changeCardLinkedList();
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
    public int randomTwoCard(){
        Random rand = new Random();
        final int randomSuitNum = rand.nextInt(4);
        final int randomNum = rand.nextInt(13);
        ArrayList<Integer> randHolder = new ArrayList<>();
        randHolder.add(randomNum);
        if (randHolder.size()>0){
            if(randomSuitNum ==0){
                System.out.println("This is Heart "+ randomNum);
                removeCard(String.valueOf(randomNum));
            }else if(randomSuitNum ==1){
                System.out.println("This is Spade");
            }else if(randomSuitNum ==2){
                System.out.println("This is Club");
            }if(randomSuitNum ==3){
                System.out.println("This is Diamond");
            }
            System.out.println(randomSuitNum);
            System.out.println(randHolder.get(0));
        }

        return 1;
    }
}
