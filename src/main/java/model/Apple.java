package model;


import model.constants.Discount;
import static model.constants.Colour.RED;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (this.colour.equals(RED)) {
            return Discount.RED_APPLE_DISCOUNT;

        }
        return 0.0;
    }


}
