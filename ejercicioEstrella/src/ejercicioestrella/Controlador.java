
package ejercicioestrella;


import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
    

/**
 *
 * @author mmartinh
 */
public class Controlador implements WindowStateListener{
    
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
}
