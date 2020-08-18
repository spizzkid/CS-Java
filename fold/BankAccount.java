/**
 * Modify user's bank account information including ID, balance and Name
 * @author Jiacheng Jiang
 * @version 2020/8/17
 */
public class BankAccount {

    private int ID;
    private String Name;
    private double balance;

    // default constructor

    /**
     * This method sets ID and balance to 0 and set Name to "unknown", as default parameter
     *
     */
    public BankAccount () {

        ID = 0;
        balance = 0;
        Name = "unknown";
    }
    // full constructor

    /**
     * This method set ID, balance and Name from the corresponding input
     * @param ID This is ID number for user
     * @param balance This is balance in user bank account
     * @param Name This is user's bank account name
     */
    public BankAccount(int ID, double balance,String Name) {
        this.ID = ID;
        this.balance = balance;
        this.Name = Name;
    }

    // method for get name

    /**
     * Get user bank account name and return it as string
     * @return Name user bank account name
     */
    public String getName() {
        return Name;
    }
    // method for get balance

    /**
     * Get user bank account balance and return it as double
     * @return balance user bank account balance
     */
    public double getBalance() {
        return balance;
    }
    // method for get ID
    /**
     * Get user bank account ID and return it as int
     * @return ID user bank account ID
     */
    public int getID() {
        return ID;
    }

    /**
     * Set user's bank account name from input name
     * @param name user bank account name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Change the balance of user bank account
     * @param x amount of money that balance has changed
     */
    public void changeBalance(double x) {
        balance = balance + x;
        if(balance < 0)
            balance = 0;
    }

    /**
     * Print out name, id and name of a user's bank account information
     * @return Name+"["+ ID + "]=$" + balance user's name, id and balance combined in one line
     */
    public String toString() {
        return Name+"["+ ID + "]=$" + balance;
    }
}
