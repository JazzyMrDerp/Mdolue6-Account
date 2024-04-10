public class CreditAccount extends Account {
    private double limit;
    CreditAccount(String _accountType, double _limit){
        this.accountType = _accountType;
        this.balance = 0;
        this.limit = _limit;
    }

    public void setLimit(double limit) {
        limit = limit;
    }

    @Override
    public boolean deposit(double _amount) {
        if(this.balance <= 0){
            this.balance = 0;
            System.out.println("Sorry! No balance to pay");
            return false;
        }
        else if (this.balance < _amount){
            System.out.println("The balance is less than the amount you are trying to pay");
            System.out.println(this.toString());
        }
        else{
            this.balance = this.balance;
        }
        return true;
    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public boolean withdraw(double _amount) {
        if((this.limit- this.balance) >= _amount){
            this.balance = this.balance + _amount;
        }
        else{
            System.out.println("The amount is greater than the remaining balance");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String content = "Remaining fund: " + (this.limit - this.balance) + "\r\n";
        content += super.toString();
        return content;
    }
}

