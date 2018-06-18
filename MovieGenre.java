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
public class MovieGenre {

    private String Genre;

    MovieGenre(String genre) {

        this.Genre = genre;

    }

    public void SetGenre(String genre) {
        this.Genre = genre;

    }

    public String GetGenre() {

        return Genre;
    }

    @Override
    public String toString() {
        return Genre;
    }

}
