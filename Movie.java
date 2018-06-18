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
public class Movie {

    private TicketBill Bill;

    private Tickets ticket;
    private MovieGenre genre;
    private MovieLanguage language;
    private MovieReview review;
    private MovieRating rating;
    protected String MovieName;
    protected String MovieTime;
    private int Movieprice;

    Scanner scanner = new Scanner(System.in);

    public Movie(String mname, String mtime, int price,
            String g, String l, String re,
            double rt, int tnum, int snum) {

        this.MovieName = mname;
        this.MovieTime = mtime;
        this.genre = new MovieGenre(g);
        this.review = new MovieReview(re);
        this.language = new MovieLanguage(l);
        this.rating = new MovieRating(rt);
        this.ticket = new Tickets(tnum, snum);
        this.Movieprice = price;
    }

    public void BookTickets() {
        
        try
        {
        System.out.println("Number of tickets available:");
        System.out.println(ticket.GetTickets());
        System.out.println("Enter the number of tickets you want to book");
        int tickets = scanner.nextInt();
        scanner.nextLine();
        if (ticket.deductTickets(tickets) == true) {
            Bill = new TicketBill();
            Bill.ComputeBill(tickets);
        }
        
        else if(ticket.deductTickets(tickets)== false && tickets > 5)
        {
            throw new TicketPurchaseLimitException("You cannot purchase more than 5 tickets");
        }
        
        else {
            
            throw new TicketNotAvailableException("There are no tickets available for this movie");
        }
        }
        catch(TicketPurchaseLimitException e)
        {
            this.BookTickets();
            
        }
        catch(TicketNotAvailableException e)
        {
            
        }
        
    }

    public void SetMovieName(String mname) {
        this.MovieName = mname;

    }

    public String GetMovieName() {
        return this.MovieName;
    }

    public int GetMoviePrice() {
        return this.Movieprice;
    }
    
    
    

    @Override
    public String toString() {
        return (MovieName + " " + MovieTime);
    }

}
