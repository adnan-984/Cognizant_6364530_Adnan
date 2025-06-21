interface Product {
    void use();
}

class Book implements Product {
    public void use() {
        System.out.println("Reading a book...");
    }
}

class Laptop implements Product {
    public void use() {
        System.out.println("Using a laptop...");
    }
}

abstract class ProductFactory {
    public abstract Product createProduct();
}

class BookFactory extends ProductFactory {
    public Product createProduct() {
        return new Book();
    }
}

class LaptopFactory extends ProductFactory {
    public Product createProduct() {
        return new Laptop();
    }
}

class FactoryPattern {
    public static void main(String[] args) {
        ProductFactory factory1 = new BookFactory();
        Product product1 = factory1.createProduct();
        product1.use();

        ProductFactory factory2 = new LaptopFactory();
        Product product2 = factory2.createProduct();
        product2.use();
    }
} 