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
public class MovieReview {

    private String Review;

    MovieReview(String review) {
        this.Review = review;
    }

    public void SetReview(String review) {
        this.Review = review;

    }

    public String GetReview() {

        return this.Review;
    }

    @Override
    public String toString() {
        return Review;
    }

}
