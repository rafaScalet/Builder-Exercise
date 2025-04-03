package refactor;

import refactor.builders.CarBuilder;
import refactor.builders.CarManualBuilder;
import refactor.cars.Car;
import refactor.cars.Manual;
import refactor.directors.Director;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();

    CarBuilder builder = new CarBuilder();
    director.constructSportsCar(builder);

    Car car = builder.getResult();
    System.out.println("Car built:\n" + car.getCarType());

    CarManualBuilder manualBuilder = new CarManualBuilder();

    director.constructSportsCar(manualBuilder);
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());
  }
}
