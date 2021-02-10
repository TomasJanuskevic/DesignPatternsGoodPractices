package deignPatterns.creational.factoryMethod;

public class NotificationMain {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        //if user pasirinko sms, info jam pateikiam sms
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}