package com.farinas.customer.persistence.jpa;

import com.farinas.customer.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}