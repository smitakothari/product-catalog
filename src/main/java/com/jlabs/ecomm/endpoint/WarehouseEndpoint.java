package com.jlabs.ecomm.endpoint;

import com.jlabs.ecomm.domain.Warehouse;
import com.jlabs.ecomm.service.WarehouseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

/**
 * Created by smita on 12/13/16.
 */
@RestController
@CrossOrigin
@EnableSwagger2
@Api(value="WareHouse", description = "Details on WareHouse API")
public class WarehouseEndpoint {

    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping(method = RequestMethod.GET,value = "/warehouse",produces = "application/json")
    public List<Warehouse> getWarehouse(){
        return  warehouseService.getAllWarehouse();
    }


    @RequestMapping(method = RequestMethod.GET,value = "/warehouse/{wareHouseNumber}",produces = "application/json")
    public Warehouse getWarehouse(@PathVariable String wareHouseNumber){
        return  warehouseService.getByWareHosueName(wareHouseNumber);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/warehouse",produces = "application/json")
    public Warehouse saveDetails(@RequestBody String warehouseData){
        return  warehouseService.addDetails(warehouseData);
    }
}
