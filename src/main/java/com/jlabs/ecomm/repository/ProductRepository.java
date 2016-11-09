package com.jlabs.ecomm.repository;

import com.jlabs.ecomm.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by sapan on 11/5/2016.
 */


public interface ProductRepository  extends MongoRepository<Product,String>{


}
