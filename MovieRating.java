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
public class MovieRating {

    private double rating;

    MovieRating(double rating) {
        this.rating = rating;
    }

    public void SetRating(double rating) {
        this.rating = rating;

    }

    public double GetRating() {

        return this.rating;
    }

    @Override
    public String toString() {
        Double i = this.rating;
        return i.toString();
    }

}
