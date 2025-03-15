package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Jobs2DDriverToAbstractDriverAdapter extends AbstractDriver {

  private final Job2dDriver currentDriver;

  public Jobs2DDriverToAbstractDriverAdapter(Job2dDriver driver) {
    super(0, 0);
    this.currentDriver = driver;
  }

  @Override
  public void operateTo(int x, int y) {
    currentDriver.setPosition(getX(),getY());
    currentDriver.operateTo(x,y);
    setPosition(x,y);
    }

}
