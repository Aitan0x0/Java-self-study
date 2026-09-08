package javaCollections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/// Product classi
public class Product {
    private int id;
    private String name;
    private double price;
    private Set<String> categories;

    //konstruktor
    public Product(int id, String name, double price, Set<String> categories) {
        this.categories = categories;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //getter
    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Set<String> getCategories() {
        return categories;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Mehsul id: %d%nMehsul adi: %s%nMehsulun qiymeti: %.2f%nMehsulun kateqoriyasi: %s%n",
                id, name, price, categories);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.id == ((Product) obj).id && this.name.equals(((Product) obj).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
