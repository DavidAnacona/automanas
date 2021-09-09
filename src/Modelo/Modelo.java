
package Modelo;

import java.awt.List;
import java.util.ArrayList;

public class Modelo {

    private String entero;
    private String real;
    private String notacionCientifica;
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public String getNotacionCientifica() {
        return notacionCientifica;
    }

    public String getEntero() {
        return entero;
    }

    public String getReal() {
        return real;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEntero(String entero) {
        this.entero = entero;
    }

    public void setNotacionCientifica(String notacionCientifica) {
        this.notacionCientifica = notacionCientifica;
    }

    public void setReal(String real) {
        this.real = real;
    }

    public static boolean validarEntero(String entero) {
        return entero.matches("[+-]?[0-9]+$");
    }

    public static boolean validarReal(String real) {
        return real.matches("^[+-]?[\\d]+\\.([\\d]*$)");
    }

    public static boolean validarNotacionCientifica(String notacionCientifica) {
        return notacionCientifica.matches("^[+-]?[0-9]* \\.?[0-9]+([eE][+-]?[0-9]+)$");
    }

    public static boolean validarCorreo(String correo) {
        return correo.matches("([a-zA-Z0-9._-]+)@([\\w]+)\\.([a-zA-Z])+");
    }
    ///123b46

    public static ArrayList<String> AutomataEntero(String entero) {

        char[] vector = entero.toCharArray();
        ArrayList<String> caracter = new ArrayList<String>();

        for (int i = 0; i < entero.length(); i++) {
            String numero = String.valueOf(vector[i]);

            if (!numero.matches("[+-]?[0-9]+$")) {
                caracter.add(numero);

            }
        }

        return caracter;
    }

    public static ArrayList<String> AutomataReal(String real) {

        char[] vector = real.toCharArray();
        ArrayList<String> caracter = new ArrayList<String>();

        for (int i = 0; i < real.length(); i++) {
            String numero = String.valueOf(vector[i]);

            if (numero.matches("^[+-]?[\\d]+\\.([\\d]*$)")) {
                caracter.add(numero);

            }
        }

        return caracter;
    }

    public static ArrayList<String> AutomataNC(String NotacionCientifica) {

        char[] vector = NotacionCientifica.toCharArray();
        ArrayList<String> letras = new ArrayList<String>();

        for (int i = 0; i < NotacionCientifica.length(); i++) {
            String numero = String.valueOf(vector[i]);

            if (!numero.matches("^-?\\d+(?:.\\d+)?(?:[Ee][-+]?\\d+)?$")) {
                letras.add(numero);

            }
        }

        return letras;
    }

    public static ArrayList<String> AutomataCorreo(String Correo) {

        char[] vector = Correo.toCharArray();
        ArrayList<String> letras = new ArrayList<String>();

        for (int i = 0; i < Correo.length(); i++) {
            String numero = String.valueOf(vector[i]);

            if (!numero.matches("([a-zA-Z0-9._-]+)@([\\w]+)\\.([a-zA-Z])+")) {
                letras.add(numero);

            }
        }

        return letras;
    }

}
