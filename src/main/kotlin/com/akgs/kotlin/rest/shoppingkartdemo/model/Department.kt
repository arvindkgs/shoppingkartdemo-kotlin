package com.akgs.kotlin.rest.shoppingkartdemo.model

import lombok.Data
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Data
class Department(
        @Id
        var department_id: Integer,
        var name: String,
        var description: String
)