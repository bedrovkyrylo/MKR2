public class UserInterface implements EventListener {
    @Override
    public void onEvent(Event event) {
        System.out.println("UserInterface: " + event.getMessage());
    }

    public void generateUIEvent() {
        EventManager.getInstance().notifyListeners(new Event("UserInterface. Ласкаво просимо"));
    }
}