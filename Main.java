import java.util.Scanner;                                //Scanner class For Taking input
import java.lang.System;                                 //System class For Print statement
public class Main{    
//Main Method
    public static void main(String[]args){
        Customer customer_obj = new Customer();     
        Scanner obj= new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("Welcome to the Java Banking System!");
        System.out.println("**********************************");
        while(true){
            System.out.println("""
                                Sign in or Sign up:- 
                                1)Sign Up
                                2)Sign In
            
            """);
            int ch = obj.nextInt();
            if(ch == 1){
                System.out.println("Set your Password!(3-digits):- ");
                int setpassword = obj.nextInt();
                String setpasswordStr = Integer.toString(setpassword);
                if (setpasswordStr.length() ==3){
                    System.out.println("Password is set!");
                    customer_obj.setPassword(setpassword);
                    System.out.println("Now You can Sign In!");}
                else{
                    System.out.println("Password is Invalid!\nEnter Valid Password!");
                }
            }
            else if(ch ==2){
                if(customer_obj.set_password !=0){
                    System.out.println("Enter your password:- ");
                    int password = obj.nextInt();
                    if(customer_obj.checkingPassword(password)){
                        customer_obj.functionalities(obj);
                        break;
                    }
                    else{
                        System.out.println("Incorrect password!!");
                    }}
                else{
                    System.out.println("First SignUp!No account found!");
                }
            }
            else{
                System.out.println("Invalid Choice!");
            }}
            obj.close();
                        }
                    }