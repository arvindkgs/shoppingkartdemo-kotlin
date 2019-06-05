package com.akgs.kotlin.rest.shoppingkartdemo.controller

import com.akgs.kotlin.rest.shoppingkartdemo.service.CategoryRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoryController(private val categoryRepository: CategoryRepository) {
    @GetMapping
    fun getCategories() = categoryRepository.findAll()

    @GetMapping("/{id}")
    fun getCategory(@PathVariable("id") categoryId: Integer) = categoryRepository.findById(categoryId)

    @GetMapping("/inProduct/{product_id}")
    fun getCategoriesOfProduct(@PathVariable("product_id") productId: Integer) = categoryRepository.getCategoriesByProductId(productId)

    @GetMapping("/inDepartment/{department_id}")
    fun getCategoriesOfDepartment(@PathVariable("department_id") departmentId: Integer) = categoryRepository.getCategoriesByDepartmentId(departmentId)
}