package eTicaret.Model;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    private static final Logger log = LoggerFactory.getLogger(Product.class);

    private long id;
    private String name;
    private Set<String> categories = new HashSet<>();
    private double price;
    //stokdaki sayi
    private int quantity;


    //konstruktor
    public Product(long id, String name, double price, Set<String> categories, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        if(price<=0)
            throw new IllegalArgumentException("Say duzgun daxil edilmeyib (0 ve ya menfi ola bilmez)");
        this.quantity = quantity;
        this.categories = categories;

    }

    //getterler
    public long getId() {
        return id;

    }
    public void increaseStock(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

    public String getName() {
        return name;
    }


    public Set<String> getCategories() {
        return categories;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        return this.id == ((Product) obj).id && this.name.equals(((Product) obj).name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
