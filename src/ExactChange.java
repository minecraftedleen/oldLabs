import java.util.Scanner;
public class ExactChange {
    public static void main(String[] args) {
        final double QCNST = 0.25;
        final double DCNST = 0.10;
        final double NCNST = 0.05;
        final double PCNST = 0.01;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        int minCoins;
        double cash;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter an amount in dollars and cents: ");
        cash = scan.nextDouble();
        quarters = (int) (cash / QCNST);
        cash %= QCNST;
        dimes = (int) (cash / DCNST);
        cash %= DCNST;
        nickels = (int) (cash / NCNST);
        cash %= NCNST;
        pennies = (int) (cash / PCNST + 0.5);
        cash %= PCNST;
        minCoins = quarters + dimes + nickels + pennies;
        System.out.println("The minimum number of coins is: " + minCoins);
        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");
        System.out.println(pennies + " penny(ies)");
    }
}
