package org.skypro.collect.basket.service.controller;

import java.util.Collection;
import java.util.List;
import org.skypro.collect.basket.service.model.Product;
import org.skypro.collect.basket.service.service.ShoppingBasket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class StoreController {

    private ShoppingBasket shoppingBasket;

    public StoreController(ShoppingBasket shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    @GetMapping("/add")
    public void add(@RequestParam List<Integer> id) {
        shoppingBasket.addInBasket(id);
    }

    @GetMapping("/get")
    public Collection<Product> get() {
        return shoppingBasket.getBasket();
    }
}
