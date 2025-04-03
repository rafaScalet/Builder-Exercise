package refactor.builders;

import refactor.cars.CarType;
import refactor.components.Engine;
import refactor.components.GPSNavigator;
import refactor.components.Transmission;
import refactor.components.TripComputer;

public interface Builder {
  void setCarType(CarType type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setTransmission(Transmission transmission);
  void setTripComputer(TripComputer tripComputer);
  void setGPSNavigator(GPSNavigator gpsNavigator);
}
