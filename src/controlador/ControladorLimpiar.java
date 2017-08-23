
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import suma.Principal;

public class ControladorLimpiar implements MouseListener {
    private JTextField txtpalabraUno;
    private JTextField txtpalabraDos;
    private JTextField txtresultado;
    
    public ControladorLimpiar(JTextField txtpalabraUno, JTextField txtpalabraDos, JTextField txtresultado) {
        this.txtpalabraUno = txtpalabraUno;
        this.txtpalabraDos = txtpalabraDos;
        this.txtresultado = txtresultado;  
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    txtpalabraUno.setText("");
    txtpalabraDos.setText("");
    txtresultado.setText("");
    txtpalabraUno.grabFocus();
    
    
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    
    }

    @Override
    public void mouseExited(MouseEvent me) {
    
    }

    
}
