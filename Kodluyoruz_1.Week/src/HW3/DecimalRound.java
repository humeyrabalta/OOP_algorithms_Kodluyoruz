package HW3;

import java.util.Locale;
import java.util.Scanner;

public class DecimalRound {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    scan.useLocale(Locale.US);
    System.out.println("Enter a decimal number please: ");
    double i = scan.nextDouble();

        System.out.println("If you want to round down the number,ender DOWN" +
                "If you want to round top, enter TOP: ");

    String round = "DOWN";
    String round2 = "TOP";
    String enter = scan.next().toUpperCase(Locale.ROOT);

    if (round.equals(enter)) {
        System.out.println("The number rounded down:" + Math.floor(i));

    } else if (round2.equals(enter)) {
        System.out.println("The number rounded top: " + Math.ceil(i));
    } else {
        System.out.println("Incorrectly entry.");
    }

}

}
