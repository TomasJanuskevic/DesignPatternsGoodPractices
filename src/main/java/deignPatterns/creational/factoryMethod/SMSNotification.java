package deignPatterns.creational.factoryMethod;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending sms...");
    }

    //galima papildoma logika....
}
