
package ejercicioestrella;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * @author mmartinh
 */
public class Vista extends JFrame {
    private Controlador controlador;
    JButton estrella;
    
    public Vista (Controlador controlador){
        super("Ejercicio Estrella");
        this.controlador = controlador;
        crearInterfaz();
        anadirEscuchadores();
    }

    private void crearInterfaz() {
        this.setSize(800, 800);
        this.setVisible(true);
        crearEstrella();
        crearCuadroLetra();
        crearCuadroCoordenadas();
        crearCuadroInferior();
    }

    private void crearEstrella() {
        
    }

    private void crearCuadroLetra() {
        
    }

    private void crearCuadroCoordenadas() {
        
    }

    private void crearCuadroInferior() {
        
    }

    private void anadirEscuchadores() {
       this.addWindowStateListener(controlador);
    }

    

    
}
