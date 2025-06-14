import java.util.Scanner;
import java.util.Random;
import static java.lang.System.exit;

public class slotMachine {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static String[] slotSpinning() {
        String[] symbols = {"1", "3", "5", "7", "10"};
        String[] rows = new String[4];
        for (int i = 0; i < 4; i++) {
            rows[i] = symbols[random.nextInt(symbols.length)];
        }
        return rows;
    }

    static double getPayment(String[] rows, double bet) {
        double updatedBalance = bet;
        switch (rows[0]) {
            case "1" -> {
                updatedBalance *= 0.2; // 20%
                System.out.println("YOU WON 20% OF THE BETTING MONEY!");
            }
            case "3" -> {
                updatedBalance *= 0.3; // 30%
                System.out.println("YOU WON 30% OF THE BETTING MONEY!");

            }
            case "5" -> {
                updatedBalance *= 0.4; // 40%
                System.out.println("YOU WON 40% OF THE BETTING MONEY!");
            }
            case "7" -> {
                updatedBalance *= 0.5; // 50%
                System.out.println("YOU WON 50% OF THE BETTING MONEY!");
            }
            case "10" -> {
                System.out.println("******************************");
                System.out.println("    YOU HIT THE JACKPOT!!!");
                System.out.println("******************************");
                System.out.println();
                System.out.println("YOU WON 200% OF THE BETTING MONEY!!!!!!");
                updatedBalance *= 2.0; // 200%
            }
        }
        return updatedBalance;
    }

    public static void main(String[] args) {

        double balance = 100;
        double bet;
        String programRunning;

        System.out.println("********************************");
        System.out.println("  WELCOME TO JAVA SLOT MACHINE");
        System.out.println("  SYMBOLS: 10 | 7 | 5 | 3 | 1");
        System.out.println("********************************");

        while (balance > 0) {
            System.out.println("YOUR CURRENT BALANCE: " + balance);
            System.out.print("PLACE YOUR BET AMOUNT: ");
            bet = scanner.nextDouble();

            if (bet > balance) {
                System.out.println("INSUFFICIENT BALANCE");
                continue;
            }
            else if (bet <= 0){
                System.out.println("BET CAN'T BE SMALLER THAN $1");
                continue;
            }
            else {
                balance -= bet;
            }

            System.out.println("SPINNING...");
            String[] rows = slotSpinning();

            System.out.println(rows[0] + " | " + rows[1] + " | " + rows[2] + " | " + rows[3]);
//            rows[0] = "10"; rows[1] = "10"; rows[2] = "10"; rows[3] = "10"; // for debugging: getPayment()

            if (rows[0].equals(rows[1]) && rows[1].equals(rows[2]) && rows[2].equals(rows[3])) {
                double updatedBalance = getPayment(rows, bet);
                System.out.println("YOU WON $" + updatedBalance);
                balance += updatedBalance;
                System.out.println("YOUR CURRENT BALANCE: " + balance);
            }
            else {
                System.out.println("YOU LOST THE BET. BETTER LUCK NEXT TIME");
            }

            do {
                System.out.println("WANT TO CONTINUE BETTING? (YES, NO)");
                scanner.nextLine();
                programRunning = scanner.next().toLowerCase();
                if (!programRunning.equals("yes") && !programRunning.equals("no")) {
                    System.out.println("WRONG INPUT. TRY AGAIN.");
                }
                else {
                    if (balance <= 0 && !programRunning.equals("no")) {
                        System.out.println("INSUFFICIENT BALANCE. RECHARGE MONEY :( ...");
                    }
                }
            }while (!programRunning.equals("yes") && !programRunning.equals("no"));

            if (programRunning.equals("no")) {
                System.out.println("THANK YOU FOR USING OUR SERVICE.");
                exit(0);
            }
        }
        scanner.close();
    }
}