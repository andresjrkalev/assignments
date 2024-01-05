package ee.assignments.observer;

/**
 * Custom observer for receiving message from observer
 */
public class ConcreteObserver implements Observer {

    /**
     * Prints received message to console
     *
     * @param message - represents received message from observer
     */
    @Override
    public void update(String message) {
        String result = String.format("Received message: %s", message);
        System.out.println(result);
    }
}
