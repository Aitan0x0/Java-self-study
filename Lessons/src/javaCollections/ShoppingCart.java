package javaCollections;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private static final Logger log = LoggerFactory.getLogger(ShoppingCart.class);

  private  Map<Product, Integer> cartItems = new HashMap<>();

    public void addToCart(Product product, int quantity) {
        quantity += cartItems.getOrDefault(product , 0);
        cartItems.put(product, quantity);
        log.info("{} adli mehsul sebete elave ugurla elave olundu . Sayi: {}", product.getName(), quantity);

    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }

}
