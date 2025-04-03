package ballem.domain;

public class Phone {
  private int ddd;
  private int number;
  private PhoneType type;

  public int getDdd() {
    return ddd;
  }

  public void setDdd(int ddd) {
    this.ddd = ddd;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public PhoneType getType() {
    return type;
  }

  public void setType(PhoneType type) {
    this.type = type;
  }

  public Phone(int ddd, int number, PhoneType type) {
    this.ddd = ddd;
    this.number = number;
    this.type = type;
  }

  public enum PhoneType {
    RESIDENCIAL, CELULAR, COMERCIAL
  }

  @Override
  public String toString() {
    return "\n\t\t{" +
            " DDD=" + ddd +
            " número=" + number +
            " tipo=" + type +
            " }";
  }
}
