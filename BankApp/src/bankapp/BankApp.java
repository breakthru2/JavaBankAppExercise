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
public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank person1 = new Bank();
        person1.fullName = "Daniel Chidera";
        person1.address = "Emene Enugu";
        person1.bvn = 123456;
        person1.dateOfBirth = "1 January 1999";
        person1.email = "daniel@gmail.com";
        person1.balance = 10000;
        
        person1.withdraw(9000);
    }
    
}
