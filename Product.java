public class Product {
    
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
       setName(name);
       setPrice(price);
       setStock(stock);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void printProductDetails() {
        System.out.println("Product name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Stock: " + getStock());
    }
}