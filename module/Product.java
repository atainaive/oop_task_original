package module;

public class Product{
    private final String name;
    private final Euro price;

    public Product(String name, Euro price) {
        this.name = name;
        this.price = price;
    }

    public Euro getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ";" + price;
    }

    @Override
    public boolean equals(Object object){
        if (object == null) {
            return false;
        }

        Product o = (Product) object;

        return this.price.equals(o.price) && this.name.equals(o.name);
    }
}
