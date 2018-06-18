/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketreservationsystem;

/**
 *
 * @author Batra
 */
public class InvalidNameException extends Exception {

    public InvalidNameException()
    {
        
    }
    
    public InvalidNameException(String message)
    {
        System.out.println(message);
    }
    
    
    
}
