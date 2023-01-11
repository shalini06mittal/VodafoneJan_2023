package oops;
/**
 * 
 * @author Shalini
 * have foll data members
 * 1. name
 * 2. accid
 * 3. balance
 * 
 * have foll methods
 * 1. initilaize => take input for name, accid and balance
 * initial balance cannot be 0, it has to be min 1000/-
 * 
 * 2. withdraw => take input the amount to  be withdrawn
 * do not allow negative balance
 * check if amount is less than the balance only then deduct 
 * else display cannot withdraw and also min balance should be 1000
 * 3. deposit => take amount to deposit as input and update the balance
 */
public class Account {

	private String name;
    private int accID;
    private int balance;

    public void initialize(String nm, int id, int bal){
        name = nm;
        accID = id;
        if(bal >= 1000)
            balance = bal;
        else
            System.out.println("Balance is too low.");
    }
    public void withdraw(int amount){
        if(balance-amount < 1000)
            System.out.println("You cannot withdraw.");
        else
            balance = balance-amount;
    }
    public void deposit(int amount){
        balance += amount;
    }
    
    // transfer => takes 2 parameters 1 of type Account and other of type int
    // transfer money from acc1 to acc2  but making sure that  acc1 balance is 
    // maintained
    public String transfer(Account accountTo, int amount){
        if(balance-amount < 1000)
            return "Cannot be transferred.";
        else{
            balance -= amount;
            accountTo.balance += amount;
            return "The transfer has been executed.";
        }
    }
}
