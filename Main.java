package org.example;
import org.example.Persistencia.MineralesDAO;
import org.example.controlador.ControladorMineral;
import org.example.modelo.Minerales;
import org.example.vista.VentanaMineral;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VentanaMineral view = new VentanaMineral("Proyecto Final MINERALES");
        ControladorMineral controller = new ControladorMineral(view);
    }
}