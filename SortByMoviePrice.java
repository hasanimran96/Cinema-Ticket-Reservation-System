/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketreservationsystem;

import java.util.Comparator;

/**
 *
 * @author hasan
 */
public class SortByMoviePrice implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {

        return Integer.compare(o1.GetMoviePrice(), o2.GetMoviePrice());
    }

}
