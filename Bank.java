import java.util.Scanner;
public class Bank{
    private double customerBalance;                      //Private attribute of the Customer
    //Setter
    void setBalance(double balance){
        if(balance >=0){
            this.customerBalance = balance;
        }
        else{
            System.out.println("Balance can't be Negative!");
        }
    }
    //Getter
    double getBalance(){
        return this.customerBalance;
    }
    
    //Method for Depositing Customer Balance
    void deposit_balance(Scanner obj){ 
        System.out.println("Enter Balance to be Deposited:- ");
        double balance = obj.nextDouble();
        if(balance >=0){
            setBalance(getBalance()+balance);
            System.out.println("Balance deposited!");
        }
        else{
            System.out.println("Negative Balance can't be deposited!");
        }
    }
    //Method for Balance Enquiry
    void show_balance(){
        System.out.println("Your Balance is: "+" "+(getBalance())+ " "+ "Rupee!");
    }
    //Method for Withdrawing balance
    void withdraw_balance(Scanner obj){
        System.out.println("Enter amount to be Withdrawn:- ");
        double amount = obj.nextDouble();
        if(amount >=0){
            if(amount <= getBalance()){
                System.out.println(amount+" "+"Amount is withdrwan!");
                setBalance(getBalance()-amount);
            }
            else{
                System.out.println("Amount entered is more than your Balance!");
            }
        }
        else{
            System.out.println("Withdrawal amount can be negative!");
        }
    }
}