public class CreditCardInterest {
    public static void main(String[] args) {
        System.out.println("What is the credit card balance?");
        double creditCardBalance = 0;
        double interestRate = 0.17;
        double interestOneMonth = creditCardBalance * interestRate;
        double interestTwoMonths = (creditCardBalance + interestOneMonth) * interestRate;
        System.out.println("Interest due after one month is: " + interestOneMonth );
        System.out.println("Interest due after two months is: " + interestTwoMonths );
    }
}