public class CreditCardInterest {
    public static void main(String[] args) {
        double creditCardBalance = 5000;
        double interestRate = 0.17;
        double interestOneMonth = creditCardBalance * (interestRate + 1);
        double interestTwoMonths = interestOneMonth * (interestRate + 1);
        System.out.println("Interest due after one month is: " + interestOneMonth );
        System.out.println("Interest due after two months is: " + interestTwoMonths );
    }
}