package ee.assignments.observer;

/**
 * For receiving message while observer notifies
 */
public interface Observer {
    void update(String message);
}
