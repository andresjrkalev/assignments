package ee.assignments.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Product table in database and API data transfer object
 */
@Entity
@Getter
@Setter
public class Product {

    /**
     * Product id column in database
     */
    @Id
    @GeneratedValue
    private Long id;
    /**
     * Product name column in database
     */
    private String name;
    /**
     * Product price column in database
     */
    private int price;
}
