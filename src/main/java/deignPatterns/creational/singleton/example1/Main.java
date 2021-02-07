package deignPatterns.creational.singleton.example1;

public class Main {

    public static void main(String[] args) {
        ComputerProducer computerProducer = ComputerProducer.getComputerProducer();
        computerProducer.showProducedComputerCount();

        Computer lenovo = computerProducer.produceComputer();
        Computer asus = computerProducer.produceComputer();
        Computer mac = computerProducer.produceComputer();

        computerProducer.showProducedComputerCount();

        ComputerProducer piktasKlonas = ComputerProducer.getComputerProducer();
        Computer macBook = piktasKlonas.produceComputer();

        computerProducer.showProducedComputerCount();


    }


}
