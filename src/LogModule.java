public class LogModule implements EventListener {
    @Override
    public void onEvent(Event event) {
        if (event.getMessage().contains("log")) {
            System.out.println("LogModule: " + event.getMessage());
        }
    }

    public void generateLogEvent() {
        EventManager.getInstance().notifyListeners(new Event("LogModule. Запис у лог"));
    }
}