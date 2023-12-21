package seminars.first.Shop;

import java.util.ArrayList;
import static org.assertj.core.api.Assertions.*;

import seminars.first.Calculator.Calculator;
import seminars.first.Shop.Shop;

public class ShopTest {
    public static void main(String[] args) {
        ArrayList<Product> shop = new ArrayList<>();
        Product product1 = new Product();
        product1.setTitle("One");
        product1.setCost(100);
        shop.add(product1);
        Product product2 = new Product();
        product2.setTitle("Two");
        product2.setCost(120);
        shop.add(product2);
        Product product3 = new Product();
        product3.setTitle("Three");
        product3.setCost(80);
        shop.add(product3);
        Product product4 = new Product();
        product4.setTitle("Four");
        product4.setCost(90);
        shop.add(product4);

        Shop rshop = new Shop();
        rshop.setProducts(shop);


        if (!rshop.getMostExpensiveProduct().equals(product2)) {
            throw new AssertionError("Ошибка в методе getMostExpensiveProduct");
        }

        if (!rshop.getProducts().containsAll(shop)) {
            throw new AssertionError("Содержимое корзины указано неверно");
        }
    }
    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.

   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

}