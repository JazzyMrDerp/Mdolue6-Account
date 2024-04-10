// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account actD = new DebitAccount("Debit", 500);
        actD.deposit(50);
        System.out.println(actD.toString());
        actD.withdraw(600);
        System.out.println(actD.toString());

        System.out.println();

        Account actC = new CreditAccount("Credit", 1500);
        actC.withdraw(200);
        System.out.println(actC.toString());
        actC.withdraw(2000);
        System.out.println(actC.toString());


        Account actL = new LoanAccount("Loan", 3000, .3);
        actL.deposit(300);
        System.out.println(actL.toString());
        actL.withdraw(400);
        System.out.println(actL.toString());
        actL.calculateInterest();
        System.out.println(actL.toString());

    }
}