package chapter6;

public class Dog {

    // instance variables
    private String name = null;
    private double weight = 0;

    // Constructor
    public Dog(String newName, double newWeight) {
        setName(newName);
        setWeight(newWeight);
    }

    // Setter name
    public final void setName(String newName) {
        this.name = newName;
    }

    // Setter weight
    public final void setWeight(double newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("Weight cannot be negative or zero.");
        }
    }

    // Getter name
    public String getName() {
        return this.name;
    }

    // Getter weight
    public double getWeight() {
        return this.weight;
    }

    // Compare method
    public String compare(Dog dogCompare) {

        String message = null;

        if (dogCompare.weight > this.weight) {
            message = dogCompare.name + " weighs more than " + this.name;
        }
        else if (dogCompare.weight < this.weight) {
            message = this.name + " weighs more than " + dogCompare.name;
        }
        else {
            message = this.name + " weighs equal to " + dogCompare.name;
        }

        return message;
    }
}