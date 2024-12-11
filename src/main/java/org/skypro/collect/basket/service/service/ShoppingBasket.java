package org.skypro.collect.basket.service.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.skypro.collect.basket.service.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Service
public class ShoppingBasket {

    private final StoreService storeService;

    private final List<Product> products;

    public ShoppingBasket(StoreService storeService) {
        this.storeService = storeService;
        this.products = new ArrayList<>();
    }

    public void addInBasket(List<Integer> id) {
        for (Product product : storeService.getProductList()) {
            for (Integer i : id) {
                if (product.getId().equals(i)) {
                    products.add(product);
                }
            }
        }
    }

    public Collection<Product> getBasket() {
        return Collections.unmodifiableList(products);
    }

}
