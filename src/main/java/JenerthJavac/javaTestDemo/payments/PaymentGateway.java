package JenerthJavac.javaTestDemo.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);

}
