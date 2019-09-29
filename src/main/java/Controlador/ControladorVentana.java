/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Logica;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 * Clase controlador que indica de que manera se van a comportar los componentes visuales
 * @author ISAACELEAZAR, Brayan
 */
public class ControladorVentana implements ActionListener{
    /**
     * Objeto que representa la clase ventana principal
     */
    private final VentanaPrincipal vista;
    /**
     * Objeto que representa la clase Logica
     */
    private final Logica controlador;
    /**
     * Variable que define la fuente para llenarr la lista
     */
    private final DefaultListModel modelo;
    /**
     * constructor de la clase
     * @param vista Objeto que representa la clase ventana principal
     * @param controlador Objeto que representa la clase Logica
     */
    public ControladorVentana(VentanaPrincipal vista, Logica controlador){
        this.modelo = new DefaultListModel();
        this.vista = vista;
        this.controlador = controlador;
        this.vista.bAdd.addActionListener(this);
        this.vista.setVisible(true);        
    }
    
    /**
     * Metodo que se activa cuando el botón es pulsado
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        controlador.setNum1(Integer.parseInt(this.vista.tNum1.getText()));
        controlador.setNum2(Integer.parseInt(this.vista.jNum2.getText()));
        llenarLista(controlador.resultado());        
    }
    
    /**
     * metodo que añade los resultados a la vista
     * @param res 
     */
    private void llenarLista(String res){
        modelo.addElement(res);
        vista.lResultados.setModel(modelo);
    }    
}
