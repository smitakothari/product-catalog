package com.jlabs.ecomm.repository;

import com.jlabs.ecomm.domain.Warehouse;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by smita on 12/13/16.
 */
public interface WarehouseRepository extends MongoRepository<Warehouse,String> {

    public Warehouse findByWarehouseNumber(String warehouseNumber);

}
