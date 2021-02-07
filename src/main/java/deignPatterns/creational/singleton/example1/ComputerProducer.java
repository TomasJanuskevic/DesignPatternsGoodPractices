package deignPatterns.creational.singleton.example1;


/**
 * Use singleton to ensure that we would have only one ComputerProducer per program.
 * And create global access point to it. (leisime pasiekti ta objekta is visu programos vietu)
 */
public class ComputerProducer {

    private static ComputerProducer computerProducer;
    private int numberOfComputerProduced;

    //Singleton is achieved via private Constructor
    private ComputerProducer() {
    }

    public Computer produceComputer(){
        numberOfComputerProduced++;
        return new Computer();
    }

    public void showProducedComputerCount(){
        System.out.println("We produced: " + numberOfComputerProduced + " computers");
    }

    //Global access point
    public static ComputerProducer getComputerProducer(){
        //Jaigu instancas egzistuoja
        if (computerProducer == null) {
            //Jaigu neegzistuoja
            computerProducer = new ComputerProducer();
        }
        return computerProducer;
    }

}
