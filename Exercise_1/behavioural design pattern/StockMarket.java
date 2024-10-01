import java.util.ArrayList;
import java.util.List;

// Observer interface
interface StockObserver {
    void update(String stockName, double price);
}

// Subject class
class Stock {
    private String name;
    private double price;
    private List<StockObserver> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(name, price);
        }
    }
}

// Concrete Observer class
class User implements StockObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Notification to " + name + ": " + stockName + " stock price changed to " + price);
    }
}

// Main class
public class StockMarket {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.0);
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        appleStock.addObserver(user1);
        appleStock.addObserver(user2);

        appleStock.setPrice(155.0);  // Notify all observers
        appleStock.setPrice(160.0);  // Notify all observers
    }
}
