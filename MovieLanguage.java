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
public class MovieLanguage {

    private String lang;

    MovieLanguage(String lang) {
        this.lang = lang;
    }

    public void SetGenre(String lang) {
        this.lang = lang;

    }

    public String GetGenre() {

        return lang;
    }

    @Override
    public String toString() {
        return lang;
    }

}
