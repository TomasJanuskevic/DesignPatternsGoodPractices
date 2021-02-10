package deignPatterns.creational.factoryMethod;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending email to a user...");
    }
}
