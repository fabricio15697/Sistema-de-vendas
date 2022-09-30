package entities;

public class Product {

    private String name;
    private int id;
    private float value;
    private int quantity;
    private Supplier id_supplier;

    public Product(String name, int id, float value, int quantity, Supplier id_supplier) {
        this.name = name;
        this.id = id;
        this.value = value;
        this.quantity = quantity;
        this.id_supplier = id_supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Supplier getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(Supplier id_supplier) {
        this.id_supplier = id_supplier;
    }
}
