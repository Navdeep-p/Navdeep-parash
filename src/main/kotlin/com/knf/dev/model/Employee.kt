package com.knf.dev.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "employees")
data class Employee(
        @Id
        var id: String? = ObjectId().toHexString(),
        val firstName: String,
        val department: String,
        val emailId: String
)