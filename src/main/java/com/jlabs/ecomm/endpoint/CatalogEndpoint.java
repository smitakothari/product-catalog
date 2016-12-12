package com.jlabs.ecomm.endpoint;

import com.jlabs.ecomm.domain.Product;
import com.jlabs.ecomm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sapan on 11/4/2016.
 */

@RestController
@CrossOrigin
public class CatalogEndpoint {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = "/health", produces = "application/json")
    public String getHealth() {
        return "Catalog-Health";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/products",produces = "application/json")
    public List<Product> getProducts(){
        return  productService.getAllProducts();
    }
}
