package uk.ac.westminster.products_api;


// Unchecked: it extends RuntimeException, so nothing is
// forced to declare throws or to catch it.

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id) {
        super("Product not found with id: " + id);
    }
}
