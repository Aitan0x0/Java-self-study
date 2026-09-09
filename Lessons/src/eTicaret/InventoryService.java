package eTicaret;

import eTicaret.Model.Order;
import eTicaret.Model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/// Daxilinde stock listi ve Orders listi var
public class InventoryService {

    private static final Logger log = LoggerFactory.getLogger(InventoryService.class);
    private List<Product> stock = new ArrayList<>();
//    private List<Order> orders = new ArrayList<>();





    public List<Product> getStock() {
        return stock;
    }

    public List<Product> getLowStockProduct(List<Product> products) {
        if (products == null)
            throw new IllegalArgumentException("Bele product yoxdur.");
        return products.stream().filter(product -> product.getPrice() < 5).toList();
    }

    public void addProductsToStock(Product product) {
        Optional<Product> existProduct = stock.stream().filter(p -> p.equals(product)).findFirst();
        if (existProduct.isPresent()) {
            existProduct.get().increaseStock(product.getQuantity());
            log.info("Mehsul stockda movcud idi ve elave olundu.Yeni stock sayi: {}", existProduct.get().getQuantity());
        } else {
            stock.add(product);
            log.info("Yeni mehsul stocka elave olundu.");
        }
    }

    public List<String> getProductNamesInStock() {
        return stock.stream().map(Product::getName).toList();
    }

    public double getTotalSpendByCostumer(String costumerName) {
        List<Order> existCostumerOrders = orders.stream()
        if()


    }

}
