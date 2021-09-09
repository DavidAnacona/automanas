
package tallerno1;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vistas;


public class Prinsipal {

    public static void main(String[] args) {

        Modelo mod = new Modelo();
        Vistas view = new Vistas();

        Controlador Ctrl = new Controlador(view, mod);

        Ctrl.iniciar();
        view.setVisible(true);

    }

}
