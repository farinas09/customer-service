package com.farinas.customer.persistence.jpa;

import com.farinas.customer.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}