package oops;

public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account();
        a1.initialize("Michaela",333, 1600);

        a1.withdraw(100);

        a1.deposit(300);

        Account a2 = new Account();
        a2.initialize("Peter",111,1000);

        String msg = a1.transfer(a2, 500);
        System.out.println(msg);
    

	}

}
