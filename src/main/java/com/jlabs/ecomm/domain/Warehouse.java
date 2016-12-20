package com.jlabs.ecomm.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

/**
 * Created by smita on 12/13/16.
 */
@Document(collection = "Warehouse")
public class Warehouse {

    @Id
    private String _id;

    private String customerName;
    private String warehouseNumber;


    public Warehouse(String _id, String customerName, String warehouseNumber) {
        this._id = _id;
        this.customerName = customerName;
        this.warehouseNumber = warehouseNumber;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getWarehouseNumber() {
        return warehouseNumber;
    }



    public void setId(Object _id) {
        _id = _id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }


    @Override
    public String toString(){
        return String.format("Warehouse:[Id=%s,customerName=%s,warehouseNumber=%s]", _id,customerName,warehouseNumber);
    }

}
