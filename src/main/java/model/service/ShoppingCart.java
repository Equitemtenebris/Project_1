package model.service;

import model.Food;

public class ShoppingCart {
    public Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total = total + (item.amount * item.price);
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double discount = item.getDiscount() / 100;
            double discountedPrice = item.price * (1 - discount);
            total = total + (item.amount * discountedPrice);
        }
        return total;
    }

    public double getTotalVegetarianWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian) {
                total = total + (item.amount * item.price);
            }
        }
        return total;
    }
}
