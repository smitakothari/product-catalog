package com.jlabs.ecomm.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by smita on 12/13/16.
 */
@Document(collection = "Warehouse")
public class Warehouse {

    public Warehouse(Object _id, String customerName, String warehouseNumber) {
        this._id = _id;
        this.customerName = customerName;
        this.warehouseNumber = warehouseNumber;
    }

    public Object getId() {
        return _id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    @Id
    private Object _id;

    public void setId(Object _id) {
        _id = _id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    private String customerName;
    private String warehouseNumber;

    @Override
    public String toString(){
        return String.format("Warehouse:[Id=%s,customerName=%s,warehouseNumber=%s]", _id,customerName,warehouseNumber);
    }

}
