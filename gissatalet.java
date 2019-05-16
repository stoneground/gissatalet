import java.util.Scanner;

public class gissatalet {

    public static void main(String[] args) {

        int secretNumber;

        secretNumber = (int) (Math.random() * 99 + 1);

        Scanner keyboard = new Scanner(System.in);

        int guess;

        do {

            System.out.print("Skriv ett nummer mellan (1-100): ");

            guess = keyboard.nextInt();

            if (guess == secretNumber)

                System.out.println("Du lyckades, bra jobbat!");

            else if (guess < secretNumber)

                System.out

                        .println("Din gissning är mindre än det hemliga nummret.");

            else if (guess > secretNumber)

                System.out

                        .println("Din gissning är större än det hemliga nummret.");

        } while (guess != secretNumber);     }
}
