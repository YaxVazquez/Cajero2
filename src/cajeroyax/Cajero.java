package cajeroyax;
/**
 *
 * @author Yax
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Cajero extends JFrame {

	JTextField pantalla;
	double resultado;
	String operacion;
	JPanel panelNumeros, panelOperaciones;
	boolean nuevaOperacion = true;
        
	public Cajero() {
		super();
		setSize(400, 400);
		setTitle("Cajero");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
                setLocationRelativeTo(null);

		JPanel panel = (JPanel)this.getContentPane();
		panel.setLayout(new BorderLayout());

		panelOperaciones = new JPanel();
		panelOperaciones.setLayout(new GridLayout(4, 6));
		panelOperaciones.setBorder(new EmptyBorder(10, 10, 10, 10));
                panelOperaciones.setBackground(new java.awt.Color(236, 255, 231));
                
		nuevoBotonOperacion("Crear cuenta");
		nuevoBotonOperacion("Abonar");
		nuevoBotonOperacion("Retirar");
		nuevoBotonOperacion("Consultar");

		panel.add("Center", panelOperaciones);

		validate();
	}
	private void nuevoBotonOperacion(String operacion) {
		JButton btn = new JButton(operacion);
                btn.setForeground(Color.black);
                btn.setFont(new Font("Arial", 0, 30));
                btn.setOpaque(false);
                btn.setContentAreaFilled(false);
                Border cool = new LineBorder((new java.awt.Color(51, 255, 189)), 1);
                btn.setBorder(cool);
                
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent evt) {
				JButton btn = (JButton) evt.getSource();
				operacionPulsado(btn.getText());
			}
		});

		panelOperaciones.add(btn);
	}
	private void operacionPulsado(String tecla) {
		if (tecla.equals("Crear cuenta")) {
			
		} else if (tecla.equals("Abonar")) {
			dispose();
                        Abonos jeje= new Abonos();
                        jeje.setVisible(true);
		} else if(tecla.equals("Retirar")) {
			dispose();
                        Retiros jiji= new Retiros();
                        jiji.setVisible(true);
		} else {
                
                }
		nuevaOperacion = true;
	}
}