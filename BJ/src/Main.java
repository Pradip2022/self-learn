import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello welcome to my BlackJack program");
        Methods method = new Methods();
        method.deckNumbers();
        method.randomTwoCard();
//        Questions q = new Questions();
//        q.question();
//        method.deckNumbers();
//        method.removeCard();
        
        }
    }