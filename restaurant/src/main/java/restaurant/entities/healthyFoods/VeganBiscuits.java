package restaurant.entities.healthyFoods;

import restaurant.entities.healthyFoods.Food;

public class VeganBiscuits extends Food {
    private static final double INITIAL_VEGAN_BISCUITS_PORTION = 205.00;

    public VeganBiscuits(String name, double price) {
        super(name, INITIAL_VEGAN_BISCUITS_PORTION, price);
    }
}
