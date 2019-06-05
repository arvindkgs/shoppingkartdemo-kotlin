package com.akgs.kotlin.rest.shoppingkartdemo.service

import com.akgs.kotlin.rest.shoppingkartdemo.model.Category
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface CategoryRepository : CrudRepository<Category, Integer> {
    @Query("select c from Category c join c.products cp where cp.product_id = :#{#product_id}")
    fun getCategoriesByProductId(@Param("product_id") productId: Integer) : Collection<Category>

    fun getCategoriesByDepartmentId(departmentId: Integer) : Collection<Category>
}