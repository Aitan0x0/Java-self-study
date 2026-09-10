package eTicaret;

import eTicaret.Model.AllOrders;
import eTicaret.Model.Order;
import eTicaret.Model.Product;
import eTicaret.Model.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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
        return products.stream().filter(product -> product.getQuantity() < 5).toList();
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


    /// Costumerin Completed order ucun xerclediyi umumi mebleg
    public double getTotalSpendByCostumer(String costumerName, AllOrders allOrders) {
        List<Order> allOrdersList = allOrders.getAllOrders();
        List<Order> existOrders = allOrdersList.stream().filter(o -> o.getCustomerName().equalsIgnoreCase(costumerName)).
                filter(o -> o.getStatus().equals(Status.COMPLETED)).toList();
        if (existOrders.isEmpty()) {
            log.warn("Bu istifadecinin orderi ve ya completed orderi yoxdur ");
            return 0.00;
        } else {
            return existOrders.stream().mapToDouble(Order::getOrdersTotal).sum();
        }

    }

}
