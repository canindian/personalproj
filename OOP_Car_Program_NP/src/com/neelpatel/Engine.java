package com.neelpatel;

import java.util.Date;

public interface Engine {
  void setEngineCylinders(int engineCylinders);

  void setEngineManufacturedDate(Date date);

  void setEngineManufacturer(String manufacturer);

  void setEngineMake(String engineMake);

  void setDriveTrain(String driveTrain);

  void setEngineType(String fuel);
}
