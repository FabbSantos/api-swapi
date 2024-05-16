package com.crudapisw.sw.controllers


import com.crudapisw.sw.entities.Planet
import com.crudapisw.sw.repositories.PlanetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/planets")
class PlanetController {
    @Autowired
    lateinit var planetRepository: PlanetRepository

    @GetMapping
    fun listPlanets(): List<Planet> {
        return planetRepository.findAll()
    }

    @PostMapping
    fun createPlanet(@RequestBody planet: Planet) {
        planetRepository.save(planet)
    }
}