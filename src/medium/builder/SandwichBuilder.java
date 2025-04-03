package medium.builder;

import java.util.ArrayList;
import java.util.List;

import medium.sandwich.Sandwich;
import medium.sandwich.SandwichType;

public class SandwichBuilder implements Builder {
  private Sandwich sandwich = new Sandwich();

  @Override
  public void reset() {
    sandwich = new Sandwich();
  }

  @Override
  public void addSauces(List<String> sauces) {
    sandwich.setSauces(new ArrayList<String>());
    sandwich.setSauces(sauces);
  }

  @Override
  public void addIngredients(List<String> ingredients) {
    sandwich.setIngredients(new ArrayList<String>());
    sandwich.setIngredients(ingredients);
  }

  @Override
  public void setBread(String bread) {
    sandwich.setBread(bread);
  }

  @Override
  public void setSandwichType(SandwichType sandwichType) {
    sandwich.setSandwichType(sandwichType);
  }

  @Override
  public Sandwich getSandwich() {
    return sandwich;
  }
}
