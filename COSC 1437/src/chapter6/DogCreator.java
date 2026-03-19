package chapter6;

public class DogCreator {

    public static void main(String[] args) {

        Dog texie = new Dog("Texie", 25.0);
        Dog juicy = new Dog("Juicy", 15.0);
        Dog penny = new Dog("Penny", 28.0);

        // Print dog info
        System.out.println("Name: " + texie.getName());
        System.out.println("Weight: " + texie.getWeight() + "lbs.\n");

        System.out.println("Name: " + juicy.getName());
        System.out.println("Weight: " + juicy.getWeight() + "lbs.\n");

        System.out.println("Name: " + penny.getName());
        System.out.println("Weight: " + penny.getWeight() + "lbs.\n");

        // Compare dogs
        System.out.println(texie.compare(juicy));
        System.out.println(penny.compare(texie));
        System.out.println(penny.compare(juicy));

        System.out.println();

        // 🔥 STEP 20 – Texie gains weight
        texie.setWeight(28.0);

        // Print updated Texie info
        System.out.println("Name: " + texie.getName());
        System.out.println("Weight: " + texie.getWeight() + "lbs.");

        // Compare again
        System.out.println(texie.compare(penny));
    }
}
