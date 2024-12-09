package com.pluralsight.NorthwindTradersSpringBoot;

import java.util.List;

public interface ProductDao {
    boolean add(Product product);
    List<Product> getAll();
}
