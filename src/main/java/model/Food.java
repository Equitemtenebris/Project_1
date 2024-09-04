package model;


public abstract class Food implements Discountable {
    public int amount;
    public double price;
    public boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public abstract double getDiscount();
}

