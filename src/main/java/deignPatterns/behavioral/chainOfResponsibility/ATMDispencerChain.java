package deignPatterns.behavioral.chainOfResponsibility;

public class ATMDispencerChain {

    private DispenseChain firstChainElement;

    public ATMDispencerChain() {
        //initialize the chain
        //specify first element of the chain
        this.firstChainElement = new Dollar50Dispenser();
        DispenseChain secondChainElement = new Dollar20Dispencer();
        DispenseChain thirdChainElement = new Dollar10Dispenser();

        firstChainElement.setNextChain(secondChainElement);
        secondChainElement.setNextChain(thirdChainElement);
    }

    public DispenseChain getFirstChainElement() {
        return firstChainElement;
    }
}
