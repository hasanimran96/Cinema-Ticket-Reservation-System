/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketreservationsystem;

/**
 *
 * @author hasan
 */
public class MovieDoesNotExistException extends Exception {

    public MovieDoesNotExistException()
    {
        
    }
    
  public MovieDoesNotExistException(String message)
  {
      System.out.println(message);
  }
}
