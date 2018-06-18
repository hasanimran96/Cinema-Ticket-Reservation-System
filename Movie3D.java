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
public class Movie3D extends Movie {

    public Movie3D(String mname, String mtime, int price, String g, String l, String re, double rt, int tnum, int snum) {
        super(mname, mtime, price, g, l, re, rt, tnum, snum);
    }

    @Override
    public String toString() {
        return (MovieName + " " + MovieTime);
    }

}
