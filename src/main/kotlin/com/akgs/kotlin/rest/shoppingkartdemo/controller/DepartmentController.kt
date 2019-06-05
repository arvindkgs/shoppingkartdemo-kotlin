package com.akgs.kotlin.rest.shoppingkartdemo.controller

import com.akgs.kotlin.rest.shoppingkartdemo.service.DepartmentRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/departments")
class DepartmentController(private val departmentRepository: DepartmentRepository) {

    @GetMapping(value = "", produces = ["application/JSON"])
    fun getAllDepartments() = departmentRepository.findAll()

    @GetMapping("/{id}")
    fun getDepartment(@PathVariable("id") departmentId: Integer) = departmentRepository.findById(departmentId)

}