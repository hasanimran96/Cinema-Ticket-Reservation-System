/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketreservationsystem;

import java.util.Scanner;

/**
 *
 * @author hasan
 */
public class Customer {

    Scanner scanner = new Scanner(System.in);

    private String Name;
    private String PhoneNumber;

    //Customer Constructor
    Customer(String name, String num) {
        this.Name = name;
        this.PhoneNumber = num;

    }

    Customer() {
    }

    public void RegisterCustomer()  {
        try
        {
        System.out.println("Enter customer name");
        
        String name = scanner.nextLine();
        
        if(this.isAlpha(name) == true)
        {
        
        SetName(name);
        }
        else
        {
            throw new InvalidNameException("The Name contains numeric values please input again");
        }
        System.out.println("Enter customer phone number");
    
        String num = scanner.nextLine();
        
       if(this.isNumeric(num)==true)
       {
        SetNumber(num);
       }
       else
       {
           throw new InvalidPhoneNumberException("The phone number should be numeric");
       }
    
        }
        catch(InvalidPhoneNumberException e)
                {
                    RegisterCustomer();
                }
        catch(InvalidNameException e)
        {
            RegisterCustomer();
        }
        
    }

    public void SetName(String name) {
        this.Name = name;

    }

    public String GetName() {

        return this.Name;
    }

    public void SetNumber(String num) {
        this.PhoneNumber = num;

    }

    public String GetNumber() {

        return this.PhoneNumber;

    }
    
    public boolean isNumeric(String s) {  
    return s.matches("[-+]?\\d*\\.?\\d+");  
}
    public boolean isAlpha(String name) {
    return name.matches("[a-zA-Z]+");
}
    
    

}
