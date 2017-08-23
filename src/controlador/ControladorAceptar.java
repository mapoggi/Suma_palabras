package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import suma.Principal;


public class ControladorAceptar implements MouseListener{
    private JTextField txtpalabraUno;
    private JTextField txtpalabraDos;
    private JTextField txtresultado;

    public ControladorAceptar(JTextField txtpalabraUno, JTextField txtpalabraDos, JTextField txtresultado) {
        this.txtpalabraUno = txtpalabraUno;
        this.txtpalabraDos = txtpalabraDos;
        this.txtresultado = txtresultado;
    }

  
    

    @Override
    public void mouseClicked(MouseEvent me) {
        Integer rst = this.txtpalabraUno.getText().length()+this.txtpalabraDos.getText().length();
                   this.txtresultado.setText(rst.toString());
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
 
        
}
