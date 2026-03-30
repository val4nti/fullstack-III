//  Crea una clase anotada con @Repository que contenga una List<Product> 
//para simular la base de datos en memoria 
package com.empresa.productservice.repository;

import com.empresa.productservice.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository 
public class ProductRepository {
    
    private List<Product> lista = new ArrayList<>();

    public List<Product> findAll() {
        return lista; 
    }

    public Product findById(Long id) {
        return lista.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst().orElse(null); 
    }

    public void save(Product p) {
        lista.add(p); 
    }

    public void delete(Long id) {
        lista.removeIf(p -> p.getId().equals(id)); 
    }
}