package test;

import TemplateMethod.*;

public class Client {
	
	public static void main(String [] args) {
		TourPackage tourpackage1 = new LuxuryPackage();
		tourpackage1.hire();
		
		((LuxuryPackage) tourpackage1).bbq();
	}


}
