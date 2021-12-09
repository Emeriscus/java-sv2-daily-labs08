package day01;

public class Product {

    private static int numberOfProduct;
    private String name;

    public Product(String name) {
        this.name = name;
        numberOfProduct++;
    }

    public static int getNumberOfProduct() {
        return numberOfProduct;
    }
}
