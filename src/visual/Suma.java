package visual;

import controlador.ControladorAceptar;
import controlador.ControladorLimpiar;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import javax.swing.*;
       

public class Suma extends JFrame{
    private JLabel lblsuma = new JLabel("");
    private JButton suma = new JButton("SUMAR");
    private JLabel lblborrar = new JLabel("");
    private JButton borrar = new JButton("BORRAR");
    private JLabel lblpalabraUno = new JLabel("      Primer Palabra");
    private JLabel lblpalabraDos = new JLabel("      Segunda Palabra");
    private JLabel lblresultado = new JLabel("      Resultado");
    private JTextField txtpalabraUno = new JTextField("");
    private JTextField txtpalabraDos = new JTextField("");
    private JTextField txtresultado = new JTextField("");
    private GridLayout contenedor = new GridLayout(5,2);
    private ControladorAceptar controladorAceptar = new ControladorAceptar(txtpalabraUno, txtpalabraDos, txtresultado);
    private ControladorLimpiar controladorLimpiar = new ControladorLimpiar(txtpalabraUno, txtpalabraDos, txtresultado);
    
public Suma(){
    this.setLayout(contenedor);
    this.agregarComponentes();
    this.setTitle("SUMA PALABRAS");
    this.setSize(300, 200);
    this.setLocation(200, 200);
    this.setVisible(true);
    this.suma.addMouseListener(controladorAceptar);
    this.borrar.addMouseListener(controladorLimpiar);
}
private void agregarComponentes(){
    this.add(lblpalabraUno);
    this.add(txtpalabraUno);
    this.add(lblpalabraDos);
    this.add(txtpalabraDos);  
    this.add(lblsuma);
    this.add(suma);
    this.add(lblresultado);
    this.add(txtresultado);
    this.add(lblborrar);
    this.add(borrar);
    
}
}
   
