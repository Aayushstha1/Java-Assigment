public class AddDistance {
   
        // Member variables
        int feet;
        int inches;
    
        // Constructor
        public AddDistance(int feet, int inches) {
            this.feet = feet;
            this.inches = inches;
        }
    
        // Method to add distances
        public AddDistance add(AddDistance d) {
            int totalInches = (this.feet * 12 + this.inches) + (d.feet * 12 + d.inches);
            int newFeet = totalInches / 12;
            int newInches = totalInches % 12;
            return new AddDistance(newFeet, newInches);
        }
    
        public static void main(String[] args) {
            // Creating two distances
            AddDistance distance1 = new AddDistance(3, 6);
            AddDistance distance2 = new AddDistance(2, 9);
    
            // Adding distances
            AddDistance totalDistance = distance1.add(distance2);
    
            // Displaying the result
            System.out.println("Total Distance: " + totalDistance.feet + " feet " + totalDistance.inches + " inches");
        }
    }
    

