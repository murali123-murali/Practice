import java.util.ArrayList;
import java.util.List;
/*

 */

public class Solution {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenovo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        productsList.stream()
                .filter(p ->p.price> 3000)   // filtering price
                .map(p ->p.price)          // fetching price
                .forEach(System.out::println);
    }
}


