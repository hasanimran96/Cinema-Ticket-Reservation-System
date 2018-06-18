package cinematicketreservationsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CinemaTicketReservationSystem {

    private final String id = "agent";
    private final int pwd = 123;

    Scanner scanner = new Scanner(System.in);

    private ArrayList<Customer> AllCustomers;

    private ArrayList<Cinema> AllCinemas;

    public void verifyAgent() {
        try {
            System.out.println("Input agent ID:");
            if (scanner.nextLine().equals(id)) {
                System.out.println("Input pwd:");
                if (scanner.nextInt() == pwd) {
                    scanner.nextLine();
                    System.out.println("verification sucess");
                } else {
                    scanner.nextLine();
                    throw new AgentVerificationFailedException("Password Incorrect!");
                }
            } else {
                throw new AgentVerificationFailedException("User ID Incorrect!");
            }
        } catch (AgentVerificationFailedException e) {
            // e.printStackTrace();
            verifyAgent();
        }
    }

    public void Initialize() {
        AllCustomers = new ArrayList();
        AllCinemas = new ArrayList();
        AllCinemas.add(new Cinema(1));
        AllCinemas.add(new Cinema(2));
        verifyAgent();
        System.out.println("");
        while (true) {
            Menu();
        }
    }

    public void Menu() {
        System.out.println("Press 1 to register customer.");
        System.out.println("Press 2 to Add a movie");
        System.out.println("Press 3 to Add a booking");
        System.out.println("Press 4 to show all Bookings");
        //i have made changes to the show movies function directly
        //rather than haviing to make changes in the menu function
        int temp = scanner.nextInt();
        scanner.nextLine();
        if (temp == 1) {
            System.out.println("Register Customer");
            Customer customer = new Customer();
            customer.RegisterCustomer();
            AllCustomers.add(customer);
            System.out.println("Customer has been registered!");
        } else if (temp == 2) {
            System.out.println("In which cinema would you like to add a movie");
            Cinema cinema = SelectCinema();
            cinema.AddMovie();
            //implement a method in class cinema to add a movie
        } else if (temp == 3) {
            System.out.println("In which cinema would you like to book a movie");
            Cinema cinema = SelectCinema();
            cinema.ShowMovies();
            cinema.BookAMovie();
        } else if (temp == 4) {
            ShowAllBookings();
        }
    }

    public Cinema SelectCinema() {
        Cinema cinema = null;
        try {
            System.out.println("Select Cinema (1 for cinema1/ 2 for cinema 2)");
            System.out.println(AllCinemas);

            int i = scanner.nextInt();
            scanner.nextLine();
            switch (i) {
                case 1:
                    cinema = AllCinemas.get(0);
                    break;
                case 2:
                    cinema = AllCinemas.get(1);
                    break;
                default:
                    throw new CinemaDoesNotExistException("Cinema does not exist");
            }
        } catch (CinemaDoesNotExistException e) {
            SelectCinema();
        }
        return cinema;
    }

    public void ShowAllBookings() {
        System.out.println(AllCustomers);
        System.out.println(AllCinemas);
        Cinema cinema = new Cinema();
        cinema.ShowMovies();
    }
}
