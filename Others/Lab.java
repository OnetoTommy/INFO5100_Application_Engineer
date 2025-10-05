package edu.neu.mgen;

// Create abstact class
class Animals {

  protected float size;
  protected float weight;
  protected Boolean isPredator;

  // Constructor
  public Animals(float size, float weight, boolean isPredator) {
    this.size = size;
    this.weight = weight;
    this.isPredator = isPredator;
  }

  public void describe() {
    System.out.println("The Size of Animal is " + size + " inches");
    System.out.println("The Weight of Animal is " + weight + " pounds");
    System.out.println("The Predator is " + (isPredator ? "Yes" : "No"));
  }

}

class Bird extends Animals {

  private String speciesName;

  // Constructor
  public Bird(float size, float weight, boolean isPredator, String speciesName) {
    super(size, weight, isPredator);
    this.speciesName = speciesName;
  }

  public void describe() {
    super.describe();
    System.out.println("Species Name: " + speciesName);
  }

}

class LandAnimal extends Animals {

  private int numberOfLegs;

  // Constructor
  public LandAnimal(float size, float weight, boolean isPredator, int numberOfLegs) {
    super(size, weight, isPredator);
    this.numberOfLegs = numberOfLegs;
  }

  public void describe() {
    super.describe();
    System.out.println("Number of Legs: " + numberOfLegs);
  }

}

class Fish extends Animals {

  private int numberOfFins;

  public Fish(float size, float weight, boolean isPredator, int numberOfFins) {
    super(size, weight, isPredator);
    this.numberOfFins = numberOfFins;
  }

  public void describe() {
    super.describe();
    System.out.println("Number of Fins: " + numberOfFins);
  }

}

// Main Class
public class Lab {

  public static void main(String[] args) {
    // Create a Bird instance
    Bird eagle = new Bird(5, 10, true, "Eagle");
    // Create a LandAnimal instance
    LandAnimal lion = new LandAnimal(10, 550, true, 4);
    // Create a Fish instance
    Fish goldfish = new Fish(2, 1, true, 4);

    // Describe the animals
    System.out.println("Bird information:");
    eagle.describe();
    System.out.println("\nLand Animal information:");
    lion.describe();
    System.out.println("\nFish  information:");
    goldfish.describe();
  }

}
