package deignPatterns.creational.factoryMethod;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Push notification is sent...");
    }

    //Galima papildoma logika...
}
