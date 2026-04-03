package class2;

public class ClassElementEx2 {
    public static void main(String[] args) {
        Account ac = new Account();

        ac.deposit(10000);
        ac.withdraw(9000);

        ac.withdraw(2000);
        System.out.println("잔고: " + ac.getBalance());
    }
}

class Account {
    private int balance;
    public  Account() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public  void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("`잔액부족`");
        } else {
            balance -= amount;
        }
    }
}
