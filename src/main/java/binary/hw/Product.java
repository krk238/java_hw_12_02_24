package binary.hw;

public class Product {

    private long productId;
    private String name;
    private double price;

    public Product(long productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void getProductID() {
        System.out.println("Your product ID is " + this.productId);
    }

    public void getName() {
        System.out.println("Your product name is " + this.name);
    }

    public void getPrice() {
        System.out.println("The product price is $" + this.price);
    }

    public static void main(String[] args) {
        Product Bicycle1 = new Product(192048124, "TurboBike", 789.29);
        Bicycle1.getProductID();
        Bicycle1.getName();
        Bicycle1.getPrice();

        System.out.println("----------------------------------------------------------");

        Product Bicycle2 = new Product(192048385, "FastAero", 1000.29);
        Bicycle2.getProductID();
        Bicycle2.getName();
        Bicycle2.getPrice();
    }
}
