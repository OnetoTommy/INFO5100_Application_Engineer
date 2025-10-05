package edu.neu.mgen;

// design abstract class
abstract class animals{

  private double size;
  private double weight;
  private Boolean isVegetarian;

  public animals(double size, double weight, boolean isVegetarian){
    this.size = size;
    this.weight = weight;
    this.isVegetarian = isVegetarian;
  }

  public void describe(){
    System.out.println("Size: " + size + " inches");
    System.out.println("Weight: " + weight + " pounds");
    System.out.println("Predator: " + (isVegetarian ? "Yes" : "No"));
  }

}

class Bird extends animals{

  private boolean canFly;
  
  public Bird (double size, double weight, boolean isVegetarian, boolean canFly){
    super(size, weight, isVegetarian);
    this.canFly = canFly;
  }

  public void describe(){
    super.describe();
    System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
  }

}

class LandAnimal extends animals{

  private String habitat;

  public LandAnimal (double size, double weight, boolean isVegetarian, String habitat){
    super(size, weight, isVegetarian);
    this.habitat = habitat;
  }

  public void describe(){
    super.describe();
    System.out.println("Habitat: " + habitat);
  }

}

class Fish extends animals{

  private String waterType;

  public Fish (double size, double weight, boolean isVegetarian, String waterType){
    super(size, weight, isVegetarian);
    this.waterType = waterType;
  }

  public void describe(){
    super.describe();
    System.out.println("Water Type: " + waterType);
  }

}


public class Lab2{

  public static void main(String[] args) {
    
    Bird falconBird = new Bird(15, 3, false, true);
   
    Fish tunaFish = new Fish(1.5, 1000, false, "Freshwater");
   
    LandAnimal lioAnimal = new LandAnimal(10, 550, false, "Savannah");

    System.out.println("Bird:"); 
    falconBird.describe();
    System.out.println("\nFish:");
    tunaFish.describe();
    System.out.println("\nLand Animal:");
    lioAnimal.describe();
  }
  
}
