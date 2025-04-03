package ballem.builder;

import ballem.domain.Address;
import ballem.domain.Person;
import ballem.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class PersonBuilder {
  private Person person;
  private Address address;
  private List<Phone> phones;

  public PersonBuilder() {
    this.person = new Person();
    this.address = new Address();
    this.phones = new ArrayList<Phone>();
  }

  public static PersonBuilder builder() {
    return new PersonBuilder();
  }

  public PersonBuilder addName(String firstName, String lastName) {
    this.person.setFirstName(firstName);
    this.person.setLastName(lastName);
    return this;
  }

  public PersonBuilder addBirthDate(int day, int month, int year) {
    this.person.setDay(day);
    this.person.setMonth(month);
    this.person.setYear(year);
    return this;
  }

  public PersonBuilder addStreet(String street) {
    this.address.setStreet(street);
    return this;
  }

  public PersonBuilder addNumber(String number) {
    this.address.setNumber(number);
    return this;
  }

  public PersonBuilder addComplement(String complement) {
    this.address.setComplement(complement);
    return this;
  }

  public PersonBuilder addNeighborhood(String neighborhood) {
    this.address.setNeighborhood(neighborhood);
    return this;
  }

  public PersonBuilder addCity(String city) {
    this.address.setCity(city);
    return this;
  }

  public PersonBuilder addCountry(String country) {
    this.address.setCountry(country);
    return this;
  }

  public PersonBuilder addPhone(int areaCode, int number, Phone.PhoneType phoneType) {
    this.phones.add(new Phone(areaCode, number, phoneType));
    return this;
  }

  public Person get() {
    this.person.setAddress(this.address);
    this.person.setPhones(this.phones);
    return this.person;
  }
}
