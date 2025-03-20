package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
  private final List<DriverCommand> commands = new ArrayList<DriverCommand>();

  public void addCommand(DriverCommand command){
    this.commands.add(command);
  }

  @Override
  public void execute() {
    for(DriverCommand command : commands){
      command.execute();
    }
  }
}
