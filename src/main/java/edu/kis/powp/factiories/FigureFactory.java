package edu.kis.powp.factiories;
import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.Job2dDriver;

import edu.kis.powp.jobs2d.drivers.adapter.Jobs2DDriverToAbstractDriverAdapter;

public class FigureFactory {
  private  DriverManager driverManager;
  private  int x;
  private int y;
  public FigureFactory(int x, int y, DriverManager driverManager) {
    this.x = x;
    this.y = y;
    this.driverManager = driverManager;
  }

  public ComplexCommand generateRectangleCommand(int width, int height){
    ComplexCommand command = new ComplexCommand();
    Job2dDriver main_driver = driverManager.getCurrentDriver();
    command.addCommand(new SetPositionCommand(x,y,main_driver));
    command.addCommand(new OperateToCommand(x+width,y,main_driver));
    command.addCommand(new OperateToCommand(x+width,y+height,main_driver));
    command.addCommand(new OperateToCommand(x,y+height,main_driver));
    command.addCommand(new OperateToCommand(x,y,main_driver));
    return command;
  }

  public ComplexCommand generateTriangleCommand(int radius){
    ComplexCommand command = new ComplexCommand();
    Job2dDriver main_driver = driverManager.getCurrentDriver();
    command.addCommand(new SetPositionCommand(x,y,main_driver));
    command.addCommand(new OperateToCommand(x+radius,y,main_driver));
    command.addCommand(new OperateToCommand(x,y+radius,main_driver));
    command.addCommand(new OperateToCommand(x,y,main_driver));
    return command;
  }

}
