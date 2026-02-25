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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	public Ventana(){
		
		this.setVisible(true);
		this.setSize(1200,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("hola");
		this.setBackground(Color.black);
		//this.setLocation(0, 0);
		this.setLayout(null);
		
		//ccontenedor login
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(500,500);
		contenedor.setLocation(0, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
	
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200, 50);
		title_login.setOpaque(false);
		title_login.setLocation(145, 20);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JLabel labelUsername = new JLabel();
		labelUsername.setText("Usuario: ");
		labelUsername.setSize(220, 50);
		labelUsername.setOpaque(false);
		labelUsername.setLocation(30, 80);
		labelUsername.setBackground(Color.white);
		labelUsername.setFont(new Font("Arial",Font.BOLD,22));
		labelUsername.setForeground(Color.blue);
		labelUsername.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(labelUsername);
		
		JTextField username = new JTextField();
		username.setSize(300, 50);
		username.setLocation(85,120);
		username.setFont(new Font("Arial",Font.BOLD,22));
		username.setForeground(Color.black);
		username.setHorizontalAlignment(JLabel.CENTER);
		username.setBackground(Color.decode("#D4EFFF"));
		username.setBorder(BorderFactory.createLineBorder(Color.blue));
		contenedor.add(username);
		
		JLabel labelPassword = new JLabel();
		labelPassword.setText("Contraseña: ");
		labelPassword.setSize(200, 50);
		labelPassword.setOpaque(false);
		labelPassword.setLocation(60, 180);
		labelPassword.setBackground(Color.white);
		labelPassword.setFont(new Font("Arial",Font.BOLD,22));
		labelPassword.setForeground(Color.blue);
		labelPassword.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(labelPassword);
		
		JPasswordField password = new JPasswordField();
		password.setSize(300, 50);
		password.setLocation(85,220);
		password.setFont(new Font("Arial",Font.BOLD,22));
		password.setForeground(Color.black);
		password.setHorizontalAlignment(JLabel.CENTER);
		password.setBackground(Color.decode("#D4EFFF"));
		password.setBorder(BorderFactory.createLineBorder(Color.blue));
		contenedor.add(password);
	
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(140, 380);
		acceder.setSize(200, 50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		acceder.setBackground(Color.blue);
		acceder.setForeground(Color.white);
		contenedor.add(acceder);
		
		JCheckBox checkbox = new JCheckBox();
		checkbox.setText("Recordarme");
		checkbox.setOpaque(false);
		checkbox.setBounds(85, 290, 100, 20);
		checkbox.setBackground(Color.white);
		contenedor.add(checkbox);
		
		JLabel labelRPassword = new JLabel();
		labelRPassword.setText("¿Olvido su contraseña?");
		labelRPassword.setSize(200, 20);
		labelRPassword.setOpaque(false);
		labelRPassword.setLocation(230, 290);
		labelRPassword.setBackground(Color.white);
		labelRPassword.setFont(new Font("Arial",Font.BOLD,12));
		labelRPassword.setForeground(Color.blue);
		labelRPassword.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(labelRPassword);
		
		contenedor.repaint();
		contenedor.revalidate();
		
		//contenedor para el registro
		JPanel register_container = new JPanel();
		register_container.setSize(500,500);
		register_container.setLocation(600, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#D4EFFF"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel user_tag = new JLabel();
		user_tag.setText("Usuario: ");
		user_tag.setSize(220, 50);
		user_tag.setOpaque(false);
		user_tag.setLocation(30, 20);
		user_tag.setBackground(Color.white);
		user_tag.setFont(new Font("Arial",Font.BOLD,22));
		user_tag.setForeground(Color.blue);
		user_tag.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(user_tag);
		
		JTextField username2 = new JTextField();
		username2.setSize(300, 50);
		username2.setLocation(85,60);
		username2.setFont(new Font("Arial",Font.BOLD,22));
		username2.setForeground(Color.black);
		username2.setHorizontalAlignment(JLabel.CENTER);
		username2.setBackground(Color.decode("#D4EFFF"));
		username2.setBorder(BorderFactory.createLineBorder(Color.blue));
		register_container.add(username2);
		
		JLabel bio_tag = new JLabel("Biografia");
		bio_tag.setBounds(100, 110, 250, 40);
		bio_tag.setBackground(Color.white);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(false);
		bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		bio_tag.setForeground(Color.blue);
		register_container.add(bio_tag);
		
		JTextArea bio =new JTextArea();
		bio.setBounds(85, 150, 300, 60);
		bio.setBackground(Color.decode("#D4EFFF"));
		bio.setBorder(BorderFactory.createLineBorder(Color.blue));
		register_container.add(bio);
		
		JLabel preferencias_tag = new JLabel("Preferencias");
		preferencias_tag.setBounds(100, 210, 250, 40);
		preferencias_tag.setBackground(Color.white);
		preferencias_tag.setHorizontalAlignment(JLabel.CENTER);
		preferencias_tag.setOpaque(false);
		preferencias_tag.setFont(new Font("Arial",Font.BOLD,22));
		preferencias_tag.setForeground(Color.blue);
		register_container.add(preferencias_tag);
		
		JCheckBox Sweet_option = new JCheckBox("Dulce");
		Sweet_option.setBounds(85, 260, 100, 20);
		Sweet_option.setOpaque(false);
		register_container.add(Sweet_option);
		
		JCheckBox Salty_option = new JCheckBox("Salado");
		Salty_option.setBounds(200, 260, 100, 20);
		Salty_option.setOpaque(false);;
		register_container.add(Salty_option);
	
		JCheckBox healthy_option = new JCheckBox("Saludable");
		healthy_option.setBounds(300, 260, 100, 20);
		healthy_option.setOpaque(false);
		register_container.add(healthy_option);
		
		JLabel terms_tag = new JLabel("Terminos");
		terms_tag.setBounds(100, 290, 250, 40);
		terms_tag.setBackground(Color.white);
		terms_tag.setHorizontalAlignment(JLabel.CENTER);
		terms_tag.setOpaque(false);
		terms_tag.setFont(new Font("Arial",Font.BOLD,22));
		terms_tag.setForeground(Color.blue);
		register_container.add(terms_tag);
		
		JRadioButton accept_terms = new JRadioButton("acepto terminos");
		accept_terms.setBounds(85, 340, 150, 20);
		accept_terms.setOpaque(false);
		register_container.add(accept_terms);
		
		
		JRadioButton reject_terms = new JRadioButton("rechazo terminos");
		reject_terms.setBounds(260, 340, 150, 20);
		reject_terms.setOpaque(false);
		register_container.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);
		
		String [] colonias = {"camino real", "la fuente", "Calafia"};
		
		JComboBox list = new JComboBox(colonias);
		list.setBounds(160, 380, 150, 20);
		list.setBackground(Color.decode("#D4EFFF"));
		list.setBorder(BorderFactory.createLineBorder(Color.blue));
		register_container.add(list);
		
		JButton create_account = new JButton();
		create_account.setText("Crear cuenta");
		create_account.setLocation(130, 420);
		create_account.setSize(200, 50);
		create_account.setFont(new Font("Arial",Font.BOLD,22));
		create_account.setBackground(Color.blue);
		create_account.setForeground(Color.white);
		register_container.add(create_account);
		
		register_container.repaint();
		
	}

}
