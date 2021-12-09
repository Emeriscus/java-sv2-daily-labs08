package day01;

public class ProductMain {

    public static void main(String[] args) {

        System.out.println(Product.getNumberOfProduct());

        Product product = new Product("alma");
        System.out.println(product.getNumberOfProduct());

        Product product2 = new Product("körte");
        System.out.println(Product.getNumberOfProduct());
    }
}