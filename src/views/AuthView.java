package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controllers.HomeController;
import models.AuthModel;

public class AuthView {
	
	public AuthView() {
		
		
	}
	
	public void loginView() {
		JFrame ventana = new JFrame();
		ventana.setSize(1200,700);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(800,800));
		ventana.setTitle("hola");
		
		ImageIcon imagenVentana = new ImageIcon("iconoVentana.png");
		Image img = imagenVentana.getImage();
		ventana.setIconImage(img);
		
		ventana.setBackground(Color.gray);
		ventana.getContentPane().setBackground(Color.decode("#AFB593"));
		//this.setLocation(0, 0);
		ventana.setLayout(null);
	
		
		ventana.setVisible(true);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1150,610);
		contenedor.setLocation(20, 0);
		contenedor.setLayout(null);
		ventana.add(contenedor);
		
		ImageIcon imagenSilueta = new ImageIcon("imagenSilueta.png");
		JLabel labelSilueta = new JLabel();
		labelSilueta.setBounds(200, 10, 90, 90);
		labelSilueta.setIcon(new ImageIcon(imagenSilueta.getImage().getScaledInstance(labelSilueta.getHeight(), labelSilueta.getWidth(), Image.SCALE_SMOOTH)));
		contenedor.add(labelSilueta);
		
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200, 50);
		title_login.setOpaque(false);
		title_login.setLocation(145, 100);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JLabel labelUsername = new JLabel();
		labelUsername.setText("Usuario: ");
		labelUsername.setSize(220, 50);
		labelUsername.setOpaque(false);
		labelUsername.setLocation(30, 140);
		labelUsername.setBackground(Color.white);
		labelUsername.setFont(new Font("Arial",Font.BOLD,22));
		labelUsername.setForeground(Color.blue);
		labelUsername.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(labelUsername);
		
		ImageIcon imagenUsuario = new ImageIcon("imagenSilueta.png");
		JLabel labelUsuario = new JLabel();
		labelUsuario.setBounds(20, 180, 50, 50);
		labelUsuario.setIcon(new ImageIcon(imagenSilueta.getImage().getScaledInstance(labelUsuario.getHeight(), labelUsuario.getWidth(), Image.SCALE_SMOOTH)));
		contenedor.add(labelUsuario);
		
		JTextField username = new JTextField();
		username.setSize(300, 50);
		username.setLocation(85,180);
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
		labelPassword.setLocation(60, 240);
		labelPassword.setBackground(Color.white);
		labelPassword.setFont(new Font("Arial",Font.BOLD,22));
		labelPassword.setForeground(Color.blue);
		labelPassword.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(labelPassword);
		
		ImageIcon imagenPassword= new ImageIcon("imagenPassword.png");
		JLabel IMG_labelPassword = new JLabel();
		IMG_labelPassword.setBounds(20, 280, 50, 50);
		IMG_labelPassword.setIcon(new ImageIcon(imagenPassword.getImage().getScaledInstance(IMG_labelPassword.getHeight(), IMG_labelPassword.getWidth(), Image.SCALE_SMOOTH)));
		contenedor.add(IMG_labelPassword);
		
		JPasswordField password = new JPasswordField();
		password.setSize(300, 50);
		password.setLocation(85,280);
		password.setFont(new Font("Arial",Font.BOLD,22));
		password.setForeground(Color.black);
		password.setHorizontalAlignment(JLabel.CENTER);
		password.setBackground(Color.decode("#D4EFFF"));
		password.setBorder(BorderFactory.createLineBorder(Color.blue));
		contenedor.add(password);
	
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(140, 400);
		acceder.setSize(200, 50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		acceder.setBackground(Color.blue);
		acceder.setForeground(Color.white);
		contenedor.add(acceder);
		
		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username_val = username.getText();
				String password_val = new String(password.getPassword());
				
				if (username_val.equals("") || username_val.contains(" ")) {
					username.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else {
					username.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}
				
				if (password_val.equals("") || password_val.length()<6 || password_val.contains(" ")) {
					password.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else {
					password.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}
				
				AuthModel model = new AuthModel();
				
				if (model.access(username_val, password_val)) {
					JOptionPane.showMessageDialog(null, "Bienvenido "+username_val);
					ventana.dispose();
					HomeController hc = new HomeController();
					hc.showHome();
				}
				else {
					JOptionPane.showMessageDialog(null, "Tu usuario o contraseña tienen un error");
				}
				
			}
		});
		
		JCheckBox checkbox = new JCheckBox();
		checkbox.setText("Recordarme");
		checkbox.setOpaque(false);
		checkbox.setBounds(85, 350, 100, 20);
		checkbox.setBackground(Color.white);
		contenedor.add(checkbox);
		
		JLabel labelRPassword = new JLabel();
		labelRPassword.setText("¿Olvido su contraseña?");
		labelRPassword.setSize(200, 20);
		labelRPassword.setOpaque(false);
		labelRPassword.setLocation(230, 350);
		labelRPassword.setBackground(Color.white);
		labelRPassword.setFont(new Font("Arial",Font.BOLD,12));
		labelRPassword.setForeground(Color.blue);
		labelRPassword.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(labelRPassword);
		
		JButton registro = new JButton();
		registro.setText("¿Aun no tienes una cuenta?");
		registro.setLocation(70, 500);
		registro.setSize(350, 50);
		registro.setFont(new Font("Arial",Font.BOLD,22));
		registro.setBackground(Color.blue);
		registro.setForeground(Color.white);
		contenedor.add(registro);
		
		registro.addActionListener(e ->{
			ventana.dispose();
			registerView();
		});
		
		contenedor.repaint();
		contenedor.revalidate();	
	}
	
	public void registerView() {
		JFrame ventana = new JFrame();
		ventana.setSize(1200,700);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(800,800));
		ventana.setTitle("hola");
		
		ImageIcon imagenVentana = new ImageIcon("iconoVentana.png");
		Image img = imagenVentana.getImage();
		ventana.setIconImage(img);
		
		ventana.setBackground(Color.gray);
		ventana.getContentPane().setBackground(Color.decode("#AFB593"));
		//this.setLocation(0, 0);
		ventana.setLayout(null);
	
		
		ventana.setVisible(true);
		
		JPanel register_container = new JPanel();
		register_container.setSize(500,600);
		register_container.setLocation(600, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#D4EFFF"));
		register_container.setLayout(null);
		ventana.add(register_container);
		
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
		Sweet_option.setBounds(85, 260, 80, 20);
		Sweet_option.setOpaque(false);
		register_container.add(Sweet_option);
		
		JCheckBox Salty_option = new JCheckBox("Salado");
		Salty_option.setBounds(190, 260, 80, 20);
		Salty_option.setOpaque(false);;
		register_container.add(Salty_option);
	
		JCheckBox healthy_option = new JCheckBox("Saludable");
		healthy_option.setBounds(295, 260, 90, 20);
		healthy_option.setOpaque(false);
		register_container.add(healthy_option);
		
		Sweet_option.setBorderPainted(true);
		Salty_option.setBorderPainted(true);
		healthy_option.setBorderPainted(true);
		
		
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
		accept_terms.setBorderPainted(true);
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
		
		JButton cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setLocation(150, 500);
		cancelar.setSize(150, 50);
		cancelar.setFont(new Font("Arial",Font.BOLD,22));
		cancelar.setBackground(Color.blue);
		cancelar.setForeground(Color.white);
		register_container.add(cancelar);
		
		cancelar.addActionListener(e ->{
			ventana.dispose();
			loginView();
		});
		
		create_account.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username_val = username2.getText();
				String bio_val = bio.getText();
				
				String correct_user = "lolo44";
				
				if (username_val.equals("") || username_val.contains(" ")) {
					username2.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else {
					username2.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}
				
				if(bio_val.equals("")) {
					bio.setBorder(BorderFactory.createLineBorder(Color.blue));
				}
				else if (bio_val.length()<5) {
					bio.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else {
					bio.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}
				
				if (!Sweet_option.isSelected() && !Salty_option.isSelected() && !healthy_option.isSelected()) {
					Sweet_option.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
					Salty_option.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
					healthy_option.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else {
					Sweet_option.setBorder(BorderFactory.createLineBorder(Color.blue));
					Salty_option.setBorder(BorderFactory.createLineBorder(Color.blue));
					healthy_option.setBorder(BorderFactory.createLineBorder(Color.blue));
				}
				
				if (!accept_terms.isSelected()) {
					accept_terms.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				}
				else {
					accept_terms.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
				}
				
				if (username_val.equals(correct_user)) {
					JOptionPane.showMessageDialog(null, "Bienvenido "+correct_user);
				}
				else {
					JOptionPane.showMessageDialog(null, "Tu usuario o contraseña tienen un error");
				}
				
				}
		});
		
		register_container.repaint();
		
	}

	

}
