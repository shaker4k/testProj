package org.proselyte.testproj.repository;

import org.proselyte.testproj.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
