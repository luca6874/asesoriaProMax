import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.GridLayout;
import javax.swing.JButton;


public class VentanaPrincipal extends JFrame{

    public VentanaPrincipal(){
        setTitle("sistema vehiculo");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Sistemma de vehículo");
        add(titulo, BorderLayout.NORTH);

        JPanel panelVehiculos = new JPanel();
        panelVehiculos.setLayout(new GridLayout(0,1));

        panelVehiculos.add(new JButton("Carro"));
        panelVehiculos.add(new JButton("Avión"));
        panelVehiculos.add(new JButton("Barco"));
        panelVehiculos.add(new JButton("Agregar vehículo"));

        add(panelVehiculos, BorderLayout.WEST);

        //parte central del sistema

        JPanel panelAnimacion = new JPanel();
        JLabel vehiculoVisual = new JLabel("🚗 VEHÍCULO");
        panelAnimacion.add(vehiculoVisual);

        add(panelAnimacion, BorderLayout.CENTER);

        JPanel panelControles = new JPanel();

        JButton btnCargar = new JButton("Cargar Combustible");
        JButton btnDesplazar = new JButton("Desplazar");
        JButton btnInformacion = new JButton("ver información");

        panelControles.add(btnCargar);
        panelControles.add(btnDesplazar);
        panelControles.add(btnInformacion);

        add(panelControles, BorderLayout.SOUTH);
    }
    
}
