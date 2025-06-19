
import java.util.*;

public class SearchFunction_code {
    public static List<String> search(List<String> products, String keyword) {
        List<String> result = new ArrayList<>();
        for (String product : products) {
            if (product.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> products = Arrays.asList("Shoes", "Shirts", "Pants", "Socks", "Hat");

        String keyword = "p";
        List<String> found = search(products, keyword);

        System.out.println("Search Results:" + keyword);
        for (String product : found) {
            System.out.println(product);
        }
    }
}
