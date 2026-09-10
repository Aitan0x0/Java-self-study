package eTicaret;

import eTicaret.Model.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Set<String> phoneCategories = new HashSet<>(Set.of("Elektrik"));
        Set<String> tvCategories = new HashSet<>(Set.of("Televizor"));
        AllOrders allOrders = new AllOrders();
        log.info("-------");
        List<Product> allProducts = new ArrayList<>();
        Product p1 = new Product(101, "Samsung", 300, phoneCategories, 2);
        Product p2 = new Product(102, "Iphone", 1000, phoneCategories, 6);
        Product p3 = new Product(103, "Tv", 4000, tvCategories, 10);
        allProducts.add(p1);
        allProducts.add(p2);
        allProducts.add(p3);
        List<OrderItem> orderList1 = List.of(
                new OrderItem(p1, 2),
                new OrderItem(p2, 3));
        List<OrderItem> orderList2 = List.of(
                new OrderItem(p3, 2),
                new OrderItem(p2, 3));
        Order order1 = new Order(10021, orderList1, "Ayten", Status.COMPLETED, allOrders);
        Order order2 = new Order(10022, orderList2, "Ayten", Status.CANCELLED, allOrders);
        Order order3 = new Order(10023, orderList1, "Seva", Status.COMPLETED, allOrders);
        log.info("-------");
        InventoryService inv = new InventoryService();
        inv.addProductsToStock(p1);
        inv.addProductsToStock(p2);
        inv.addProductsToStock(p3);
        List<String> names = inv.getProductNamesInStock();
        log.info("Siyahidaki element sayi: {}", names.size());
        names.forEach(log::info);
        log.info("Aytenin umumi xerci :{}" , inv.getTotalSpendByCostumer("Ayten", allOrders));
        log.info("-------");
        log.info("Stokda sayi az olanlar:");
        inv.getLowStockProduct(allProducts).forEach(o->log.info(o.getName()));
        log.info("-------");

    }

}
