package ee.assignments.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Reference: https://en.wikipedia.org/wiki/Observer_pattern
 *
 * Custom observer pattern
 */
public class Subject {
    /**
     * Set of added observers
     */
    private final Set<Observer> observers = new HashSet<>();

    /**
     * Adds new observer to set
     *
     * @param observer - represents new observer
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes observer from set if exists
     *
     * @param observer - represents observer what will be removed
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all added observers with message
     *
     * @param message - represents message what will be sent to observers
     */
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}
