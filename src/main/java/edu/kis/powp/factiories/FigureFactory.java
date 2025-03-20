package edu.kis.powp.factiories;
import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class FigureFactory {
  private DriverManager driverManager;
  private int x;
  private int y;
  private FigureFactory(int x, int y, DriverManager driverManager) {
    this.x = x;
    this.y = y;
    this.driverManager = driverManager;
  }

}
