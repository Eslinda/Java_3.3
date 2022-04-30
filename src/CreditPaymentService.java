public class CreditPaymentService {

    public int calculate (int sum, float percent, int term ) {

        float percentMonth = percent / (100*12);

        int payment = (int) (sum * (percentMonth / (1 - (1 / Math.pow((1 + percentMonth), term)))));

        return (int) payment;
    }

}
