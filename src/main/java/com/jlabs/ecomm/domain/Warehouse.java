package com.jlabs.ecomm.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by smita on 12/13/16.
 */
@Document(collection = "Warehouse")
public class Warehouse {

    @Id
    private String _id;

    private String customerName;
    private String warehouseNumber;
    private String date;


    public Warehouse(String customerName, String warehouseNumber, String date) {
        this._id = _id;
        this.customerName = customerName;
        this.warehouseNumber = warehouseNumber;
        this.date = date;
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

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return String.format("Warehouse:[Id=%s,customerName=%s,warehouseNumber=%s,date=%s]", _id,customerName,warehouseNumber,date);
    }

}
