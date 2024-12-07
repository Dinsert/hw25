package org.skypro.collect.basket.service.service;

import java.util.List;
import org.skypro.collect.basket.service.model.Product;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    private final List<Product> productList = List.of(new Product(1, "Bread1", 51),
                                                      new Product(2, "Bread2", 52),
                                                      new Product(3, "Bread3", 53),
                                                      new Product(4, "Bread4", 54),
                                                      new Product(5, "Bread5", 55),
                                                      new Product(1, "Bread6", 56),
                                                      new Product(2, "Bread7", 57),
                                                      new Product(3, "Bread8", 58),
                                                      new Product(4, "Bread9", 59),
                                                      new Product(5, "Bread10", 60),
                                                      new Product(5, "Bread11", 61));

    public List<Product> getProductList() {
        return productList;
    }

}
