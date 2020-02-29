package CompositeShape;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ishapes.*;

public abstract class CompositeShape implements IShape {
	
	 protected List<IShape> list=new  ArrayList<IShape>();

	@Override
	public void draw() {
		build();
		
		// TODO Auto-generated method stub
		
		for(IShape s: list) {
			
			s.draw();
		}
		
	}

	@Override
	public abstract void build() ;

}
