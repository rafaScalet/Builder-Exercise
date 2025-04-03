package geeks;

public interface Builder {
  public void buildCPU(String cpu);
  public void buildRAM(String ram);
  public void buildStorage(String storage);
  public Computer getComputer();
}
