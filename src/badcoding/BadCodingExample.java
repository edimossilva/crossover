package badcoding;

public class BadCodingExample {
	public static void main(String[] args) {
		Payment payment = new Payment(100.f, "smartphone");
		payment.pay("cash");
		payment.pay("credit");
		payment.pay("debit");
//		payment.pay("other");

	}
}
