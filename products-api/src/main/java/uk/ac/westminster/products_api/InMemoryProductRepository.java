package uk.ac.westminster.products_api;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;


@Repository
public class InMemoryProductRepository implements ProductRepository {

    private final Map<Long, Product> store = new
            HashMap<>();
    private Long nextId = 1L;

    public InMemoryProductRepository() {
        // TODO (a): if the product has no id, give it nextId and increment
        // TODO (b): put it in the map under its id
        // TODO (c): return the product

    }

    @Override
    public Product save(Product product){
        if(product.getId() == null){
            product.setId(nextId++);
        }

        store.put(product.getId(), product);
        return product;

    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
