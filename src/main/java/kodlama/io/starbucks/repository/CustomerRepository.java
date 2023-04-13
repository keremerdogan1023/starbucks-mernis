package kodlama.io.starbucks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.starbucks.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
