package com.jlabs.ecomm.repository;

import com.jlabs.ecomm.domain.Warehouse;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by smita on 12/13/16.
 */
public interface WarehouseRepository extends MongoRepository<Warehouse,String> {

    public Warehouse findByWarehouseNumber(String warehouseNumber);
    public Warehouse findByCustomerName(String customerName);
    public Warehouse findByDate(String date);
//    public Warehouse findByWarehouseNumberandDate(String warehouseNumber,String date);
    public Warehouse findByWarehouseNumberOrCustomerNameOrDate(String warehouseNumber,String customerName,String date);


}
