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
public class TicketBill {

    private int ticketprice;

    public TicketBill() {
        this.ticketprice = 100;
    }

    public void ComputeBill(int tickets) {
        int total = ticketprice * tickets;
        System.out.println("Your bill is " + total);
    }

}
