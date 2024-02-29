package br.com.dog.demoapi.services

import br.com.dog.demoapi.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong()
    private val logger = Logger.getLogger(PersonService:: class.java.name)

    fun findById(id: Long) : Person{
        logger.info("Finding a person")

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Marcilia"
        person.lastName = "Guilger"
        person.address = "Rua manga"
        person.gender  = "Female"

        return person
    }
}