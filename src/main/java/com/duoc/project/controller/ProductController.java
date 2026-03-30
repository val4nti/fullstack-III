// La ruta base será http://localhost:8081/productos 

package com.empresa.productservice.controller;

import com.empresa.productservice.model.Product;
import com.empresa.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/productos") 
public class ProductController {
    @Autowired 
    private ProductService svc;

    @GetMapping 
    public List<Product> getAll() {
        return svc.findAll();
    }

    @GetMapping("/{id}") 
    public Product getById(@PathVariable Long id) {
        return svc.findById(id);
    }

    @PostMapping 
    public void create(@RequestBody Product p) {
        svc.save(p);
    }

    @DeleteMapping("/{id}") 
    public void delete(@PathVariable Long id) {
        svc.delete(id);
    }
}
