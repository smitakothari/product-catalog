package com.jlabs.ecomm.domain;

/**
 * Created by smita on 12/13/16.
 */
public class Warehouse {

    public Warehouse(String id, String customerName, String warehouseNumber) {
        this.id = id;
        this.customerName = customerName;
        this.warehouseNumber = warehouseNumber;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    private String id;

    public void setId(String id) {
        id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    private String customerName;
    private String warehouseNumber;

}
