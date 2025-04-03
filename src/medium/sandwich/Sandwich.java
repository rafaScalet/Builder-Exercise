package medium.sandwich;

import java.util.List;

public class Sandwich {
  private SandwichType sandwichType;
  private String bread;
  private List<String> ingredients;
  private List<String> sauces;

  public SandwichType getSandwichType() {
    return sandwichType;
  }

  public void setSandwichType(SandwichType sandwichType) {
    this.sandwichType = sandwichType;
  }

  public String getBread() {
    return bread;
  }

  public void setBread(String bread) {
    this.bread = bread;
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  public List<String> getSauces() {
    return sauces;
  }

  public void setSauces(List<String> sauces) {
    this.sauces = sauces;
  }
}
