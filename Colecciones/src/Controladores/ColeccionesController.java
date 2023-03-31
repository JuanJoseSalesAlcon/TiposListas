/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Colecciones;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class ColeccionesController implements ActionListener{
    frmPrincipal VistaPrincipal;
    Colecciones ModeloColecciones;

    public ColeccionesController(frmPrincipal VistaPricipal, Colecciones ModeloColecciones) {
        this.VistaPrincipal = VistaPricipal;
        this.ModeloColecciones = ModeloColecciones;
        
        this.VistaPrincipal.btnAgregar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
            }
}
