public class ToDoList {
    private String firstName;
    private String lastName;
    private int balance;

    public ToDoList(String firstName, String lastName, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
    public void deposit(int amount){
       balance  += amount;

    }
    public int getBalance(){
        return balance;

    }
}
