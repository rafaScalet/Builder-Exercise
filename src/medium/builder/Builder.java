package medium.builder;

import java.util.List;

import medium.sandwich.Sandwich;
import medium.sandwich.SandwichType;

public interface Builder {
  public void reset();
  public void addSauces(List<String> sauces);
  public void addIngredients(List<String> ingredients);
  public void setBread(String bread);
  public void setSandwichType(SandwichType sandwichType);
  Sandwich getSandwich();
}
