public class CustomerCreator {

    public static void main(String[] args) {

        // Create customer object
        Customer customer1 = new Customer("Bob Smith", 640);

        // Print results
        System.out.println("Name: " + customer1.getName());
        System.out.println("Credit Score: " + customer1.getCreditScore());
        System.out.println("Credit Rating: " + customer1.getCreditRating());
    }
}