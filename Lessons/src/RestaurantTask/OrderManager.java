package RestaurantTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class OrderManager {

    private static final Logger log = LoggerFactory.getLogger(OrderManager.class);
    private final List<MenuItem> menuList = new ArrayList<>();
    /// Mehsul ve onun sayi hashmap seklinde
    private final Map<MenuItem, Integer> order = new HashMap<>();


    public void addMenuItem(MenuItem... items) {
        for (MenuItem item : items) {

            if (item == null)
                throw new NullPointerException("Bele item yoxdur");
            menuList.add(item);

        }
    }

    public void displayMenu() {
        log.info("----Menu----");
        for (MenuItem menuItem : menuList) log.info("\n{}--------", menuItem.getDetails());
    }

    public void addToOrder(int itemId, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Mehsul sayi 0dan boyuk olmalidir: " + quantity);
        }
        Optional<MenuItem> existMenuItem = menuList.stream()
                .filter(item -> item.getId() == itemId)
                .findFirst();
        if (existMenuItem.isEmpty()) {
            log.warn("Menyuda {} idli mehsul yoxdur", itemId);
            return;
        }
        MenuItem item = existMenuItem.get();
        order.put(item, order.getOrDefault(item, 0) + quantity);
        log.info("{} eded {} sifarise daxil edildi.", quantity, item.getName());
    }

    public double calculateTotal() {
        if (order.isEmpty()) {
            log.warn("Order yoxdur");
            return 0.00;
        }
        return order.entrySet().stream().mapToDouble(entry -> {
            return entry.getKey().getPrice() * entry.getValue();
        }).sum();

    }

    /// qebzin capi
    public void printReceipt() {
        log.info("----Qebz----");
        int counter = 1;
        for (Map.Entry<MenuItem, Integer> entry : order.entrySet()) {
            log.info("\n{}. {} x {} eded", counter, entry.getKey().getDetails(), entry.getValue());
            ++counter;
        }
        log.info("------------");
        log.info("Umumi mebleg: {} Azn", this.calculateTotal());
    }

}
