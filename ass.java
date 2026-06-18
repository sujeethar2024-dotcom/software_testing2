class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}

class Customer {
    int customerId;
    String customerName;

    Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
    }
}

class Order {
    Product product;
    Customer customer;

    Order(Product product, Customer customer) {
        this.product = product;
        this.customer = customer;
    }

    void displayOrderSummary() {
        System.out.println("\n----- Order Summary -----");
        customer.displayCustomer();
        product.displayProduct();
        System.out.println("-------------");
    }
}

public class ass {

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 50000);
        Customer c1 = new Customer(1, "Sujeetha");

        Order order1 = new Order(p1, c1);

        order1.displayOrderSummary();
    }
}