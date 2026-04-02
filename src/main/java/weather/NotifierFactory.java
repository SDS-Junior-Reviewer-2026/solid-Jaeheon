package weather;

public class NotifierFactory {
    NotifierFactory() {}

    public static Notifier getNotifier(String type) {
        switch (type) {
            case "phone": return new Phone();
            case "email": return new Email();
            default: return null;
        }
    }
}
