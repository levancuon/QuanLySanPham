package org.example.thymeleafquanlysanpham.service;

import org.example.thymeleafquanlysanpham.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    private static final Map<Integer, Product> productList;

    static {
        productList = new HashMap<>();
        productList.put(1, new Product(1, "Giày", 123));
        productList.put(2, new Product(2, "Dép", 456));
        productList.put(3, new Product(3, "Sịp", 789));
        productList.put(4, new Product(4, "Áo", 159));
        productList.put(5, new Product(5, "Quần", 753));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void add(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id,product);
    }

    @Override
    public void remove(int id) {
productList.remove(id);
    }
}
