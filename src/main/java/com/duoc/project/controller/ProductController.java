
@RestController
@RequestMapping("/productos")
public class ProductController {
  @Autowired ProductService svc;

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
.