
package visual;

import controlador.ControladorAceptar;
import controlador.ControladorCancelar;
import controlador.ControladorWindowsCalculo;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;


public class Suma extends JFrame{
    private JLabel lblsuma = new JLabel("");
    private JButton suma = new JButton("SUMAR");
    private JLabel lblpalabraUno = new JLabel("         Primer Palabra ");
    private JLabel lblpalabraDos = new JLabel("         Segunda Palabra");
    private JLabel lblresultado = new JLabel("          Resultado");
    private JTextField txtpalabraUno = new JTextField ("");
    private JTextField txtpalabraDos = new JTextField ("");
    private JTextField txtresultado = new JTextField ("");
    private GridLayout contenedor = new GridLayout(4,2);
    private ControladorCancelar controladorCancelar = new ControladorCancelar();
    private ControladorAceptar controladorAceptar = new ControladorAceptar(txtpalabraUno,txtpalabraDos,txtresultado);
    private ControladorWindowsCalculo controladorWindowsCalculo = new ControladorWindowsCalculo();
   
  
    
    public Suma (){
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setTitle("SUMAR PALABRAS");
        this.setSize(300, 200);
        this.setLocation(200, 200);
        this.setVisible(true);
        this.suma.addMouseListener(controladorAceptar);
    }

    private void agregarComponentes() {
        this.add(lblpalabraUno);
        this.add(txtpalabraUno);
        this.add(lblpalabraDos);
        this.add(txtpalabraDos);
        this.add(lblresultado);
        this.add(txtresultado);
        this.add(lblsuma);
        this.add(suma);
    }



  
}
