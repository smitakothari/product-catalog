package com.jlabs.ecomm.endpoint;

import com.jlabs.ecomm.domain.Warehouse;
import com.jlabs.ecomm.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by smita on 12/13/16.
 */
@RestController
@CrossOrigin
public class WarehouseEndpoint {

    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping(method = RequestMethod.GET,value = "/warehouse",produces = "application/json")
    public List<Warehouse> getWarehouse(){
        return  warehouseService.getAllWarehouse();
    }
}
