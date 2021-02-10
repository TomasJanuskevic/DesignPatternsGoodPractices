package deignPatterns.behavioral.chainOfResponsibility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ATMDispencerChain atmDispencerChain = new ATMDispencerChain();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner scanner = new Scanner(System.in);

            amount = scanner.nextInt();

            //Viena is salygu
            if (amount % 10 != 0 || amount == 0) {
                System.out.println("Amount should be multiple of 10s");
                break;
            }
            atmDispencerChain.getFirstChainElement().dispense(new Currency(amount));
        }
    }
}
