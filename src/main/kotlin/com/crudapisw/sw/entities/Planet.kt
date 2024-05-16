package com.crudapisw.sw.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Planet(
    @Id
    val id: String? = null,

    val name: String? = null,

    val climate: String? = null,
    val terrain: String? = null,
    val population: Long? = null
)