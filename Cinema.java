/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketreservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hasan
 */
public class Cinema {

    private int cinemaNumber;

    Scanner scanner = new Scanner(System.in);

    private ArrayList<Movie> AllMovies = new ArrayList();

    public Cinema(int c) {
        cinemaNumber = c;
    }

    public Cinema() {

    }

    public void AddMovie() {

        Movie e = null;
        System.out.println("Enter movie name:");
        String name = scanner.nextLine();
        System.out.println("Enter movie timings");
        String time = scanner.nextLine();
        System.out.println("Enter ticket price for movie");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter movie genre");
        String genre = scanner.nextLine();
        System.out.println("Enter movie language");
        String language = scanner.nextLine();
        System.out.println("Enter movie review");
        String review = scanner.nextLine();
        System.out.println("Enter movie rating (out of 10)");
        double rating = scanner.nextDouble();
        System.out.println("Enter number of tickets for movie");
        int tickets = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter movie type(1 for 2D/2 for 3D)");
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            e = new Movie2D(name, time, price, genre, language, review, rating, tickets, tickets);
        }
        if (i == 2) {
            e = new Movie3D(name, time, price, genre, language, review, rating, tickets, tickets);
        }
        AllMovies.add(e);

    }

    public void ShowMovies() {
        AllMovies.add(new Movie("Jungle Book", "10:30-11:45", 500, "Action", "English", "V Good movie", 8.7, 10, 10));
        AllMovies.add(new Movie("Civil War", "8:00-10:00", 500, "Action", "English", "V Good movie", 8.7, 10, 10));
        
        System.out.println("Press 1 to view movies by price");
        System.out.println("Press 2 to view movies by Genre");
        System.out.println("Press 3 to view movies by Language");
        System.out.println("Press 4 to view movies by Name");
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {

        } else if (i == 2) {

        } else if (i == 3) {

        } else if (i == 4) {

        }
    }

    public void BookAMovie() {
        System.out.println("Select Movie to book (1 for jungle book/2 for civil war)");
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            Movie Movie1;
            Movie1 = AllMovies.get(0);
            Movie1.BookTickets();
        } else if (i == 2) {
            Movie Movie2;
            Movie2 = AllMovies.get(1);
            Movie2.BookTickets();
        }
    }

    @Override
    public String toString() {
        Integer i = cinemaNumber;
        return "Cinema" + i.toString();
    }

}
