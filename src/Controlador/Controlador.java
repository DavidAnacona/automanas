/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Modelo;
import Vista.Vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Controlador  implements ActionListener{
    
    
    private Vistas view;
    private Modelo model;

    public Controlador(Vistas view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.validar.addActionListener(this);
        
    }
     
    public void iniciar()
    {
    view.setTitle("Taller #1");
    view.setLocationRelativeTo(null);
    }
   
    public void actionPerformed(ActionEvent e)
    {
      model.setReal(view.campoReal.getText());
      model.setEntero(view.campoEntero.getText());
      model.setNotacionCientifica(view.campoNC.getText());
      model.setCorreo(view.campoCorreo.getText());
        
        view.labelEntero.setText("prueba"+model.getEntero());

        model.validarEntero(model.getEntero());
        model.validarReal(model.getReal());
        model.validarNotacionCientifica(model.getNotacionCientifica());
        model.validarCorreo(model.getCorreo());
        model.AutomataEntero(model.getEntero());
        model.AutomataReal(model.getEntero());
        model.AutomataNC(model.getNotacionCientifica());
        model.AutomataCorreo(model.getCorreo());
     
     if (model.validarEntero(model.getEntero())) {
             view.labelEntero.setText("valido");
        } else {
           ArrayList ListaEnteros = model.AutomataEntero(view.campoEntero.getText());
            view.labelEntero.setText("Invalido");
            view.labelEnteroError.setText(String.valueOf(ListaEnteros));
        } 
        if (model.validarReal(model.getReal())) {
            view.labelReal.setText("valido");
        } else {
            ArrayList ListaReal = model.AutomataReal(view.campoReal.getText());
            view.labelReal.setText("Invalido");
             view.labelRealError.setText(String.valueOf(ListaReal));
        } 
        if (model.validarCorreo(model.getCorreo())) {
            view.labelCorreo.setText("valido");
        } else {
             ArrayList  ListaCorreo= model.AutomataCorreo(view.campoCorreo.getText());
            view.labelCorreo.setText("Invalido");
            view.labelCorreoError.setText(String.valueOf(ListaCorreo));
        } 
        if (model.validarNotacionCientifica(model.getNotacionCientifica())) {
             view.labelNC.setText("valido");
        }  else {
             ArrayList ListaNC = model.AutomataNC(view.campoNC.getText());
            view.labelNC.setText("Invalido");
            view.labelNCError.setText(String.valueOf(ListaNC));
        }
        
    }

    
}
