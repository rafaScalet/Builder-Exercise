package geeks;

public class ComputerBuilder implements Builder {
  private Computer computer = new Computer();

  @Override
  public void buildCPU(String cpu) {
    computer.setCpu(cpu);
  }

  @Override
  public void buildRAM(String ram) {
    computer.setRam(ram);
  }

  @Override
  public void buildStorage(String storage) {
    computer.setStorage(storage);
  }

  @Override
  public Computer getComputer() {
    return computer;
  }
}
