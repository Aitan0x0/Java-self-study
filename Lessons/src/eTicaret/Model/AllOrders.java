package eTicaret.Model;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AllOrders {
    private static final Logger log = LoggerFactory.getLogger(AllOrders.class);


    private final List<Order> allOrders = new ArrayList<>();


    public AllOrders() {
        log.info("Mərkəzi AllOrders sistemi işə düşdü.");
    }


    public void registerOrder(Order order) {
        if (order != null) {
            this.allOrders.add(order);
            log.info("Sifariş mərkəzi siyahıya əlavə olundu. Ümumi sayı: {}", allOrders.size());
        }
    }


    public List<Order> getAllOrders() {
        return allOrders;
    }


    public List<Order> getOrdersByCustomer(String customerName) {
        return allOrders.stream()
                .filter(order -> order.getCustomerName().equalsIgnoreCase(customerName))
                .toList();
    }

    // 4. Stream API: ID-yə görə sifarişi axtarmaq (Optional ilə)
    public Optional<Order> findOrderById(long id) {
        return allOrders.stream()
                .filter(order -> order.getId() == id)
                .findFirst();
    }
}