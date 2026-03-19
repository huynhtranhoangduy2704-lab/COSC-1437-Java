/*
Customer
Duy Huynh
Feb 29 2026
JDK 25
*/

public class Customer {

    // Instance variables
    private String name = null;
    private int creditScore = 300;

    // Constructor
    public Customer(String name, int creditScore) {
        setName(name);
        setCreditScore(creditScore);
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for credit score (with validation)
    public void setCreditScore(int creditScore) {
        if (creditScore < 300) {
            this.creditScore = 300;
        } else if (creditScore > 850) {
            this.creditScore = 850;   // optional but good practice
        } else {
            this.creditScore = creditScore;
        }
    }

    // Getter for credit score
    public int getCreditScore() {
        return creditScore;
    }

    // Method to determine credit rating
    public String getCreditRating() {
        if (creditScore >= 300 && creditScore <= 629) {
            return "Bad";
        } else if (creditScore <= 689) {
            return "Fair";
        } else if (creditScore <= 719) {
            return "Good";
        } else {
            return "Excellent";
        }
    }
}