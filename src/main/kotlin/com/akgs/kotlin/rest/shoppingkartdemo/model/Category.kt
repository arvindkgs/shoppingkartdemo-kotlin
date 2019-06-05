package com.akgs.kotlin.rest.shoppingkartdemo.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import javax.persistence.*

@Entity
class Category(
        @Id
        @GeneratedValue
        @Column(name = "category_id", unique = true, nullable = false)
        var categoryId: Integer,
        @Column(name = "department_id")
        var departmentId: Integer,
        var name: String,
        @Column(length = 500)
        var description: String,
        @ManyToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        @JoinTable(name = "product_category", joinColumns = [JoinColumn(name = "category_id")], inverseJoinColumns = [JoinColumn(name = "product_id")])
        @JsonIgnoreProperties("category")
        var products: MutableSet<Product>
) : Serializable