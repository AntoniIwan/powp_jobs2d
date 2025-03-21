package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class LineDrawerAdapter implements Job2dDriver {
  private final DrawPanelController drawer;
  private final ILine line;
  private int startX = 0, startY = 0;


  public LineDrawerAdapter(DrawPanelController drawPanelController, ILine line) {
    super();
    this.line = line;
    drawer = drawPanelController;
  }

  @Override
  public void setPosition(int x, int y) {
    this.startX = x;
    this.startY = y;
  }

  @Override
  public void operateTo(int x, int y) {
    line.setStartCoordinates(this.startX, this.startY);
    line.setEndCoordinates(x, y);

    setPosition(x,y);
    drawer.drawLine(line);
  }

  @Override
  public String toString() {
    return "Dotted line drawing";
  }
}

