package com.pluralsight.sprongbootweb.events;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    public Optional<Product> findById(int id) {
        return Optional.empty();
    }

    public List<Product> findByEventId(int eventId) {
        return null;
    }

    public List<Product> findAll(){
        return null;
    }
}
