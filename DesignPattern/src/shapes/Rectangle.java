package shapes;

import java.util.ArrayList;

import CompositeShape.CompositeShape;
import ishapes.*;
import simpleShape.Line;

public class Rectangle extends CompositeShape {
	

	@Override
	public void build() {
		// TODO Auto-generated method stub
		
		list.add(new Line());
		list.add(new Line());
		list.add(new Line());
		list.add(new Line());
		
	}

}
