package org.example.vista;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class VentanaMineral extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblTipo;
    private JLabel lblColor;
    private JLabel lblDureza;
    private JLabel lblUrl;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtTipo;
    private JTextField txtColor;
    private JTextField txtDureza;
    private JTextField txtUrl;
    private JButton botonAdd;
    private JButton botonCargar;
    private JTable tabla;
    private JScrollPane scroll;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel imagenMineral;
    //Panel4
    private JLabel lblIdp4;
    private JLabel lblNombrep4;
    private JLabel lblTipop4;
    private JLabel lblColorp4;
    private JLabel lblDurezap4;
    private JLabel lblUrlp4;
    private JTextField txtIdp4;
    private JTextField txtNombrep4;
    private JTextField txtTipop4;
    private JTextField txtColorp4;
    private JTextField txtDurezap4;
    private JTextField txtUrlp4;
    private JButton  botonActualizar;
    private JButton botonBorrar;


    public VentanaMineral(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(162, 198, 241));
        lblId = new JLabel("ID: ");
        lblNombre = new JLabel("Nombre: ");
        lblTipo = new JLabel("Tipo: ");
        lblColor = new JLabel("Color: ");
        lblDureza = new JLabel("Dureza: ");
        lblUrl = new JLabel("Url: ");
        txtId = new JTextField(3);
        txtNombre = new JTextField(10);
        txtTipo = new JTextField(8);
        txtColor = new JTextField(10);
        txtDureza = new JTextField(12);
        txtUrl = new JTextField(30);
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblTipo);
        panel1.add(txtTipo);
        panel1.add(lblColor);
        panel1.add(txtColor);
        panel1.add(lblDureza);
        panel1.add(txtDureza);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        botonAdd = new JButton("Agregar");
        panel1.add(botonAdd);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(246, 174, 180));
        botonCargar = new JButton("Cargar Datos");
        panel2.add(botonCargar);
        tabla = new JTable();
        scroll = new JScrollPane(tabla);
        panel2.add(scroll);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(187, 231, 143));
        imagenMineral = new JLabel("...");
        panel3.add(imagenMineral);

        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(170, 166, 211));
        lblIdp4 = new JLabel("Id: ");

        lblNombrep4 = new JLabel("Nombre: ");
        txtNombrep4 = new JTextField(8);

        lblTipop4 = new JLabel("Tipo: ");
        txtTipop4 = new JTextField(11);

        lblColorp4 = new JLabel("Color: ");
        txtColorp4 = new JTextField(10);

        lblDurezap4 = new JLabel("Dureza: ");
        txtDurezap4 = new JTextField(15);

        lblUrlp4 = new JLabel("Url: ");
        txtUrlp4 = new JTextField(30);

        botonActualizar = new JButton("Actualizar");
        botonBorrar = new JButton("Eliminar");

        panel4.add(lblIdp4);
        panel4.add(txtIdp4);

        panel4.add(lblNombrep4);
        panel4.add(txtNombrep4);

        panel4.add(lblTipop4);
        panel4.add(txtTipop4);

        panel4.add(lblColorp4);
        panel4.add(txtColorp4);

        panel4.add(lblDurezap4);
        panel4.add(txtDurezap4);

        panel4.add(lblUrlp4);
        panel4.add(txtUrlp4);

        panel4.add(botonActualizar);
        panel4.add(botonBorrar);



        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblColor() {
        return lblColor;
    }

    public void setLblColor(JLabel lblColor) {
        this.lblColor = lblColor;
    }

    public JLabel getLblDureza() {
        return lblDureza;
    }

    public void setLblDureza(JLabel lblDureza) {
        this.lblDureza = lblDureza;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }
    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JTextField getTxtColor() {
        return txtColor;
    }

    public void setTxtColor(JTextField txtColor) {
        this.txtColor = txtColor;
    }

    public JTextField getTxtDureza() {
        return txtDureza;
    }

    public void setTxtDureza(JTextField txtDureza) {
        this.txtDureza = txtDureza;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBotonAdd() {
        return botonAdd;
    }

    public void setBotonAdd(JButton botonAdd) {
        this.botonAdd = botonAdd;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JButton getBotonCargar() {
        return botonCargar;
    }

    public void setBotonCargar(JButton botonCargar) {
        this.botonCargar = botonCargar;
    }

    public JLabel getLblIdp4() {
        return lblIdp4;
    }

    public void setLblIdp4(JLabel lblIdp4) {
        this.lblIdp4 = lblIdp4;
    }

    public JLabel getLblNombrep4() {
        return lblNombrep4;
    }

    public void setLblNombrep4(JLabel lblNombrep4) {
        this.lblNombrep4 = lblNombrep4;
    }

    public JLabel getLblTipop4() {
        return lblTipop4;
    }

    public void setLblTipop4(JLabel lblTipop4) {
        this.lblTipop4 = lblTipop4;
    }

    public JLabel getLblColorp4() {
        return lblColorp4;
    }

    public void setLblColorp4(JLabel lblColorp4) {
        this.lblColorp4 = lblColorp4;
    }

    public JLabel getLblDurezap4() {
        return lblDurezap4;
    }

    public void setLblDurezap4(JLabel lblDurezap4) {
        this.lblDurezap4 = lblDurezap4;
    }

    public JLabel getLblUrlp4() {
        return lblUrlp4;
    }

    public void setLblUrlp4(JLabel lblUrlp4) {
        this.lblUrlp4 = lblUrlp4;
    }

    public JTextField getTxtIdp4() {
        return txtIdp4;
    }

    public void setTxtIdp4(JTextField txtIdp4) {
        this.txtIdp4 = txtIdp4;
    }

    public JTextField getTxtNombrep4() {
        return txtNombrep4;
    }

    public void setTxtNombrep4(JTextField txtNombrep4) {
        this.txtNombrep4 = txtNombrep4;
    }

    public JTextField getTxtTipop4() {
        return txtTipop4;
    }

    public void setTxtTipop4(JTextField txtTipop4) {
        this.txtTipop4 = txtTipop4;
    }

    public JTextField getTxtColorp4() {
        return txtColorp4;
    }

    public void setTxtColorp4(JTextField txtColorp4) {
        this.txtColorp4 = txtColorp4;
    }

    public JTextField getTxtDurezap4() {
        return txtDurezap4;
    }

    public void setTxtDurezap4(JTextField txtDurezap4) {
        this.txtDurezap4 = txtDurezap4;
    }

    public JTextField getTxtUrlp4() {
        return txtUrlp4;
    }

    public void setTxtUrlp4(JTextField txtUrlp4) {
        this.txtUrlp4 = txtUrlp4;
    }

    public JButton getBotonActualizar() {
        return botonActualizar;
    }

    public void setBotonActualizar(JButton botonActualizar) {
        this.botonActualizar = botonActualizar;
    }

    public JButton getBotonBorrar() {
        return botonBorrar;
    }

    public void setBotonBorrar(JButton botonBorrar) {
        this.botonBorrar = botonBorrar;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }


    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }
    public JPanel getPanel4() {
        return panel4;
    }
    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    public JLabel getImagenMineral() {
        return imagenMineral;
    }
    public void setImagenMineral(JLabel imagenMineral) {
        this.imagenMineral = imagenMineral;
    }
    public void limpiar (){
        txtId.setText("");
        txtNombre.setText("");
        txtTipo.setText("");
        txtColor.setText("");
        txtDureza.setText("");
        txtUrl.setText("");

    }
    public void limpiarp4 (){
        txtIdp4.setText("");
        txtNombrep4.setText("");
        txtTipop4.setText("");
        txtColorp4.setText("");
        txtDurezap4.setText("");
        txtUrlp4.setText("");
    }
}
