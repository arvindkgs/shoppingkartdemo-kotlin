package com.akgs.kotlin.rest.shoppingkartdemo.service

import com.akgs.kotlin.rest.shoppingkartdemo.model.Department
import org.springframework.data.repository.CrudRepository

interface DepartmentRepository : CrudRepository<Department, Integer>
