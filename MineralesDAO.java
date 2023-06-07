package org.example.Persistencia;


import org.example.modelo.Minerales;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MineralesDAO implements InterfazDAO {
    public MineralesDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Minerales(Nombre, Tipo, Color, Dureza, Url ) VALUES(?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSQL.getInstance("MineralesDB.db").getConexion().prepareStatement(sqlInsert);
        pstm.setString(1,((Minerales) obj).getNombre());
        pstm.setString(2,((Minerales) obj).getTipo());
        pstm.setString(3,((Minerales) obj).getColor());
        pstm.setString(4,((Minerales) obj).getDureza());
        pstm.setString(5,((Minerales) obj).getUrl());

        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Minerales SET Nombre = ?, Tipo = ?, Color = ?, Dureza = ?, Url = ?, WHERE Id = ?; " ;
        int rowCount = 0;
        PreparedStatement pstm = ConexionSQL.getInstance("MineralesDB.db").getConexion().prepareStatement(sqlUpdate);
        pstm.setString(1,((Minerales) obj).getNombre());
        pstm.setString(2,((Minerales) obj).getTipo());
        pstm.setString(3,((Minerales) obj).getColor());
        pstm.setString(4,((Minerales) obj).getDureza());
        pstm.setString(5,((Minerales) obj).getUrl());
        pstm.setInt(6,((Minerales) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Minerales WHERE id = ? ; " ;
        int rowCount = 0;
        PreparedStatement pstm = ConexionSQL.getInstance("MineralesDB.db").getConexion().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Minerales";
        ArrayList<Minerales> resultado = new ArrayList<>();
        Statement stm = ConexionSQL.getInstance("MineralesDB.db").getConexion().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Minerales(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarporId(String id) throws SQLException {
        String sql = "SELECT * FROM Minerales WHERE id = ? ; " ;
        Minerales minerales = null;

        PreparedStatement pstm = ConexionSQL.getInstance("MineralesDB.db").getConexion().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            minerales = new Minerales(rst.getInt(1), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
            return minerales;
        }
        return null;
    }

}

