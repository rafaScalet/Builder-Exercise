package ballem.domain;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private String firstName;
  private String lastName;
  private int day;
  private int month;
  private int year;
  private Address address;
  private List<Phone> phones = new ArrayList<Phone>();

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

  @Override
  public String toString() {
    return "{" +
            "\n\tnome: " + firstName +
            "\n\tsobrenome: " + lastName +
            "\n\tdia: " + day +
            "\n\tmes: " + month +
            "\n\tano: " + year +
            "\n\tendereço: " + address +
            "\n\ttelefones: " + phones +
            "\n}";
  }
}
