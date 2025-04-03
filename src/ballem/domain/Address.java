package ballem.domain;

public class Address {
  private String street;
  private String number;
  private String complement;
  private String neighborhood;
  private String city;
  private String country;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getComplement() {
    return complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }

  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "{" +
            "\n\t\tlogradouro: " + street +
            "\n\t\tnumero: " + number +
            "\n\t\tcomplemento: " + complement +
            "\n\t\tbairro: " + neighborhood +
            "\n\t\tcidade: " + city +
            "\n\t\tpais: " + country +
            "\n\t}";
  }
}
