package com.crudapisw.sw.repositories

import com.crudapisw.sw.entities.Planet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlanetRepository: JpaRepository<Planet, Long> {

}
