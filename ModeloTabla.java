package org.example.modelo;
import org.example.Persistencia.MineralesDAO;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTabla implements TableModel {
    private ArrayList<Minerales> datos;
    private MineralesDAO mineralDAO = new MineralesDAO();
    public static final int COLS = 6;

    public ModeloTabla() {
        datos = new ArrayList<>();
        mineralDAO = new MineralesDAO();
    }

    public ModeloTabla(ArrayList<Minerales> datos) {
        this.datos = datos;
        mineralDAO = new MineralesDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreCol = "";
        switch (columnIndex){
            case 0:
                nombreCol = "Id";
                break;
            case 1:
                nombreCol = "Nombre";
                break;
            case 2:
                nombreCol = "Tipo";
                break;
            case 3:
                nombreCol = "Color";
                break;
            case 4:
                nombreCol = "Dureza";
                break;
            case 5:
                nombreCol = "Foto (URL)";
                break;
            default:
                nombreCol = "";

        }

        return nombreCol;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return int.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                return String.class;

        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Minerales tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getTipo();
            case 3:
                return tmp.getColor();
            case 4:
                return tmp.getDureza();
            case 5:
                return tmp.getUrl();
        }
        return null;
        }


    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setId((Integer) aValue);
                break;
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setTipo((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setColor((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setDureza((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarMineral(Minerales mineral){
        datos.add(mineral);
    }
    public Minerales getMineralAtIndex(int idx){
        return  datos.get(idx);
    }
    public boolean agregarMinerales(Minerales minerales){
        boolean resultado = false;
        try {
            if(mineralDAO.insertar(minerales)){
                datos.add(minerales);
                resultado = true;
            }else{
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return  resultado;
    }
    public boolean modificarMineral (Minerales minerales){
        boolean resultado = false;
        try{
            if (mineralDAO.update(minerales)){
                resultado = true;
            }else{
                resultado = true;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public boolean deleteMineral(String id){
        boolean resultado = false;
        try{
            if (mineralDAO.delete(id)){
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado ;
    }
    public void cargarInfo(){
        try{
            datos = mineralDAO.obtenerTodo();
        }catch (SQLException sqle){
            JOptionPane.showMessageDialog(null, "Error al cargar los datos");
        }
    }
}
