package RestaurantTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        OrderManager om1 = new OrderManager();
        Drink d1 = new Drink(1, "CocaCole", 1, true);
        Drink d2 = new Drink(2, "Water", 0.80, false);
        Drink d3 = new Drink(3, "Coffe", 7, false);

        Food f1 = new Food(5, "Lazanya", 12, false);
        Food f2 = new Food(6, "Salad", 9, true);
        Food f3 = new Food(7, "Burger", 21, false);
        om1.addMenuItem(f1, f2, f3, d1, d2, d3);
        om1.addToOrder(1 , 10);
        om1.addToOrder(3 , 3);
        om1.addToOrder(6 , 4);
        om1.printReceipt();

    }
}
