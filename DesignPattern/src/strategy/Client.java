package strategy;

final class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping shop =new Shopping();
		shop.pay(new BkashPayment());
	}

}
