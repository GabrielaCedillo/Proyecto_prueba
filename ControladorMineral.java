package org.example.controlador;

import org.example.modelo.Minerales;
import org.example.modelo.ModeloTabla;
import org.example.vista.VentanaMineral;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorMineral extends MouseAdapter {
    private VentanaMineral view;
    private ModeloTabla modelo;
    public ControladorMineral(VentanaMineral view){
        this.view = view;
        this.view.getBotonAdd().addMouseListener(this);
        this.view.getTabla().addMouseListener(this);
        modelo = new ModeloTabla();
        this.view.getTabla().setModel(modelo);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()== view.getBotonAdd()){
            System.out.println("Evento sobre boton add");
            Minerales minerales = new Minerales();
            minerales.setId(Integer.parseInt(this.view.getTxtId().getText()));
            minerales.setNombre(this.view.getTxtNombre().getText());
            minerales.setTipo(this.view.getTxtTipo().getText());
            minerales.setColor(this.view.getTxtColor().getText());
            minerales.setDureza(this.view.getTxtDureza().getText());
            minerales.setUrl(this.view.getTxtUrl().getText());
            modelo.agregarMineral(minerales);
            this.view.getTabla().updateUI();
        }
        if (e.getSource()== view.getTabla()){
            System.out.println("Evento sobre tabla");
            int index = this.view.getTabla().getSelectedRow();
            Minerales tmp = modelo.getMineralAtIndex(index);
            try{
                this.view.getImagenMineral().setIcon(tmp.getImagen());
                this.view.getImagenMineral().setText("");
            }catch (MalformedURLException mfue){
                System.out.println(e.toString());
            }

        }
    }
}
