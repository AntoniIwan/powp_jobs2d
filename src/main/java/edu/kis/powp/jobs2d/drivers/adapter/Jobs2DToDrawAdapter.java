package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

/**
 * driver adapter to drawer with several bugs.
 */
public class Jobs2DToDrawAdapter extends DrawPanelController implements Job2dDriver {
	private int startX = 0, startY = 0;
  private final DrawPanelController drawer;
	public Jobs2DToDrawAdapter(DrawPanelController drawPanelController) {
		super();
    drawer = drawPanelController;
  }

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

    //Added actual position after drawing line
    setPosition(x,y);
    drawer.drawLine(line);
	}

	@Override
	public String toString() {
		return "Straight line drawing";
	}
}
