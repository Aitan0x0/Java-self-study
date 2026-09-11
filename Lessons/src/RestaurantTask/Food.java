package RestaurantTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Food extends MenuItem {
    private static final Logger log = LoggerFactory.getLogger(Food.class);
    private boolean isVegetarian;

    //constructor
    public Food(int id, String name, double price, boolean isVegetarian) {
        super(id, name, price);
        this.isVegetarian = isVegetarian;
    }

    //constructor

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public String getDetails() {
       return String.format("Id: %d%nName: %s%nPrice: %.2f%nVegetarian%s%n", getId(), getName(), getPrice(), isVegetarian ? "dir" : " deyil");
    }
}

