public class LoanAccount extends Account {
    private double interestRate;

    LoanAccount(String _accountType, double _balance, double _interestRate) {
        this.accountType = _accountType;
        this.balance = _balance;
        this.interestRate = _interestRate;
    }

    @Override
    public boolean withdraw(double _amount) {
        if (_amount >= 0 && _amount <= this.balance) {
            this.balance = this.balance - _amount;
        } else {
            System.out.println("Incorrect Amount or not enough balance");
            return false;
        }
        return true;
    }

    @Override
    public boolean deposit(double _amount) {
        if (_amount >= 0) {
            this.balance = this.balance + _amount;
        } else {
            System.out.println("Incorrect Amount");
            return false;
        }
        return true;
    }

    public void calculateInterest() {
        this.balance += this.balance * this.interestRate;
    }
}