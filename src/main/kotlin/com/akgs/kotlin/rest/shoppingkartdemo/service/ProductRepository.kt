package com.akgs.kotlin.rest.shoppingkartdemo.service

import com.akgs.kotlin.rest.shoppingkartdemo.model.Product
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Integer>{

}