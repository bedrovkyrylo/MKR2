import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<EventListener> listeners = new ArrayList<>();
    private static EventManager instance;

    private EventManager() {}

    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    public void notifyListeners(Event event) {
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }
}