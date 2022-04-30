public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int sum = 1_000_000;  //сумма кредита
        float percent = (float) 9.99;  //процентная ставка
        int term = 12; //срок кредита

        int payment = service.calculate(sum, percent, term);
        System.out.println(payment);

        term = 24;
        int payment1 = service.calculate(sum, percent, term);
        System.out.println(payment1);

        term = 36;
        int payment2 = service.calculate(sum, percent, term);
        System.out.println(payment2);


    }

}
