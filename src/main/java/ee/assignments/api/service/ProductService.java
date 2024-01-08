package ee.assignments.api.service;

import ee.assignments.api.model.Product;
import ee.assignments.api.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Business logic layer for products
 */
@Service
public class ProductService {
    /**
     * For communicating with database
     */
    private final ProductRepository productRepository;

    /**
     * Initializing class private property using Spring dependency injection
     *
     * @param productRepository - database communication
     */
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Get all products from database
     *
     * @return - returns all products from database
     */
    public List<Product> read() {
        return productRepository.findAll();
    }

    /**
     * Get product by id from database
     *
     * @param id - represents product id which will be found
     * @return - returns product by id from database or null of not found
     */
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    /**
     * Create new product to database
     *
     * @param product - represents new data what will be inserted in to database
     * @return - returns new created product
     */
    public Product create(Product product) {
        return productRepository.save(product);
    }

    /**
     * Update product in database
     *
     * @param id - represents product id which will updated
     * @param product - represents new data what will be replaced in database
     * @return - returns updated product
     */
    public Product update(Long id, Product product) {
        Product existingProduct = findById(id);
        if (existingProduct == null) return null;
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        return create(existingProduct);
    }

    /**
     * Delete product by id from database
     *
     * @param id - represents product id which will deleted
     */
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
