class Account{
    String name;
    float balance;

    Account(String n, float b){
        name = n;
        balance = b;
    }

    void deposit(float amount){
        balance = balance + amount;
        System.out.println(amount + " " +"deposited. New Balance : " + balance);
    }

    void withdraw(float amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println(amount +  " " + "Withdraw. New Balance : " + balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Account acc = new Account("Aashish", 5000);
        acc.deposit((500));
        acc.withdraw(5000);
        acc.withdraw(600);
    }
}
