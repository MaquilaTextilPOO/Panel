package hn.uth.poo.p3.negocio.utilitarios;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;

/**
 *
 * @author maureen
 */
public class Utilitarios {

    public Utilitarios() {
        super();
    }

    public boolean fechaValida(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        return sdf.parse(s, new ParsePosition(0)) != null;
    }
}
