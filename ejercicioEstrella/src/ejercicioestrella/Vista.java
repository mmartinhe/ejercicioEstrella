
package ejercicioestrella;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * @author mmartinh
 */
public class Vista extends JFrame {
    private final ImageIcon ESTRELLA_AMARILLA = new ImageIcon(getClass().getResource("../assets/estrellaAmarilla.png")); //el getClass y getResource es para conseguir permisos,
    private final ImageIcon ESTRELLA_ROJA = new ImageIcon(getClass().getResource("../assets/estrellaRoja.png"));          //funcionaría sin ponerlos, pero es aconsejable
                                                                                                                                   //ponerlo sobretodo en Mac y Linux
    private Controlador controlador;
    static Panel p1, p2, p3; //p1 para la estrella, p2 letra y coordenadas y p3 "dentro de..." 
    private JLabel estrella, cuadroLetra, cuadroCoordenadas, cuadroDentro;
    JButton hola;
    public Vista (Controlador controlador){
        super("Ejercicio Estrella");
        this.controlador = controlador;
        crearInterfaz();
        anadirEscuchadores();
    }

    private void crearInterfaz() {
        crearPaneles();
        crearEstrella();
        crearCuadroLetra();
        crearCuadroCoordenadas();
        crearCuadroInferior();
        anadirPaneles();
        configuracionVentana();
      
    }
    
        private void crearPaneles() {
        p1 = new Panel();
        p1.setLayout(new GridLayout(1, 0));
        p2 = new Panel();
        p2.setLayout(new GridLayout(0, 2));
        p3 = new Panel();
        p3.setLayout(new GridLayout(1, 0));
      
        
    }

    
    private void crearEstrella() {
        estrella = new JLabel(ESTRELLA_AMARILLA);
        p1.add(estrella);
        p1.setSize(350, 350);
        p1.setLocation(200, 20);
    }
    
    private void crearCuadroLetra() {
        cuadroLetra = new JLabel();
        p2.add(cuadroLetra);
        
    }

    private void crearCuadroCoordenadas() {
        cuadroCoordenadas = new JLabel();
        p2.add(cuadroCoordenadas);
        
    }

    private void crearCuadroInferior() {
        cuadroDentro = new JLabel();
        p3.add(cuadroDentro);
    }
    
    private void anadirPaneles(){
        this.add(p1);
        this.add(p2);
        this.add(p3);
    }

    private void anadirEscuchadores() {
       this.addWindowStateListener(controlador);
       estrella.addMouseListener(controlador);
    }

    private void configuracionVentana() {
        this.setSize(800, 800);
        this.setVisible(true);
    }
    
    public void setEstrellaRoja(){
        estrella.setIcon(ESTRELLA_ROJA);
    }
    
    public void setEstrellaAmarilla(){
        estrella.setIcon(ESTRELLA_AMARILLA);
    }

  
}
