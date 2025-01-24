import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questions {
    static boolean accepted = false;
    public void question() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!accepted) {
                System.out.println("Enter: (hit/wave)");
                String input = reader.readLine().toLowerCase().trim();
                if (input.equals("hit")) {
                    System.out.println("User hits");
                    accepted = true;
                } else if (input.equals("wave")) {
                    System.out.println("User waves");
                    accepted = true;
                } else {
                    System.out.println("The user did not enter the as instructed");
                }
            }
        }
    }
}


