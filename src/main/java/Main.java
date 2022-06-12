import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueFlipping = true;
        Coin coin = new Coin();
        while (continueFlipping) {
            System.out.println("Flip the coin (x to exit)");
            String input = scanner.next();

            if (input.equalsIgnoreCase("x")) continueFlipping = false;
            else System.out.println(coin.flip().getOutputString());
        }

        System.out.println("Thanks for playing.");

    }
}
