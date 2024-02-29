package br.com.dog.demoapi.controller

import br.com.dog.demoapi.model.Person
import br.com.dog.demoapi.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController {
    @Autowired
    private lateinit var service: PersonService

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET],
        produces = [MediaType.APPLICATION_JSON_VALUE])
    fun get(@PathVariable(value="id") id: Long) : Person {
        return service.findById(id)
    }
}