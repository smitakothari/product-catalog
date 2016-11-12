package com.jlabs.ecomm.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sapan on 11/4/2016.
 */

@Document(collection = "Product")
public class Product {

    @Id
    private Object _id;
    private String productName;
    private String productType;

    public Product(Object _id, String productName, String productType) {
        this._id = _id;
        this.productName = productName;
        this.productType = productType;
    }

    public Object get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
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
        return String.format("Product:[Id=%s,prodName=%s,prodType=%s]", _id,productName,productType);
    }
}
