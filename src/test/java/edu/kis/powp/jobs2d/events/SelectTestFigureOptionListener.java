package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.factiories.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.Jobs2DDriverToAbstractDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.jobs2d.TestJobs2dPatterns;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
      case TestJobs2dPatterns.FIGURE_JOE_1:
        FiguresJoe.figureScript1(driverManager.getCurrentDriver());
        break;
      case TestJobs2dPatterns.FIGURE_JOE_2:
          FiguresJoe.figureScript2(driverManager.getCurrentDriver());
          break;
      case TestJobs2dPatterns.FIGURE_JANE:
            Jobs2DDriverToAbstractDriverAdapter temp = new Jobs2DDriverToAbstractDriverAdapter(driverManager.getCurrentDriver());
            FiguresJane.figureScript(temp);
      case TestJobs2dPatterns.RECTANGLE:
        FigureFactory rectangleFigure = new FigureFactory(0, 0, driverManager);
            ComplexCommand commandFromFactory = rectangleFigure.generateRectangleCommand(150,120);
            commandFromFactory.execute();
          break;
      case TestJobs2dPatterns.TRIANGLE:
        FigureFactory shape = new FigureFactory(0,0,driverManager);
        ComplexCommand command = shape.generateTriangleCommand(150);
        command.execute();
        break;
        default:
          break;
    }
	}
}
