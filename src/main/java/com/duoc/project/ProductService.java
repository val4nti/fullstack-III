@Service
public class ProductService {
  @Autowired
  private ProductRepository repo;

  public List<Product> findAll() {
    return repo.findAll();
  }
  public Product findById(Long id) {
    return repo.findById(id);
  }
  public void save(Product p)   { repo.save(p); }
  public void delete(Long id)   { repo.delete(id); }
}

