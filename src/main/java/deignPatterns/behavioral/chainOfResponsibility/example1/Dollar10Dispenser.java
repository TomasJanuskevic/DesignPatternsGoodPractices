package deignPatterns.behavioral.chainOfResponsibility.example1;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain chain;
    final int note = 10;

    @Override
    public int getNote() {
        return note;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency, int note) {
        int amount = currency.getAmount();
        if (amount >= note) {
            int numberOfNotes = amount / note; // zinosime kiek kupiuru
            int reminder = amount % note; // zinosime kokia liekana
            System.out.println("Dispencing " + numberOfNotes + " " + note + " notes");
            if (reminder != 0) {
                //liekana perduodame kitai grandines daliai
                this.chain.dispense(new Currency(reminder), chain.getNote());
            }
        } else {
            //jeisumos apdoroti negalime siunciame ji toliau
            this.chain.dispense(currency, chain.getNote());
        }
    }


}

