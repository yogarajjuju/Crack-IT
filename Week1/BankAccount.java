class BankAccount{
    private String name;
   private  int balance;
   BankAccount(String name , int balance){
    this.name =name;
    this.balance=balance;
   }
   int getbalance(){
        return balance;
    }
    void setBalance(int balance){
    this.balance = balance;
}
    
    void checkbalance(){
        System.out.println("Balance "+balance);
    }
    void deposit(int amount){
        balance+=amount;
       
        System.out.println("The new balance " + balance);
    }

    void withdraw (int amount)throws Exception{
        if(amount>balance){
            throw new Exception("Insufficent balance in your account");
        } else{
            balance-=amount;
            System.out.println("The new avaiable balance is "+ balance);
        }
    }
   public static void main(String args[]){
    BankAccount account = new BankAccount("juju", 500);
    account.checkbalance();
    account.deposit(2000);
    
    SavingsAccount sa = new SavingsAccount("Yogaraj", 5000);
    sa.addInterest(10);
    
    CurrentAccount ca = new CurrentAccount("Yogaraj", 1000, 500);
    
    try {
        ca.withdraw(1400);
    } catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
    
    try {
        ca.withdraw(1600);
    } catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }

    try{
        account.withdraw(10000);
    } catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
    
    account.checkbalance();
}
}