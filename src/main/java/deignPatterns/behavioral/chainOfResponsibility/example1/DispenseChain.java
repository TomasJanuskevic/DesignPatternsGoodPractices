package deignPatterns.behavioral.chainOfResponsibility.example1;

/**
 * BASE interface should have a method to define the next processor and a method to process the request
 * Eg. Metodas nurodyti, kas sekantis dirbs su requestu. Ir metodas nurodantis kaip mums ta requesta apdoroti.
 * <p>
 * Our case - we need different processor classes, to dispense different amounts of money.
 * 50, 20, 10 amount bills can be used. So we will need 3 different implementition
 */
public interface DispenseChain {

    int getNote();

    //kitos grandines dalies priskyrimas
    void setNextChain(DispenseChain nextChain);

    //pinigu isdavimas
    void dispense(Currency currency, int note);


}
