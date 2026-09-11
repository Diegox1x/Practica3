package Practica3;
import javax.swing.*;
import java.awt.Color;

public class GUI extends JFrame {
    
    JLabel lNombre, lDireccion, lSexo, lTelefono, lNumero, lFotografia, lFoto;
    JTextField tNombre, tDireccion, tNumero;
    JComboBox<String> cSexo;
    JCheckBox cbMovil, cbCasa;
    JFileChooser fileChooser;
    JButton nuevo, guardar;
    
    public GUI() {
        setTitle("Práctica 3");
        setSize(600, 600);
        setLayout(null);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);  
    }
    
    public void componentes() {
        lNombre = new JLabel("Nombre:");
        lNombre.setBounds(30, 30, 80, 25);
        
        tNombre = new JTextField();
        tNombre.setBounds(100, 30, 200, 25);
        
        lDireccion = new JLabel("Dirección:");
        lDireccion.setBounds(30, 70, 80, 25);
        
        tDireccion = new JTextField();
        tDireccion.setBounds(100, 70, 200, 25);
        
        lSexo = new JLabel("Sexo:");
        lSexo.setBounds(30, 110, 80, 25);
        
        cSexo = new JComboBox<>();
        cSexo.addItem("Femenino");
        cSexo.addItem("Masculino");
        cSexo.setBounds(100, 110, 150, 25);
        
        lTelefono = new JLabel("Teléfono:");
        lTelefono.setBounds(30, 150, 80, 25);
        
        cbMovil = new JCheckBox("Movil");
        cbMovil.setBounds(100, 150, 70, 25);
        
        cbCasa = new JCheckBox("Casa");
        cbCasa.setBounds(170, 150, 70, 25);
        
        lNumero = new JLabel("Número:");
        lNumero.setBounds(30, 190, 80, 25);
        
        tNumero = new JTextField();
        tNumero.setBounds(100, 190, 200, 25);
        
        lFoto = new JLabel("Foto", SwingConstants.CENTER);
        lFoto.setBounds(330, 30, 220, 185);
        lFoto.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        lFotografia = new JLabel("Fotografía:");
        lFotografia.setBounds(30, 230, 80, 25);
        
        fileChooser = new JFileChooser();
        fileChooser.setBounds(100, 230, 450, 250);
        
        nuevo = new JButton("Nuevo");
        nuevo.setBounds(200, 500, 100, 30);
        
        guardar = new JButton("Guardar");
        guardar.setBounds(320, 500, 100, 30);         
        
        add(lNombre);
        add(tNombre);
        add(lDireccion);
        add(tDireccion);
        add(lSexo);
        add(cSexo);
        add(lTelefono);
        add(cbMovil);
        add(cbCasa);
        add(lNumero);
        add(tNumero);
        add(lFoto);
        add(lFotografia);
        add(fileChooser);
        add(nuevo);
        add(guardar);
    }
}