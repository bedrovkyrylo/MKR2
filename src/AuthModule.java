public class AuthModule implements EventListener {
    @Override
    public void onEvent(Event event) {
        if (event.getMessage().contains("Auth")) {
            System.out.println("AuthModule: " + event.getMessage());
        }
    }

    public void generateAuthEvent() {
        EventManager.getInstance().notifyListeners(new Event("AuthModule. Користувач авторизувався"));
    }
}