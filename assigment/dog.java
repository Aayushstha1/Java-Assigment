public class dog {
    private String name;
    private String breed;

    // Constructor
    public dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        // Create two instances of Dog
        dog dog1 = new dog("Buddy", "Labrador");
      
        dog dog2 = new dog("Max", "German Shepherd");

        // Print initial values
        System.out.println("Initial Values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // Modify attributes using setter methods
        dog1.setName("Charlie");
        dog2.setBreed("Golden Retriever");

        // Print updated values
        System.out.println("\nUpdated Values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}