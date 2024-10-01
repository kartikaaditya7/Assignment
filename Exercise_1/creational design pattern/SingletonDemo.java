// Singleton Class
class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {
        // Private constructor to prevent instantiation
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void displaySettings() {
        System.out.println("Displaying Configuration Settings");
    }
}

// Main class
public class SingletonDemo {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.displaySettings();
    }
}
