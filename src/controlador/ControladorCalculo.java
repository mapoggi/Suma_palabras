
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import suma.Principal;


public class ControladorCalculo implements MouseListener{
    private JTextField visualizadorRst;
 
    public ControladorCalculo(JTextField visualizadorRst) {
        this.visualizadorRst = visualizadorRst;
    }

    public void setVisualizadorRst(JTextField visualizadorRst) {
        this.visualizadorRst = visualizadorRst;
    }

    @Override
    public void mouseClicked(MouseEvent e) {        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
