public class DebitAccount extends Account {
    DebitAccount(String _accountType, double _balance){
        // super(_accountType, _balance); // b/c the now this is the original constructor

        this.accountType = _accountType;
        this.balance = _balance;
    }

    @Override
    public boolean withdraw(double _amount) {
        if(_amount >= 0 && _amount <= this.balance){
            this.balance = this.balance - _amount;
        }
        else{
            System.out.println("Incorrect Amount or not enough balance");
            return false;
        }
        return true;
    }

    @Override
    public boolean deposit(double _amount) {
        if(_amount >= 0) {
            this.balance = this.balance + _amount;
        }
        else {
            System.out.println("Incorrect Amount");
            return false;
        }
        return true;
    }
}
