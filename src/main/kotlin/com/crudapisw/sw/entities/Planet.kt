package com.crudapisw.sw.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull

@Entity
@Table
data class Planet(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @field: NotNull
    val name: String,
    
    val climate: String,
    val terrain: String,
    val population: Long
)

