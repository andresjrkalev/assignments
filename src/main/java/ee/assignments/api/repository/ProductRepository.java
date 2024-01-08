package ee.assignments.api.repository;

import ee.assignments.api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * For communicating with database
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
