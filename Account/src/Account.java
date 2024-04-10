public  abstract class Account {
    protected String accountType;
    protected double balance;

    /*
    cannot have constructor when class is abstract
    Account(String _accountType, double _balance){
        this.accountType = _accountType;
        this.balance = _balance;
    }
    */

    public abstract boolean withdraw(double amount);

    public abstract boolean deposit(double amount);
    public abstract void calculateInterest();

    @Override
    public String toString() {
        String content = "";
        content = content + "This account type is : " + this.accountType +"\r\n";
        content = content + "The account balance is : " + this.balance;
        return content;
    }
}
