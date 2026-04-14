package programacion3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class GatoRaton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GatoRaton frame = new GatoRaton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GatoRaton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_norte = new JPanel();
		panel_norte.setBackground(new Color(128, 128, 128));
		contentPane.add(panel_norte, BorderLayout.NORTH);
		panel_norte.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_tiempo = new JPanel();
		panel_tiempo.setBackground(new Color(192, 192, 192));
		panel_norte.add(panel_tiempo, BorderLayout.NORTH);
		
		JLabel label_tiempo = new JLabel("0:00");
		panel_tiempo.add(label_tiempo);
		
		JPanel panel_puntos = new JPanel();
		panel_puntos.setBackground(new Color(192, 192, 192));
		panel_norte.add(panel_puntos, BorderLayout.SOUTH);
		panel_puntos.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel_puntos.add(panel);
		
		JLabel jugador_ = new JLabel("O:0");
		panel.add(jugador_);
		jugador_.setBackground(new Color(255, 0, 0));
		jugador_.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_puntos.add(panel_1);
		
		JLabel jugador_X = new JLabel("X:0");
		panel_1.add(jugador_X);
		jugador_X.setBackground(new Color(0, 0, 255));
		jugador_X.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_sur = new JPanel();
		panel_sur.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_sur, BorderLayout.SOUTH);
		
		JButton boton_reiniciar = new JButton("Reiniciar");
		boton_reiniciar.setBackground(new Color(255, 255, 255));
		panel_sur.add(boton_reiniciar);
		
		JPanel panel_centro = new JPanel();
		panel_centro.setBackground(new Color(128, 128, 128));
		contentPane.add(panel_centro, BorderLayout.CENTER);
		panel_centro.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		panel_centro.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		panel_centro.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		panel_centro.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		panel_centro.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		panel_centro.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		panel_centro.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		panel_centro.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		panel_centro.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		panel_centro.add(btnNewButton_8);

	}

}
