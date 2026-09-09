package eTicaret.Model;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private static final Logger log = LoggerFactory.getLogger(Order.class);

    private long id;
    private String customerName;
    private List<OrderItem> items = new ArrayList<>();
    private Status status;

    public Order(long id, List<OrderItem> items, String customerName, Status status, AllOrders allOrders) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Sifarişin daxilində ən azı 1 məhsul olmalıdır!");
        }
        if (allOrders == null) {
            throw new IllegalArgumentException("AllOrders mərkəzi sistemi null ola bilməz!");
        }
        if (customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException("Müştəri adı boş ola bilməz!");
        }

        this.id = id;
        this.items = items;
        this.customerName = customerName;
        this.status = status;


        registerToAllOrders(allOrders);
        log.info("Yeni sifaris daxil edildi: ID = {}", id);
    }


    private void registerToAllOrders(AllOrders allOrders) {
        allOrders.registerOrder(this);
    }

    public long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order order = (Order) obj;
        return id == order.id && Objects.equals(customerName, order.customerName);
    }
}