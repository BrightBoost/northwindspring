package com.pluralsight.NorthwindTradersSpringBoot;

import java.util.ArrayList;
import java.util.List;

public class SimpleProductDao implements ProductDao {
    private List<Product> products = new ArrayList<>();

    @Override
    public boolean add(Product product) {
        products.add(product);
        return false;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
