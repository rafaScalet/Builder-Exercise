package ballem;

import ballem.builder.PersonBuilder;
import ballem.domain.Person;
import ballem.domain.Phone;

public class Main {
  public static void main(String[] args) {
    Person person = PersonBuilder.builder()
            .addName("Alice", "dos Santos")
            .addBirthDate(22, 5, 1980)
            .addStreet("Rua das Oliveiras")
            .addNumber("272")
            .addComplement("Bloco B")
            .addNeighborhood("Centro")
            .addCity("Porto Alegre")
            .addCountry("Brasil")
            .addPhone(51, 32221236, Phone.PhoneType.RESIDENCIAL)
            .addPhone(51, 99623632, Phone.PhoneType.CELULAR)
            .get();

    System.out.println(person.toString());

    PersonBuilder personBuilder = new PersonBuilder()
            .addName("Alice", "dos Santos")
            .addBirthDate(22, 5, 1980)
            .addStreet("Rua das Oliveiras")
            .addNumber("272")
            .addComplement("Bloco B")
            .addNeighborhood("Centro")
            .addCity("Porto Alegre")
            .addCountry("Brasil")
            .addPhone(51, 32221236, Phone.PhoneType.RESIDENCIAL)
            .addPhone(51, 99623632, Phone.PhoneType.CELULAR);

    person = personBuilder.get();

    System.out.println(person.toString());
  }
}
