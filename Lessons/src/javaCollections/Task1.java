package javaCollections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    private static final Logger log = LoggerFactory.getLogger(Task1.class);

    public static void main(String[] args) {
        log.info(" -- Magaza sistemi --");
        //product 1
        Set<String> phoneCategories = new HashSet<>();
        phoneCategories.add(Category.TELEFONLAR.getDisplayName());
        phoneCategories.add(Category.ELEKTRONIKA.getDisplayName());
        Product p1 = new Product(101, "Iphone", 2000, phoneCategories);
        log.info("\n" + p1);

        //prduct 2
        Set<String> tvCategories = new HashSet<>();
        tvCategories.add(Category.TV.getDisplayName());
        tvCategories.add(Category.ELEKTRONIKA.getDisplayName());
        Product p2 = new Product(103, "LG TV", 5000, tvCategories);
        log.info("\n" + p2);

        //Product 3
        Product p3 = new Product(101, "Samsung Galaxy", 1000, phoneCategories);
        log.info("\n" + p3); //Product 3

        //prduct 4
        Set<String> clothCategories = new HashSet<>();
        clothCategories.add(Category.GEYIM.getDisplayName());
        clothCategories.add(Category.AYAQQABI.getDisplayName());
        Product p4 = new Product(104, "Campus", 100, clothCategories);
        log.info("\n" + p4);

        //product 5
        Product p5 = new Product(105, "Samsung A33", 500, phoneCategories);
        log.info("\n" + p5);

        //product 6
        Product p6 = new Product(105, "Samsung J2", 200, phoneCategories);
        log.info("\n" + p6);

        //Sebet yaradildi
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addToCart(p1, 3);
        cart1.addToCart(p3, 1);
        cart1.addToCart(p4, 5);
        cart1.addToCart(p6, 2);
        cart1.addToCart(p5, 1);
        cart1.addToCart(p1, 2);
        log.info("\n1ci sebetin umumi meblegi:{}", cart1.calculateTotal());

        //Inventory yaradilir
        StoreInventory inv1 = new StoreInventory();
        inv1.addProduct(p1);
        inv1.addProduct(p2);
        inv1.addProduct(p3);
        inv1.addProduct(p4);
        inv1.addProduct(p6);

        //Butun kateqoriyalar cagirilir(Cari inventorideki)
        log.info("\nStore daxilindeki butun movcud kateqoriyalar:");
        for (String cats : inv1.getAllCategories()) {
            log.info(cats);
        }
        ;

        //Qiymete gore range edilir
        log.info("\n1000 - 100 arasi mehsullar:");
        for (Product product : inv1.getProductsByPriceRange(1000, 100)) {
            log.info("{} AZN'e {}", product.getPrice(), product.getName());
        }
        ;
        Product pId104 = inv1.findProductById(104);
        log.info("Id'si {} olan mehsul : {} "  , pId104.getId() , pId104.getName() );

        //Id olmadiqda warn ile exeption qaytarir
        Product pId200 = inv1.findProductById(200);
        log.info("Id'si {} olan mehsul : {} "  , pId200.getId() , pId200.getName() );




    }
}
