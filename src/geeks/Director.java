package geeks;

public class Director {
  public void construct(Builder builder) {
    builder.buildCPU("Gaming CPU");
    builder.buildRAM("32GB DDR5");
    builder.buildStorage("512GB SSD");
  }
}
