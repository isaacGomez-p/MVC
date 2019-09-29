package Principal;

import Controlador.ControladorVentana;
import Modelo.Logica;
import Vista.VentanaPrincipal;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BRAYAN, ISAAC
 */
public class Principal {
    public static void main (String... a){
        Principal princip = new Principal();
        
    }
    /**
     * Constructor de la clase donde se llama a la clase Controlador para inicializar el programa.
     */
    public Principal(){        
        VentanaPrincipal obt = new VentanaPrincipal();
        
        Logica log = new Logica();
        
        ControladorVentana cont = new ControladorVentana(obt,log);        
    }
}
