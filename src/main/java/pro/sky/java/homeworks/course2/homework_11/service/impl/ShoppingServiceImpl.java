package pro.sky.java.homeworks.course2.homework_11.service.impl;

//import pro.sky.java.homeworks.course2.homework_11.data.Basket;
import pro.sky.java.homeworks.course2.homework_11.data.Product;

import java.util.HashSet;
import java.util.Set;

public class ShoppingServiceImpl {

// добавить implemets ShoppingService когда допишу код, чтобы не мешали ошибки

    Set<Product> basket = new HashSet<>();

    public Product add(Product item) {
        basket.add(item);
        return item;
    }
}
