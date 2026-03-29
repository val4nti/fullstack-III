//la clase con los atributos id, nombre y precio
public class Product {
    private Long id;
    private String nombre;
    private Double precio;

    public Product() {}
    public Product(Long id, String nombre, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    // getters y setters...
}
