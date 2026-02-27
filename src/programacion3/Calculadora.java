package programacion3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	public Calculadora() {
		
		this.setVisible(true);
		this.setSize(610,640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("calculadora");
		this.setBackground(Color.black);
		this.getContentPane().setBackground(Color.gray);
		//this.setLocation(0, 0);
		this.setLayout(null);
		this.calculadora();
		
		
	}
	 
	public void calculadora() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.black);
		contenedor.setSize(600,600);
		contenedor.setLocation(0, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JTextField pantalla = new JTextField("1 + 2 = 3");
		pantalla.setSize(600, 100);
		pantalla.setLocation(0,0);
		pantalla.setFont(new Font("Arial",Font.BOLD,22));
		pantalla.setForeground(Color.white);
		pantalla.setHorizontalAlignment(JLabel.CENTER);
		pantalla.setBackground(Color.black);
		pantalla.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(pantalla);
		
		JButton ce = new JButton("CE");
		ce.setLocation(0, 100);
		ce.setSize(150, 100);
		ce.setFont(new Font("Arial",Font.BOLD,22));
		ce.setBackground(Color.gray);
		ce.setForeground(Color.black);
		ce.setBorder(BorderFactory.createLineBorder(Color.black));
		contenedor.add(ce);
		
		JButton espacio_blanco = new JButton("");
		espacio_blanco.setLocation(150, 100);
		espacio_blanco.setSize(450, 100);
		espacio_blanco.setFont(new Font("Arial",Font.BOLD,22));
		espacio_blanco.setBackground(Color.gray);
		espacio_blanco.setForeground(Color.black);
		espacio_blanco.setBorder(BorderFactory.createLineBorder(Color.black));
		contenedor.add(espacio_blanco);
		
		JButton division = new JButton("/");
		division.setLocation(450, 200);
		division.setSize(150, 100);
		division.setFont(new Font("Arial",Font.BOLD,22));
		division.setBackground(Color.orange);
		division.setForeground(Color.white);
		division.setBorder(BorderFactory.createLineBorder(Color.black));
		contenedor.add(division);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.setLocation(450, 300);
		multiplicacion.setSize(150, 100);
		multiplicacion.setFont(new Font("Arial",Font.BOLD,22));
		multiplicacion.setBackground(Color.orange);
		multiplicacion.setForeground(Color.white);
		multiplicacion.setBorder(BorderFactory.createLineBorder(Color.black));
		contenedor.add(multiplicacion);
		
		JButton suma = new JButton("+");
		suma.setLocation(450, 500);
		suma.setSize(150, 100);
		suma.setFont(new Font("Arial",Font.BOLD,22));
		suma.setBackground(Color.orange);
		suma.setForeground(Color.white);
		suma.setBorder(BorderFactory.createLineBorder(Color.black));
		contenedor.add(suma);
		
		JButton resta = new JButton("-");
		resta.setLocation(450, 400);
		resta.setSize(150, 100);
		resta.setFont(new Font("Arial",Font.BOLD,22));
		resta.setBackground(Color.orange);
		resta.setForeground(Color.white);
		resta.setBorder(BorderFactory.createLineBorder(Color.black));
		contenedor.add(resta);
		
		JButton igual = new JButton("=");
		igual.setLocation(300, 500);
		igual.setSize(150, 100);
		igual.setFont(new Font("Arial",Font.BOLD,22));
		igual.setBackground(Color.orange);
		igual.setForeground(Color.white);
		igual.setBorder(BorderFactory.createLineBorder(Color.black));
		contenedor.add(igual);
		
		JButton punto = new JButton(".");
		punto.setLocation(150, 500);
		punto.setSize(150, 100);
		punto.setFont(new Font("Arial",Font.BOLD,22));
		punto.setBackground(Color.black);
		punto.setForeground(Color.white);
		punto.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(punto);
		
		JButton cero = new JButton("0");
		cero.setLocation(0, 500);
		cero.setSize(150, 100);
		cero.setFont(new Font("Arial",Font.BOLD,22));
		cero.setBackground(Color.black);
		cero.setForeground(Color.white);
		cero.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(cero);
		
		JButton uno = new JButton("1");
		uno.setLocation(0, 400);
		uno.setSize(150, 100);
		uno.setFont(new Font("Arial",Font.BOLD,22));
		uno.setBackground(Color.black);
		uno.setForeground(Color.white);
		uno.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(uno);
		
		JButton dos = new JButton("2");
		dos.setLocation(150, 400);
		dos.setSize(150, 100);
		dos.setFont(new Font("Arial",Font.BOLD,22));
		dos.setBackground(Color.black);
		dos.setForeground(Color.white);
		dos.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(dos);
		
		JButton tres = new JButton("3");
		tres.setLocation(300, 400);
		tres.setSize(150, 100);
		tres.setFont(new Font("Arial",Font.BOLD,22));
		tres.setBackground(Color.black);
		tres.setForeground(Color.white);
		tres.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(tres);
		
		JButton cuatro = new JButton("4");
		cuatro.setLocation(0, 300);
		cuatro.setSize(150, 100);
		cuatro.setFont(new Font("Arial",Font.BOLD,22));
		cuatro.setBackground(Color.black);
		cuatro.setForeground(Color.white);
		cuatro.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.setLocation(150, 300);
		cinco.setSize(150, 100);
		cinco.setFont(new Font("Arial",Font.BOLD,22));
		cinco.setBackground(Color.black);
		cinco.setForeground(Color.white);
		cinco.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(cinco);
		
		JButton seis = new JButton("6");
		seis.setLocation(300, 300);
		seis.setSize(150, 100);
		seis.setFont(new Font("Arial",Font.BOLD,22));
		seis.setBackground(Color.black);
		seis.setForeground(Color.white);
		seis.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(seis);
		
		JButton siete = new JButton("7");
		siete.setLocation(0, 200);
		siete.setSize(150, 100);
		siete.setFont(new Font("Arial",Font.BOLD,22));
		siete.setBackground(Color.black);
		siete.setForeground(Color.white);
		siete.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.setLocation(150, 200);
		ocho.setSize(150, 100);
		ocho.setFont(new Font("Arial",Font.BOLD,22));
		ocho.setBackground(Color.black);
		ocho.setForeground(Color.white);
		ocho.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.setLocation(300, 200);
		nueve.setSize(150, 100);
		nueve.setFont(new Font("Arial",Font.BOLD,22));
		nueve.setBackground(Color.black);
		nueve.setForeground(Color.white);
		nueve.setBorder(BorderFactory.createLineBorder(Color.white));
		contenedor.add(nueve);
		
		
		
		
		contenedor.repaint();
	}
		
}
