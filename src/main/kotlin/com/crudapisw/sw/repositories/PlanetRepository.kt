package com.crudapisw.sw.repositories

import com.crudapisw.sw.entities.Planet
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PlanetRepository: MongoRepository<Planet, String> {

}
