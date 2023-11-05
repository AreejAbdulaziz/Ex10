import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Account {
private String id;
private String name;
private int balance=0;


    public Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int debit(int amount){
        if (amount<=balance){
            balance=balance-amount;

            return balance; }
        else {
            System.out.println("the balance is insufficient");
            return balance; }
    }
    public int credit(int amount){
        balance=balance+amount;
       return balance;
    }
    public int transferTo(Account a2,int amount){
        if (amount<=balance){
            balance=balance-amount;
            a2.credit(amount);
             }
        else {
            System.out.println("the balance is insufficient");
             }
        return balance;

    }
    public void display(){
            System.out.println("Account [ID: " + id + ", Name: " + name + ", Balance: " + balance + "]");
    }
}
