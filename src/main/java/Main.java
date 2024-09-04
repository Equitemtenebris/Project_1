import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;
import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;


public class Main {
    public static void main(String[] args){
        Meat meat = new Meat(5, 100.00);
        Apple redApple = new Apple(10, 50.00, RED);
        Apple greenApple = new Apple(8, 60.00, GREEN);

        Food[] items = {meat, redApple,greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(items);

        System.out.println("Общая сумма без скидки: " + shoppingCart.getTotalWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + shoppingCart.getTotalWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getTotalVegetarianWithoutDiscount());


    }
}
