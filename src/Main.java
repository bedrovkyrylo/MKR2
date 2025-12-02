public class Main {
    public static void main(String[] args) {

        EventManager eventManager = EventManager.getInstance();
        AuthModule authModule = new AuthModule();
        LogModule logModule = new LogModule();
        UserInterface uiModule = new UserInterface();

        eventManager.addListener(authModule);
        eventManager.addListener(logModule);
        eventManager.addListener(uiModule);

        authModule.generateAuthEvent();
        logModule.generateLogEvent();
        uiModule.generateUIEvent();
    }
}