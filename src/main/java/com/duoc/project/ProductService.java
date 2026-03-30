package com.empresa.productservice.service;

import com.empresa.productservice.model.Product;
import com.empresa.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // [cite: 133]
public class ProductService {
    @Autowired 
    private ProductRepository repo;

    public List<Product> findAll() { return repo.findAll(); } 
    public Product findById(Long id) { return repo.findById(id); } 
    public void save(Product p) { repo.save(p); }
    public void delete(Long id) { repo.delete(id); } 
}

