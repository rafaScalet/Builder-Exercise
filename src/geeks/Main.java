package geeks;

public class Main {
  public static void main(String[] args) {
    ComputerBuilder builder = new ComputerBuilder();

    Director director = new Director();

    director.construct(builder);

    Computer computer = builder.getComputer();

    computer.displayInfo();
  }
}
