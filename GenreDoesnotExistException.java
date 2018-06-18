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
public class GenreDoesnotExistException extends Exception {

    public GenreDoesnotExistException()
    {
        
    }
    
  public GenreDoesnotExistException(String message)
  {
      System.out.println(message);
  }
    
}
