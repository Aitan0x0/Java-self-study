package javaCollections;


import java.util.*;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoreInventory {
    private static final Logger log = LoggerFactory.getLogger(StoreInventory.class);

    private List<Product> products = new ArrayList<>();
    private Map<Integer, Product> productCatalog = new HashMap<>();

    public void addProduct(Product product) {
        products.add(product);
        productCatalog.put(product.getId(), product);
        log.info("Mehsul ugurla elave olundu: {}", product.getName());
    }

    ;

    public List<Product> getProductsByPriceRange(double max, double min) {
        List<Product> rangedProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() <= max && product.getPrice() >= min) {
                rangedProducts.add(product);
            }

        }
        return rangedProducts;
    }

    public Product findProductById(int id) {
        Product product = productCatalog.get(id);
        if (product == null) {
            log.warn("Idsi {} olan mehsul tapilmadi", id);
        }
        return product;
    }

    public Set<String> getAllCategories() {
        Set<String> categories = new HashSet<>();
        for (Product product : products) {
            categories.addAll(product.getCategories());

        }
        return categories;
    }

}
