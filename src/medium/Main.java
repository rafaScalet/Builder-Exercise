package medium;

import medium.builder.SandwichBuilder;
import medium.director.Director;
import medium.sandwich.Sandwich;

public class Main {
  public static void main(String[] args) {
    SandwichBuilder builder = new SandwichBuilder();

    Director director = new Director(builder);

    director.createBigMac();

    Sandwich sandwich = builder.getSandwich();

    System.out.println("Saiu um " + sandwich.getSandwichType().toString());

    director.createChedarMcMelt();

    sandwich = builder.getSandwich();
    
    System.out.println("Saiu um " + sandwich.getSandwichType().toString());
  }
}
