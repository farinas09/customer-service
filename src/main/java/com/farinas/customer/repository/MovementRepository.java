package com.farinas.customer.persistence.jpa;

import com.farinas.customer.entity.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovementRepository extends JpaRepository<Movement, Long> {
}
