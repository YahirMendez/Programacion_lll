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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	
	BotonesGatoRaton[] tablero = new BotonesGatoRaton[9];
	String turno="X";
	JLabel jugador_X;
	JLabel jugador_O;
	int puntosX=0;
	int puntosO=0;
	
	
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
		label_tiempo.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel_tiempo.add(label_tiempo);
		
		JPanel panel_puntos = new JPanel();
		panel_puntos.setBackground(new Color(192, 192, 192));
		panel_norte.add(panel_puntos, BorderLayout.SOUTH);
		panel_puntos.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 255));
		panel_puntos.add(panel);
		
		jugador_O = new JLabel("O:0");
		jugador_O.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel.add(jugador_O);
		jugador_O.setBackground(new Color(255, 0, 0));
		jugador_O.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_puntos.add(panel_1);
		
		jugador_X = new JLabel("X:0");
		jugador_X.setFont(new Font("Segoe UI", Font.BOLD, 20));
		panel_1.add(jugador_X);
		jugador_X.setBackground(new Color(0, 0, 255));
		jugador_X.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_sur = new JPanel();
		panel_sur.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_sur, BorderLayout.SOUTH);
		
		JButton boton_reiniciar = new JButton("Reiniciar");
		boton_reiniciar.setFont(new Font("Segoe UI", Font.BOLD, 20));
		boton_reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		boton_reiniciar.setBackground(new Color(255, 255, 255));
		panel_sur.add(boton_reiniciar);
		
		JPanel panel_centro = new JPanel();
		panel_centro.setBackground(new Color(128, 128, 128));
		contentPane.add(panel_centro, BorderLayout.CENTER);
		panel_centro.setLayout(new GridLayout(3, 3, 0, 0));
		
		for (int i=0; i<9; i++) {
			tablero[i] = new BotonesGatoRaton(i);
			panel_centro.add(tablero[i]);
			tablero[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					BotonesGatoRaton boton = (BotonesGatoRaton) e.getSource();
					jugar(boton);
				}
			});
		}
	}
	
	public void jugar(BotonesGatoRaton boton) {
		if (boton.getEstado().equals("")) {
			boton.setText(turno);
			boton.setEstado(turno);
			boton.setEnabled(false);
			
			if (verificarGanador()) {
				return;
			}
			
			if (empate()) {
				javax.swing.JOptionPane.showMessageDialog(this, "empate");
				reiniciar();
				return;
			}
			
			if (turno.equals("X")) {
				turno="O";
			}
			else {
				turno="X";
			}
		}
	}
	
	public  boolean verificarGanador() {
		int[][] lineas = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};
	
		for(int i=0; i<lineas.length; i++) {
			String primero = tablero[lineas[i][0]].getEstado();
			String segundo = tablero[lineas[i][1]].getEstado();
			String tercero = tablero[lineas[i][2]].getEstado();
			
			if (!primero.equals("") && primero.equals(segundo) && primero.equals(tercero)) {
				javax.swing.JOptionPane.showMessageDialog(this, "gano: "+ primero);
				
				if (primero.equals("X")) {
					puntosX++;
				}
				else {
					puntosO++;
				}
				marcador();
				reiniciar();
				return true;
			}
		}
		return false;
	}
	
	public void marcador() {
		jugador_X.setText("X: "+ puntosX);
		jugador_O.setText("O: "+ puntosO);
	}
	
	public boolean empate() {
		for (int i=0; i<9; i++) {
			if (tablero[i].getEstado().equals("")) {
				return false;
			}
		}
		return true;
	}
	
	public void reiniciar() {
		for (int i=0; i<9; i++) {
			tablero[i].setText("");
			tablero[i].setEstado("");
			tablero[i].setEnabled(true);
		}
	}
}
