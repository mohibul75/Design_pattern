package strategy;

public class Shopping {
	public void pay(IPayment payment) {
		System.out.print(payment.toString());
	}
}
