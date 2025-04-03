package medium.director;

import java.util.Arrays;

import medium.builder.Builder;
import medium.sandwich.SandwichType;

public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void createBigMac() {
    builder.reset();
    builder.setSandwichType(SandwichType.BigMac);
    builder.setBread("Pão com Gergelim");
    builder.addIngredients(Arrays.asList("Dois Hambúrgueres", "Alface", "Queijo", "Cebola", "Picles"));
    builder.addSauces(Arrays.asList("Molho Especial"));
  }

  public void createChedarMcMelt () {
    builder.setSandwichType(SandwichType.ChedarMcMelt);
    builder.setBread("Pão escuro com gergelim");
    builder.addIngredients(Arrays.asList());
    builder.addSauces(Arrays.asList("Molho Cheddar"));
  }
}
