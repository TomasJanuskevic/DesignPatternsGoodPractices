package deignPatterns.behavioral.chainOfResponsibility;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) { // pvz. nextChain = Dollar20Dispenser
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {

        int amount = currency.getAmount();
        if (amount >= 10) {
            int numberOfNotes = amount / 10;//zinosime kiek kupiuru
            int remainder = amount % 10; //zinosime liekana
            System.out.println("Dispensing " + numberOfNotes + " 10$ notes");
            if (remainder != 0) {
                //kitagrandines dalis
                //jauzsetinom setNextChain metode
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            //jei sita suma man netinkama,
            //siunciu ja toliau...
            this.chain.dispense(currency);
        }
    }
}

