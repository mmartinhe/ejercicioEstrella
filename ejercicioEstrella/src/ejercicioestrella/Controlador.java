
package ejercicioestrella;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
    

/**
 *
 * @author mmartinh
 */
public class Controlador implements WindowStateListener, MouseListener{
    
    private Vista vista;
    
    public Controlador (){
        vista = new Vista(this);
    }

    @Override
    public void windowStateChanged(WindowEvent e) {
        if ((e.getNewState() & JFrame.ICONIFIED) == JFrame.ICONIFIED) {
            System.out.println("Ventana minimizada");
        } else if ((e.getNewState() & JFrame.MAXIMIZED_BOTH) == JFrame.MAXIMIZED_BOTH){
            System.out.println("Ventana maximizada");
        }
        
      }

    @Override

    public void mouseEntered(MouseEvent e) {
        vista.setEstrellaRoja();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        vista.setEstrellaAmarilla();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println();
    }
}
