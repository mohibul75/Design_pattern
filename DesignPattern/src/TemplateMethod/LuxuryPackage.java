package TemplateMethod;

public class LuxuryPackage extends TourPackage {

	@Override
	public void jabo() {
		// TODO Auto-generated method stub
		System.out.println("LuxuryPackage jabo");
	}

	@Override
	public void gurbo() {
		// TODO Auto-generated method stub
		System.out.println("LuxuryPackage gurbo");
	}

	@Override
	public void firbo() {
		// TODO Auto-generated method stub
		System.out.println("LuxuryPackage firbo");
		bbq();
	}
	
	public void bbq() {
		System.out.println("bbq");
	}
}
