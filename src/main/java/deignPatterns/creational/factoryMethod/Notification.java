package deignPatterns.creational.factoryMethod;

/**
 * Creational type pattern
 *
 * It states that we have to define an interface (or abstract class) and allow subclasses which object to instiate.
 *
 * Factory method means that there is a method which acts as a Factory and creates objects (stuff).
 *
 * Implementation:
 * 1. Define factory method inside the interface
 * 2. Let subclasses implement it and decide which object to create.
 */
public interface Notification {
    void notifyUser();
}
