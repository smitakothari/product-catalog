package com.jlabs.ecomm.service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.jlabs.ecomm.domain.Warehouse;
import com.jlabs.ecomm.repository.WarehouseRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by smita on 12/13/16.
 */

@Service
public class WarehouseService {

    @Inject
    private WarehouseRepository warehouseRepository;


    public List<Warehouse> getAllWarehouse(){

        List<Warehouse> warehouseList = new ArrayList<>();
//        Warehouse warehouse1 = new Warehouse(1,"abc","11");
//        Warehouse warehouse2 = new Warehouse(2,"xyz","22");
//        warehouseList.add(warehouse1);
//        warehouseList.add(warehouse2);
        return warehouseRepository.findAll();
//       return  warehouseList;
    }

    public List<Warehouse> getByWareHouseNumber(String wareHouseNumber){
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(warehouseRepository.findByWarehouseNumber(wareHouseNumber));
        return warehouseList;
    }

    public List<Warehouse> getByCustomerName(String customerName){
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(warehouseRepository.findByCustomerName(customerName));
        return warehouseList;
    }

    public List<Warehouse> getByDate(String date){
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(warehouseRepository.findByDate(date));
        return warehouseList;
    }

public List<Warehouse> getByDateAndWarehouseNumber(String date){
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(warehouseRepository.findByDate(date));
        return warehouseList;
    }

public List<Warehouse> getByWarehouseNumberOrCustomerNameOrDate(String warehouseNumber,String customerName,String date){
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(warehouseRepository.findByWarehouseNumberOrCustomerNameOrDate(warehouseNumber,customerName,date));
        return warehouseList;
    }

    public Warehouse addDetails(String warehouseData) {
      Warehouse w =  new Gson().fromJson(warehouseData, Warehouse.class);
        return warehouseRepository.save(w);
    }
}
