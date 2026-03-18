class CurrentAccount extends BankAccount{
    int overdraftLimit;
    CurrentAccount(String name, int balance, int overdraftLimit){
        super(name,balance);
        this.overdraftLimit=overdraftLimit;
    }
     @Override
    void withdraw(int amount) throws Exception{
       
        if(amount > getbalance() + overdraftLimit){
            throw new Exception("Exceeds overdraft limit");
        } else{
           else {
    setBalance(getbalance() - amount);
    System.out.println("Withdrawn: " + amount + ". New balance: " + getbalance() + " (includes overdraft)");
        }
    }
}