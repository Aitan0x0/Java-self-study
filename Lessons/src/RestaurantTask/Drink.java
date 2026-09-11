package RestaurantTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Drink extends MenuItem {
    private static final Logger log = LoggerFactory.getLogger(Drink.class);
    private boolean isCarbonated;

    //constructor
    public Drink(int id, String name, double price, boolean isCarbonated) {
        super(id, name, price);
        this.isCarbonated = isCarbonated;

    }

    public boolean isCarbonated() {
        return isCarbonated;
    }

    @Override
    public String getDetails() {
        return String.format("Id: %d%nName: %s%nPrice: %.2f%nQaz%s%n", getId(), getName(), getPrice(), isCarbonated ? "li" : "siz");
    }
}
