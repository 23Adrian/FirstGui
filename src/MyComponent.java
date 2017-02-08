import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	static int counter = 0;
	
	public void paintComponent(Graphics g) {
		car car1 = new car(0,0);
		car car2 = new car(0,50);
		
		car1.draw(g);
		car2.draw(g);

		System.out.println("Painted" + counter++ + "times");
	}

}
