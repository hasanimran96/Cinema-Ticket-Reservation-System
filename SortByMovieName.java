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
public class SortByMovieName implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        int ret = o1.GetMovieName().compareTo(o2.GetMovieName());
        return ret;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
