import java.util.Scanner;
public class ExactChange {
    public static void main(String[] args) {
        final double QCONST = 0.25;
        final double DCONST = 0.10;
        final double NCONST = 0.05;
        final double PCONST = 0.01;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int minCoins;
        double cash;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter an amount in dollars and cents: ");
        cash = scan.nextDouble();
        quarters = (int) (cash / QCONST);
        cash %= QCONST;
        dimes = (int) (cash / DCONST);
        cash %= DCONST;
        nickels = (int) (cash / NCONST);
        cash %= NCONST;
        pennies = (int) (cash / PCONST + 0.5);
        cash %= PCONST;
        minCoins = quarters + dimes + nickels + pennies;
        System.out.println("The minimum number of coins is: " + minCoins);
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
