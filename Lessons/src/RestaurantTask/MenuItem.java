package RestaurantTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * MenuItem abstrakt klassi
 */
abstract class MenuItem {
    private static final Logger log = LoggerFactory.getLogger(MenuItem.class);
    private int id;
    private String name;
    private double price;

    //konstruktor
    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    //metodlar (getter)
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDetails() {
        return String.format("Id: %d%nName: %s%nPrice: %.2f%nVegetarian%s%n", id,name,price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return id == ((MenuItem) obj).id && name.equals(((MenuItem) obj).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
