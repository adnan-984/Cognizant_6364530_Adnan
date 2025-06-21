import java.util.*;

class ECommerceSearch {
    // Method to perform case-insensitive search over product list
    public static List<String> searchProducts(List<String> catalog, String query) {
        List<String> result = new ArrayList<>();
        for (String product : catalog) {
            if (product.toLowerCase().contains(query.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }
}

class ECommerce {
    public static void main(String[] args) {
        List<String> productCatalog = Arrays.asList("Laptop", "Smartphone", "Smartwatch", "Book", "Notebook", "Tablet");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search query: ");
        String query = scanner.nextLine();

        List<String> results = ECommerceSearch.searchProducts(productCatalog, query);

        if (results.isEmpty()) {
            System.out.println("No products found matching your query.");
        } else {
            System.out.println("Search Results:");
            for (String product : results) {
                System.out.println("- " + product);
            }
        }

        scanner.close();
    }
}
