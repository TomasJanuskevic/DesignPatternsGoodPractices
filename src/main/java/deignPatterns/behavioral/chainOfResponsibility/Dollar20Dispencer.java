package deignPatterns.behavioral.chainOfResponsibility;

public class Dollar20Dispencer implements DispenseChain {

    private DispenseChain chain;


    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }
//TODO SUKURT BENDRA METODA
    @Override
    public void dispense(Currency currency) {
        int amount = currency.getAmount();
        if (amount >= 20) {
            int numberOfNotes = amount / 20; // zinosime kiek kupiuru
            int reminder = amount % 20; // zinosime kokia liekana
            System.out.println("Dispencing " + numberOfNotes + " 20$ notes");
            if (reminder != 0) {
                //liekana perduodame kitai grandines daliai
                this.chain.dispense(new Currency(reminder));
            }
        } else {
            //jeisumos apdoroti negalime siunciame ji toliau
            this.chain.dispense(currency);
        }
    }
}
