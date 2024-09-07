import java.util.Scanner;
//Customer Class for Functionalities
class Customer{
    int set_password;
    //Setting password for the customer
    void setPassword(int password){
        set_password = password;
    }
    //After setting password, checking the password
    boolean checkingPassword(int password){
        return set_password == password;
    }
    //All the Bank Facilities for the Customer
    void functionalities(Scanner obj){
        Bank bank_obj = new Bank();  
        while (true){
            System.out.print("""
                Enter your choice:--     
                1)DEPOSIT BALANCE
                2)SHOW BALANCE
                3)WITHDRAW BALANCE
                4)Exit

    """);
            int choice = obj.nextInt();
            if(choice == 1){
                bank_obj.deposit_balance(obj);
            }
            else if (choice ==2){
                bank_obj.show_balance();
            }
            else if (choice ==3){
                bank_obj.withdraw_balance(obj);
            }
            else if (choice == 4){
                System.out.println("Exiting from the bank!\nThankyou!");
                break;
            }
            else{
                System.out.println("Please enter Valid choice!");
            }
        }
    }
}