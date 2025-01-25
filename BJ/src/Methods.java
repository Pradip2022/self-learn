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
    public void removeCard(int card, int suit){
        System.out.println("\n\ndeck atm: " + deckHolder);
        if (suit == 0){
            heartDeck.remove(card);
        }else if(suit == 1){
            spadeDeck.remove(card);
        }else if(suit == 2){
            clubDeck.remove("A");
        }else if (suit == 3){
            diamondDeck.remove("A");
        }else{
            System.out.println("ERROR in removing card");
        }
        System.out.println("\n\n");
        changeCardLinkedList(suit);
        System.out.println("deck at the end: " + deckHolder);
    }

    public void changeCardLinkedList(int suit){
        if(suit == 0){
            deckHolder.replace("Heart",heartDeck);
        }else if(suit == 1){
            deckHolder.replace("Spade",spadeDeck);
        }else if(suit == 2){
            deckHolder.replace("Club",clubDeck);
        }else if(suit == 3){
            deckHolder.replace("Diamond",diamondDeck);
        }
    }
    public void randomTwoCard(){
        Random rand = new Random();
        final int randomSuitNum = rand.nextInt(4);
        final int randomNum = rand.nextInt(13);
        ArrayList<Integer> randHolder = new ArrayList<>();
        randHolder.add(randomNum);
        if (randHolder.size()>0){
            if(randomSuitNum ==0){
                System.out.println("This is Heart "+ randomNum);
                removeCard(randomNum,randomSuitNum);
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

    }
}
