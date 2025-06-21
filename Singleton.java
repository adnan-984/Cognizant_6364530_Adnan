// =====================================
// Exercise 1: Implementing the Singleton Pattern
// =====================================

// Singleton class ensures only one instance is created
class main {
    // Static variable to hold single instance
    private static main instance;

    // Private constructor prevents instantiation from other classes
    private main() {
        System.out.println("Singleton instance created.");
    }

    // Static method to get the single instance of the class
    public static main getInstance() {
        if (instance == null) {
            instance = new main();
        }
        return instance;
    }

    // Method to display a message
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}

// Driver class to test Singleton
public class Singleton {
    public static void main(String[] args) {
        // Trying to create multiple instances
        main s1 = main.getInstance();
        main s2 = main.getInstance();

        // Display message
        s1.showMessage();

        // Checking if both references point to the same instance
        if (s1 == s2) {
            System.out.println("Both s1 and s2 are the same instance.");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}
