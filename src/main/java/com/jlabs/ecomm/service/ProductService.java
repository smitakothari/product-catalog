package com.jlabs.ecomm.service;

import com.jlabs.ecomm.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sapan on 11/4/2016.
 */

@Service
public class ProductService {

    private Product product;

    public List<Product> getAllProducts(){

        List<Product> productList = new ArrayList<>();
        Product product1 = new Product(24,"product-test","prouct-test-type");
        Product product2 = new Product(24,"product-test","prouct-test-type");
        productList.add(product1);
        productList.add(product2);
        return  productList;
    }
}
