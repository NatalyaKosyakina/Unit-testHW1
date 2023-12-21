package seminars.first.Shop;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Product o) {
        if (cost > o.cost) return 1;
        if (cost < o.cost) return -1;
        return 0;
    }


    public int compare(Product o1, Product o2) {
        if (o1.cost > o2.cost) return 1;
        if (o1.cost < o2.cost) return -1;
        return 0;
    }
}