package com.jlabs.ecomm.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sapan on 11/4/2016.
 */

@Document(collection = "Product")
public class Product {

    @Id
    private long productId;
    private String productName;
    private String productType;

    public Product(long productId, String productName, String productType) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString(){
        return String.format("Product:[Id=%s,prodName=%s,prodType=%s]",productId,productName,productType);
    }
}
