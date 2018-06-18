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
public class SortByMovieGenre implements Comparator<MovieGenre> {

    @Override
    public int compare(MovieGenre o1, MovieGenre o2) {
        int ret = o1.GetGenre().compareTo(o2.GetGenre());
        return ret;

//     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
