/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author Breakthru
 */
public class Bank {
    String email;
    String address;
    String fullName;
    String phoneNumber;
    String dateOfBirth;
    int bvn;
    double balance;
    
    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.printf("You deposited %.2f and your current account balance is %.2f%n",depositAmount, balance);
    }
    public void withdraw(double withdrawAmount){
        if (balance > 0.0) {
            if (withdrawAmount <= balance) {
                balance -= withdrawAmount;
                System.out.printf("You withdrew %.2f and your current account balance is %.2f%n",withdrawAmount, balance);
            }else{
                System.out.printf("Your balance is %.2f therefore you have to withdraw less than %.2f%n",balance,withdrawAmount);
            }
        }else{
            System.out.printf("Insufficient Funds! Please Deposit!!");
        }
    }
}
