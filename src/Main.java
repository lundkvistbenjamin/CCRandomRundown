import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner strInput = new Scanner(System.in);

        while (true){
            System.out.printf("Slumptal: %d\n", random.nextInt(99));
            System.out.print("Tryck enter för ett random tal eller q för att avsluta\n");

            if (strInput.nextLine().equals("q")){
                System.out.println("Tack o hej!");
                System.exit(0);
            }
        }
    }
}