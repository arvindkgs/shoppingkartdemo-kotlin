package com.akgs.kotlin.rest.shoppingkartdemo.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import javax.persistence.*

@Entity
class Product(
        @Id
        @GeneratedValue
        @Column(name = "product_id", unique = true, nullable = false)
        var product_id: Integer,
        var name: String,
        var description: String,
        var price: Double,
        var discounted_price: Double,
        var image: String,
        var image_2: String,
        var thumbnail: String,
        var display: Int,
        @ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
        @JsonIgnoreProperties("products")
        var category: MutableSet<Category>? = null
) : Serializable