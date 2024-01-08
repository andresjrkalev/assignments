package ee.assignments.api.controller;

import ee.assignments.api.model.Product;
import ee.assignments.api.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static ee.assignments.api.common.Constant.*;

/**
 * API endpoints for product
 */
@RestController
@RequestMapping(ENDPOINT_PRODUCT)
public class ProductController {
    /**
     * For communicating with business logic layer
     */
    private final ProductService productService;

    /**
     * Initializing class private property using Spring dependency injection
     *
     * @param productService - represents business logic layer
     */
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Endpoint for getting all products
     *
     * @return - returns all products from database
     */
    @GetMapping
    public List<Product> read() {
        return productService.read();
    }

    /**
     * Endpoint for getting product by id
     *
     * @param id - represents product id which will be found
     * @return - returns product by id from database
     */
    @GetMapping(ENDPOINT_ID)
    public Product findById(@PathVariable Long id) {
        return productService.findById(id);
    }

    /**
     * Endpoint for creating new product
     *
     * @param product - represents new product
     * @return - returns new created product
     */
    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    /**
     * Endpoint for updating product by id
     *
     * @param id - represents product id
     * @param product - represents new product data
     * @return - updated product
     */
    @PutMapping(ENDPOINT_ID)
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return productService.update(id, product);
    }

    /**
     * Endpoint for deleting product by id
     *
     * @param id - represents product id
     */
    @DeleteMapping(ENDPOINT_ID)
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
