package com.jlabs.ecomm.endpoint;

import com.jlabs.ecomm.domain.Warehouse;
import com.jlabs.ecomm.service.WarehouseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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

    @RefreshScope
    @RequestMapping(method = RequestMethod.GET,value = "/warehouse/All",produces = "application/json")
    public List<Warehouse> getWarehouse(){
        return  warehouseService.getAllWarehouse();
    }


    @RequestMapping(method = RequestMethod.GET,value = "/warehouse/Warehouse"+" "+"Number/{wareHouseNumber}",produces = "application/json")
    public List<Warehouse> getDataByWarehouseNumber(@PathVariable String wareHouseNumber){
        return warehouseService.getByWareHouseNumber(wareHouseNumber);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/warehouse/Customer"+" "+"Name/{customerName}",produces = "application/json")
    public List<Warehouse> getDataByCustomerName(@PathVariable String customerName){
        return warehouseService.getByCustomerName(customerName);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/warehouse/Date/{date}",produces = "application/json")
    public List<Warehouse> getDataByDate(@PathVariable String date){
        return warehouseService.getByDate(date);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/warehouse",produces = "application/json")
    public Warehouse saveDetails(@RequestBody String warehouseData){
        return  warehouseService.addDetails(warehouseData);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/warehouse/wareHouseNumberDetails",produces = "application/json")
    public List<Warehouse> getDataByWarehouseNumberDetails(
            @javax.ws.rs.QueryParam("wareHouseNumber") String wareHouseNumber,
            @javax.ws.rs.QueryParam("customerName") String customerName,
            @javax.ws.rs.QueryParam("date") String date

    ){
        return warehouseService.getByWarehouseNumberOrCustomerNameOrDate(wareHouseNumber,customerName,date);
    }

}
