package programacion3;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//public class Ventana extends JFrame {
public class Ventana extends JFrame implements ActionListener {
	
	public Ventana() {
		
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("hola");
		
		ImageIcon imagenVentana = new ImageIcon("iconoVentana.png");
		Image img = imagenVentana.getImage();
		this.setIconImage(img);
		
		this.setBackground(Color.gray);
		this.getContentPane().setBackground(Color.decode("#AFB593"));
		//this.setLocation(0, 0);
		this.setLayout(null);
	
		

		
		this.menu();
		this.login();
		this.router("login");
		//this.registro();
		
		this.setVisible(true);
		
	

	}
	
	
	public void login2() {

		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.white);
		//contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1200,600);
		contenedor.setLocation(0, 0);
		contenedor.setLayout(null);
		contenedor.setBounds(0, 0, 1200, 600);
		this.add(contenedor);
		
		ImageIcon imagenFondo = new ImageIcon("imagenFondo.png");
		JLabel labelFondo = new JLabel();
		labelFondo.setOpaque(false);
		labelFondo.setSize(1200,600);
		labelFondo.setLocation(0, 0);
		labelFondo.setLayout(null);
		labelFondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(labelFondo.getWidth(),labelFondo.getHeight(), Image.SCALE_SMOOTH)));
		contenedor.add(labelFondo);
		
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200, 50);
		title_login.setOpaque(false);
		title_login.setLocation(470, 5);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,32));
		title_login.setForeground(Color.white);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		labelFondo.add(title_login);
		
		ImageIcon fondo2 = new ImageIcon("imagenFondo.png");
		JLabel contenedor2 = new JLabel();
		contenedor2.setOpaque(false);
		contenedor2.setSize(800,400);
		contenedor2.setLocation(200, 60);
		contenedor2.setLayout(null);
		contenedor2.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(contenedor2.getWidth(),contenedor2.getHeight(), Image.SCALE_SMOOTH)));
		contenedor2.setBorder(BorderFactory.createLineBorder(Color.white));
		labelFondo.add(contenedor2);
		
		JLabel MyAccount = new JLabel();
		MyAccount.setText("Mi cuenta");
		MyAccount.setSize(200, 50);
		MyAccount.setOpaque(false);
		MyAccount.setLocation(270, 10);
		MyAccount.setBackground(Color.white);
		MyAccount.setFont(new Font("Arial",Font.BOLD,32));
		MyAccount.setForeground(Color.decode("#efb810"));
		MyAccount.setHorizontalAlignment(JLabel.CENTER);
		contenedor2.add(MyAccount);
		
		JLabel usuario = new JLabel();
		usuario.setText("Ingresa tu usuario");
		usuario.setSize(300, 50);
		usuario.setOpaque(false);
		usuario.setLocation(50, 70);
		usuario.setBackground(Color.white);
		usuario.setFont(new Font("Arial",Font.ITALIC,20));
		usuario.setForeground(Color.white);
		usuario.setHorizontalAlignment(JLabel.CENTER);
		contenedor2.add(usuario);
		
		ImageIcon imagenUsuario = new ImageIcon("imagenUser.png");
		JLabel labelUsuario = new JLabel();
		labelUsuario.setBounds(55, 120, 50, 50);
		labelUsuario.setIcon(new ImageIcon(imagenUsuario.getImage().getScaledInstance(labelUsuario.getHeight(), labelUsuario.getWidth(), Image.SCALE_SMOOTH)));
		contenedor2.add(labelUsuario);
		
		JTextField username = new JTextField();
		username.setSize(600, 50);
		username.setLocation(110,120);
		username.setFont(new Font("Arial",Font.BOLD,22));
		username.setForeground(Color.black);
		username.setHorizontalAlignment(JLabel.CENTER);
		username.setBackground(Color.white);
		username.setBorder(BorderFactory.createLineBorder(Color.black));
		contenedor2.add(username);
		
		JLabel contraseña = new JLabel();
		contraseña.setText("Ingresa tu contraseña");
		contraseña.setSize(300, 50);
		contraseña.setOpaque(false);
		contraseña.setLocation(70, 180);
		contraseña.setBackground(Color.white);
		contraseña.setFont(new Font("Arial",Font.ITALIC,20));
		contraseña.setForeground(Color.white);
		contraseña.setHorizontalAlignment(JLabel.CENTER);
		contenedor2.add(contraseña);
		
		ImageIcon imagenContraseña = new ImageIcon("imagenPassword.png");
		JLabel labelContraseña = new JLabel();
		labelContraseña.setBounds(55, 230, 50, 50);
		labelContraseña.setIcon(new ImageIcon(imagenContraseña.getImage().getScaledInstance(labelContraseña.getHeight(), labelContraseña.getWidth(), Image.SCALE_SMOOTH)));
		contenedor2.add(labelContraseña);
		
		JTextField password = new JTextField();
		password.setSize(600, 50);
		password.setLocation(110,230);
		password.setFont(new Font("Arial",Font.BOLD,22));
		password.setForeground(Color.black);
		password.setHorizontalAlignment(JLabel.CENTER);
		password.setBackground(Color.white);
		password.setBorder(BorderFactory.createLineBorder(Color.black));
		contenedor2.add(password);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(280, 310);
		acceder.setSize(200, 50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		acceder.setBackground(Color.decode("#efb810"));
		acceder.setForeground(Color.white);
		acceder.setBorder(BorderFactory.createLineBorder(Color.white));
		acceder.addActionListener(this);
		acceder.addMouseListener (new java.awt.event.MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				acceder.setBackground(Color.decode("#C8950C"));
				super.mouseEntered(e);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				acceder.setBackground(Color.decode("#efb810"));
				super.mouseExited(e);
			}
		});
		contenedor2.add(acceder);
		
		JLabel question = new JLabel();
		question.setText("¿No tienes una cuenta?");
		question.setSize(300, 30);
		question.setOpaque(false);
		question.setLocation(430, 460);
		question.setBackground(Color.white);
		question.setFont(new Font("Arial",Font.ITALIC,14));
		question.setForeground(Color.white);
		question.setHorizontalAlignment(JLabel.CENTER);
		labelFondo.add(question);
		
		JButton registrarse = new JButton();
		registrarse.setText("Registrarse");
		registrarse.setLocation(480, 495);
		registrarse.setSize(200, 50);
		registrarse.setFont(new Font("Arial",Font.BOLD,22));
		registrarse.setBackground(Color.decode("#efb810"));
		registrarse.setForeground(Color.white);
		registrarse.setBorder(BorderFactory.createLineBorder(Color.white));
		registrarse.addMouseListener (new java.awt.event.MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				registrarse.setBackground(Color.decode("#C8950C"));
				super.mouseEntered(e);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				registrarse.setBackground(Color.decode("#efb810"));
				super.mouseExited(e);
			}
		});
		labelFondo.add(registrarse);
		
		contenedor.repaint();
		contenedor.revalidate();	
		
	
	
	}
	 
	public void login() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1150,610);
		contenedor.setLocation(20, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
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
				
				String correct_user = "lolo44";
				String correct_password = "123456";
				
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
				
				if (username_val.equals(correct_user) && password_val.equals(correct_password)) {
					JOptionPane.showMessageDialog(null, "Bienvenido "+correct_user);
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
			this.router("registro");
		});
		
		contenedor.repaint();
		contenedor.revalidate();	
	}

	public void recovery_password() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1150,610);
		contenedor.setLocation(20, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
		JLabel title_login = new JLabel();
		title_login.setText("Recuperando  contraseña...");
		title_login.setSize(500, 50);
		title_login.setOpaque(false);
		title_login.setLocation(300, 300);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);


		contenedor.repaint();
		contenedor.revalidate();	
	}

	public void p1_menu() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1150,610);
		contenedor.setLocation(20, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
		JLabel title_login = new JLabel();
		title_login.setText("¿Cómo crear un usuario?");
		title_login.setSize(500, 50);
		title_login.setOpaque(false);
		title_login.setLocation(300, 300);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);


		contenedor.repaint();
		contenedor.revalidate();	
	}
	public void p2_menu() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1150,610);
		contenedor.setLocation(20, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
		JLabel title_login = new JLabel();
		title_login.setText("¿Cómo acceder al sistema?");
		title_login.setSize(500, 50);
		title_login.setOpaque(false);
		title_login.setLocation(300, 300);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);


		contenedor.repaint();
		contenedor.revalidate();	
	}
	public void p3_menu() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1150,610);
		contenedor.setLocation(20, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
		JLabel title_login = new JLabel();
		title_login.setText("¿Qué pasa si olvidé mi contraseña?");
		title_login.setSize(500, 50);
		title_login.setOpaque(false);
		title_login.setLocation(300, 300);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);


		contenedor.repaint();
		contenedor.revalidate();	
	}

	public void Alta_menu() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1150,610);
		contenedor.setLocation(20, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
		JLabel title_login = new JLabel();
		title_login.setText("Alta");
		title_login.setSize(500, 50);
		title_login.setOpaque(false);
		title_login.setLocation(300, 300);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);


		contenedor.repaint();
		contenedor.revalidate();	
	}
	public void Baja_menu() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1150,610);
		contenedor.setLocation(20, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
		JLabel title_login = new JLabel();
		title_login.setText("Baja");
		title_login.setSize(500, 50);
		title_login.setOpaque(false);
		title_login.setLocation(300, 300);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);


		contenedor.repaint();
		contenedor.revalidate();	
	}
	public void Consultar_menu() {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		//contenedor.setBackground(Color.white);
		contenedor.setBackground(Color.decode("#D4EFFF"));
		contenedor.setSize(1150,610);
		contenedor.setLocation(20, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
		JLabel title_login = new JLabel();
		title_login.setText("Consultar");
		title_login.setSize(500, 50);
		title_login.setOpaque(false);
		title_login.setLocation(300, 300);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);


		contenedor.repaint();
		contenedor.revalidate();	
	}
	public void registro() {
		JPanel register_container = new JPanel();
		register_container.setSize(500,600);
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
			this.router("login");
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
	
	public void users() {
		JPanel users = new JPanel();
		users.setSize(1000, 500);
		users.setLocation(100, 50);
		users.setBackground(Color.decode("#D4EFFF"));
		users.setLayout(null);
		this.add(users);
		
		JLabel users_title = new JLabel("USUARIOS");	
		users_title.setBounds(400, 50, 150, 40);
		users_title.setOpaque(false);
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setFont(new Font("Arial",Font.BOLD,22));
		users.add(users_title);
		
		JButton export = new JButton("Exportar");
		export.setBounds(30, 120, 150, 40);
		export.setFont(new Font("Arial",Font.BOLD,22));
		export.setBackground(Color.blue);
		export.setForeground(Color.white);
		users.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(190, 120, 150, 40);
		add.setFont(new Font("Arial",Font.BOLD,22));
		add.setBackground(Color.blue);
		add.setForeground(Color.white);
		users.add(add);
		
		Object [] table_head = {"No. Control","Nombre", "Apellidos", "Semestre", "Promedio", "Acciones"};
		Object [] [] table_contend = {
				{"20231001","Luis","Martínez López","1","8.7","Editar/Eliminar"},
				{"20231002","Ana","García Pérez","2","9.1","Editar/Eliminar"},
				{"20231003","Carlos","Hernández Ruiz","3","7.8","Editar/Eliminar"},
				{"20231004","María","Torres Sánchez","4","8.9","Editar/Eliminar"},
				{"20231005","Jorge","Ramírez Cruz","5","6.5","Editar/Eliminar"},
				{"20231006","Fernanda","Flores Gómez","6","9.5","Editar/Eliminar"},
				{"20231007","Miguel","Vargas Díaz","7","8.2","Editar/Eliminar"},
				{"20231008","Sofía","Castro Morales","8","9.0","Editar/Eliminar"},
				{"20231009","Ricardo","Ortiz Jiménez","2","7.4","Editar/Eliminar"},
				{"20231010","Valeria","Navarro León","3","8.8","Editar/Eliminar"},
				{"20231011","Daniel","Mendoza Ríos","4","6.9","Editar/Eliminar"},
				{"20231012","Camila","Silva Romero","5","9.3","Editar/Eliminar"},
				{"20231013","Andrés","Guerrero Molina","6","7.7","Editar/Eliminar"},
				{"20231014","Paola","Ramos Castillo","7","8.6","Editar/Eliminar"},
				{"20231015","Diego","Reyes Herrera","8","9.2","Editar/Eliminar"},
				{"20231016","Elena","Cortés Medina","1","8.0","Editar/Eliminar"},
				{"20231017","Fernando","Aguilar Vega","2","7.1","Editar/Eliminar"},
				{"20231018","Natalia","Peña Soto","3","9.4","Editar/Eliminar"},
				{"20231019","Iván","Campos Ibarra","4","6.8","Editar/Eliminar"},
				{"20231020","Diana","Delgado Núñez","5","8.3","Editar/Eliminar"},
				{"20231021","Raúl","Salazar Cabrera","6","7.9","Editar/Eliminar"},
				{"20231022","Gabriela","Paredes Lara","7","9.6","Editar/Eliminar"},
				{"20231023","Hugo","Fuentes Bravo","8","8.4","Editar/Eliminar"},
				{"20231024","Alejandra","Miranda Solís","1","7.6","Editar/Eliminar"},
				{"20231025","Emilio","Valdez Ponce","2","8.1","Editar/Eliminar"},
				{"20231026","Lucía","Mejía Carrillo","3","9.7","Editar/Eliminar"},
				{"20231027","Óscar","Cárdenas Nieto","4","6.7","Editar/Eliminar"},
				{"20231028","Daniela","Suárez Lozano","5","8.5","Editar/Eliminar"},
				{"20231029","Sebastián","Arias Beltrán","6","7.3","Editar/Eliminar"},
				{"20231030","Renata","Mora Escobar","7","9.8","Editar/Eliminar"},
				{"20231031","Adrián","Luna Pacheco","8","8.9","Editar/Eliminar"},
				{"20231032","Ximena","Rosales Acosta","1","7.2","Editar/Eliminar"},
				{"20231033","Bruno","Cisneros Padilla","2","8.6","Editar/Eliminar"},
				{"20231034","Mariana","Esquivel Zamora","3","9.0","Editar/Eliminar"},
				{"20231035","Esteban","Villanueva Tapia","4","6.6","Editar/Eliminar"},
				{"20231036","Regina","Santos Bautista","5","8.4","Editar/Eliminar"},
				{"20231037","Tomás","Galindo Rangel","6","7.5","Editar/Eliminar"}
		};
		
		
		JTable users_table = new JTable(table_contend, table_head);
		JScrollPane scrollPane = new JScrollPane(users_table);
		scrollPane.setLocation(280, 180);
		scrollPane.setSize(450, 200);
		scrollPane.setBackground(Color.decode("#D4EFFF"));
		users_table.setBackground(Color.decode("#D4EFFF"));
		scrollPane.setBorder(BorderFactory.createLineBorder(Color.blue));
		users.add(scrollPane);
		
		
		users.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void calculadora() {
		JPanel contenedor = new JPanel();
		contenedor.setSize(600, 600);
		contenedor.setLocation(300, 0);
		contenedor.setBackground(Color.gray);
		contenedor.setLayout(new BorderLayout(0,0));
		this.add(contenedor);
		
		
		
		JTextField pantalla = new JTextField("100.00");
		pantalla.setFont(new Font("Arial", Font.BOLD, 40));
		pantalla.setBackground(Color.black);
		pantalla.setForeground(Color.white);
		pantalla.setSize(600,100);
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		pantalla.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		pantalla.setBorder(BorderFactory.createLineBorder(Color.gray));
		pantalla.setPreferredSize(new Dimension(600, 100));
		contenedor.add(pantalla,BorderLayout.NORTH);
		
		
		JPanel center_panel = new JPanel(); 
		center_panel.setSize(600, 500);
		center_panel.setBackground(Color.white);
		center_panel.setLayout(new GridLayout(4,4));
		
		JButton division = new JButton("/");
		division.setFont(new Font("Arial",Font.BOLD,22));
		division.setBackground(Color.orange);
		division.setForeground(Color.black);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.setFont(new Font("Arial",Font.BOLD,22));
		multiplicacion.setBackground(Color.orange);
		multiplicacion.setForeground(Color.black);
		
		JButton suma = new JButton("+");
		suma.setFont(new Font("Arial",Font.BOLD,22));
		suma.setBackground(Color.orange);
		suma.setForeground(Color.black);
		
		JButton resta = new JButton("-");
		resta.setFont(new Font("Arial",Font.BOLD,22));
		resta.setBackground(Color.orange);
		resta.setForeground(Color.black);
		
		JButton igual = new JButton("=");
		igual.setFont(new Font("Arial",Font.BOLD,22));
		igual.setBackground(Color.orange);
		igual.setForeground(Color.black);
		
		JButton punto = new JButton(".");
		punto.setFont(new Font("Arial",Font.BOLD,22));
		punto.setBackground(Color.black);
		punto.setForeground(Color.white);
		
		JButton cero = new JButton("0");
		cero.setFont(new Font("Arial",Font.BOLD,22));
		cero.setBackground(Color.black);
		cero.setForeground(Color.white);
		
		JButton uno = new JButton("1");
		uno.setFont(new Font("Arial",Font.BOLD,22));
		uno.setBackground(Color.black);
		uno.setForeground(Color.white);
		
		JButton dos = new JButton("2");
		dos.setFont(new Font("Arial",Font.BOLD,22));
		dos.setBackground(Color.black);
		dos.setForeground(Color.white);
		
		JButton tres = new JButton("3");
		tres.setFont(new Font("Arial",Font.BOLD,22));
		tres.setBackground(Color.black);
		tres.setForeground(Color.white);
		
		JButton cuatro = new JButton("4");
		cuatro.setFont(new Font("Arial",Font.BOLD,22));
		cuatro.setBackground(Color.black);
		cuatro.setForeground(Color.white);
		
		JButton cinco = new JButton("5");
		cinco.setFont(new Font("Arial",Font.BOLD,22));
		cinco.setBackground(Color.black);
		cinco.setForeground(Color.white);
		
		JButton seis = new JButton("6");
		seis.setFont(new Font("Arial",Font.BOLD,22));
		seis.setBackground(Color.black);
		seis.setForeground(Color.white);
		
		JButton siete = new JButton("7");
		siete.setFont(new Font("Arial",Font.BOLD,22));
		siete.setBackground(Color.black);
		siete.setForeground(Color.white);
		
		JButton ocho = new JButton("8");
		ocho.setFont(new Font("Arial",Font.BOLD,22));
		ocho.setBackground(Color.black);
		ocho.setForeground(Color.white);
		
		JButton nueve = new JButton("9");
		nueve.setFont(new Font("Arial",Font.BOLD,22));
		nueve.setBackground(Color.black);
		nueve.setForeground(Color.white);
		
		center_panel.add(siete);
		center_panel.add(ocho);
		center_panel.add(nueve);
		center_panel.add(division);
		center_panel.add(cuatro);
		center_panel.add(cinco);
		center_panel.add(seis);
		center_panel.add(multiplicacion);
		center_panel.add(uno);
		center_panel.add(dos);
		center_panel.add(tres);
		center_panel.add(resta);
		center_panel.add(cero);
		center_panel.add(punto);
		center_panel.add(igual);
		center_panel.add(suma);
		
		JPanel center_panel2 = new JPanel();
		center_panel2.setLayout(new BorderLayout());
		center_panel2.add(center_panel, BorderLayout.CENTER);

		JPanel panel_componentes = new JPanel();  
		panel_componentes.setBackground(Color.black);
		panel_componentes.setLayout(new FlowLayout(FlowLayout.CENTER,50,10));
		panel_componentes.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		center_panel2.add(panel_componentes, BorderLayout.NORTH);
		
		JButton Mmas = new JButton("M+");
		Mmas.setFont(new Font("Arial",Font.BOLD,22));
		Mmas.setBackground(Color.gray);
		Mmas.setForeground(Color.black);
		Mmas.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JButton MC = new JButton("MC");
		MC.setFont(new Font("Arial",Font.BOLD,22));
		MC.setBackground(Color.gray);
		MC.setForeground(Color.black);
		
		JButton b1 = new JButton("rad");
		b1.setFont(new Font("Arial",Font.BOLD,22));
		b1.setBackground(Color.gray);
		b1.setForeground(Color.black);
		
		JButton b2 = new JButton("e");
		b2.setFont(new Font("Arial",Font.BOLD,22));
		b2.setBackground(Color.gray);
		b2.setForeground(Color.black);
		
		panel_componentes.add(MC);
		panel_componentes.add(Mmas);
		panel_componentes.add(b1);
		panel_componentes.add(b2);

		contenedor.add(center_panel2,BorderLayout.CENTER);
	}
	
	public void intereses() {
		JPanel contenedor = new JPanel();
		contenedor.setSize(600, 600);
		contenedor.setLocation(300, 0);
		contenedor.setBackground(Color.white);
		contenedor.setLayout(new BorderLayout(200,20));
		this.add(contenedor);
		
		ImageIcon iconoVentana = new ImageIcon("iconoVentana.png");
		JLabel labelIconoVentana = new JLabel();
		labelIconoVentana.setOpaque(false);
		labelIconoVentana.setSize(80,80);
		labelIconoVentana.setLocation(450, 0);
		labelIconoVentana.setLayout(null);
		labelIconoVentana.setIcon(new ImageIcon(iconoVentana.getImage().getScaledInstance(labelIconoVentana.getWidth(),labelIconoVentana.getHeight(), Image.SCALE_SMOOTH)));
		contenedor.add(labelIconoVentana);
		
		JLabel title_interes = new JLabel("Interés");
		title_interes.setFont(new Font("Arial",Font.BOLD,24));
		title_interes.setForeground(Color.decode("#efb810"));
		title_interes.setHorizontalAlignment(JLabel.LEFT);
		contenedor.add(title_interes, BorderLayout.NORTH);
		
		
		JPanel Calcular= new JPanel();
		Calcular.setBackground(Color.blue);
		Calcular.setLayout(new BorderLayout(0,0));
		contenedor.add(Calcular, BorderLayout.CENTER);
		
		JPanel CalcularTitulo= new JPanel();
		CalcularTitulo.setBackground(Color.decode("#5CCFE0"));
		CalcularTitulo.setLayout(new BorderLayout(10,10));
		Calcular.add(CalcularTitulo, BorderLayout.NORTH);
		
		JLabel CalcularInteres = new JLabel("Calcular intereses");
		CalcularInteres.setBackground(Color.decode("#5CCFE0"));
		CalcularInteres.setFont(new Font("Arial",Font.BOLD,24));
		CalcularInteres.setForeground(Color.white);
		CalcularInteres.setHorizontalAlignment(JLabel.LEFT);
		CalcularTitulo.add(CalcularInteres, BorderLayout.NORTH);
		
		JPanel CalcularWest= new JPanel();
		CalcularWest.setBackground(Color.DARK_GRAY);
		CalcularWest.setLayout(new GridLayout(3,1));
		CalcularWest.setPreferredSize(new Dimension(200,200)); 
		Calcular.add(CalcularWest, BorderLayout.WEST);
		
		JLabel capital = new JLabel("Capital:");
		capital.setFont(new Font("Arial",Font.BOLD,24));
		capital.setForeground(Color.black);
		capital.setHorizontalAlignment(JLabel.CENTER);
		CalcularWest.add(capital);
		
		JLabel tiempo = new JLabel("Tiempo:");
		tiempo.setFont(new Font("Arial",Font.BOLD,24));
		tiempo.setForeground(Color.black);
		tiempo.setHorizontalAlignment(JLabel.CENTER);
		CalcularWest.add(tiempo);
		
		JLabel tasaInteres = new JLabel("Tasa de Interes:");
		tasaInteres.setFont(new Font("Arial",Font.BOLD,24));
		tasaInteres.setForeground(Color.black);
		tasaInteres.setHorizontalAlignment(JLabel.CENTER);
		CalcularWest.add(tasaInteres);
		
		JPanel CalcularEast= new JPanel();
		CalcularEast.setBackground(Color.blue);
		CalcularEast.setLayout(new GridLayout(3,1));
		CalcularEast.setPreferredSize(new Dimension(400,200)); 
		Calcular.add(CalcularEast, BorderLayout.CENTER);
		
		JTextField capitalText = new JTextField();
		capitalText.setFont(new Font("Arial",Font.BOLD,22));
		capitalText.setForeground(Color.black);
		capitalText.setHorizontalAlignment(JLabel.CENTER);
		capitalText.setBackground(Color.white);
		capitalText.setBorder(BorderFactory.createLineBorder(Color.black));
		CalcularEast.add(capitalText);
		
		JTextField tiempoText = new JTextField();
		tiempoText.setFont(new Font("Arial",Font.BOLD,22));
		tiempoText.setForeground(Color.black);
		tiempoText.setHorizontalAlignment(JLabel.CENTER);
		tiempoText.setBackground(Color.white);
		tiempoText.setBorder(BorderFactory.createLineBorder(Color.black));
		CalcularEast.add(tiempoText);
		
		JTextField tasaText = new JTextField();
		tasaText.setFont(new Font("Arial",Font.BOLD,22));
		tasaText.setForeground(Color.black);
		tasaText.setHorizontalAlignment(JLabel.CENTER);
		tasaText.setBackground(Color.white);
		tasaText.setBorder(BorderFactory.createLineBorder(Color.black));
		CalcularEast.add(tasaText);
		
		JPanel panel_botones = new JPanel();  
		panel_botones.setBackground(Color.blue);
		panel_botones.setLayout(new GridLayout(1,2));
		panel_botones.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Calcular.add(panel_botones, BorderLayout.SOUTH);
		
		JButton BotonCalcular = new JButton("Calcular");
		BotonCalcular.setFont(new Font("Arial",Font.BOLD,22));
		BotonCalcular.setBackground(Color.decode("#A6D3DE"));
		BotonCalcular.setForeground(Color.white);
		BotonCalcular.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_botones.add(BotonCalcular, BorderLayout.SOUTH);
		
		JButton BotonCancelar = new JButton("Cancelar");
		BotonCancelar.setFont(new Font("Arial",Font.BOLD,22));
		BotonCancelar.setBackground(Color.decode("#A6D3DE"));
		BotonCancelar.setForeground(Color.white);
		BotonCancelar.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_botones.add(BotonCancelar, BorderLayout.SOUTH);
		
		JPanel resultados= new JPanel();	
		resultados.setBackground(Color.gray);
		resultados.setLayout(new BorderLayout(0,0));
		resultados.setPreferredSize(new Dimension(600,200)); 
		contenedor.add(resultados, BorderLayout.SOUTH);
		
		JPanel resultadoswest= new JPanel();	
		resultadoswest.setBackground(Color.gray);
		resultadoswest.setLayout(new GridLayout(2,1));
		resultadoswest.setPreferredSize(new Dimension(200,200)); 
		resultados.add(resultadoswest, BorderLayout.WEST);
		
		JLabel interes = new JLabel("Interes:");
		interes.setFont(new Font("Arial",Font.BOLD,24));
		interes.setForeground(Color.black);
		interes.setHorizontalAlignment(JLabel.CENTER);
		resultadoswest.add(interes);
		
		JLabel monto = new JLabel("Monto:");
		monto.setFont(new Font("Arial",Font.BOLD,24));
		monto.setForeground(Color.black);
		monto.setHorizontalAlignment(JLabel.CENTER);
		resultadoswest.add(monto);
		
		JPanel resultadoEast = new JPanel();	
		resultadoEast.setBackground(Color.gray);
		resultadoEast.setLayout(new GridLayout(2,1));
		resultadoEast.setPreferredSize(new Dimension(400,200)); 
		resultados.add(resultadoEast, BorderLayout.CENTER);
		
		JTextField interesText = new JTextField();
		interesText.setFont(new Font("Arial",Font.BOLD,22));
		interesText.setForeground(Color.black);
		interesText.setHorizontalAlignment(JLabel.CENTER);
		interesText.setBackground(Color.white);
		interesText.setBorder(BorderFactory.createLineBorder(Color.black));
		resultadoEast.add(interesText);
		
		JTextField montoText = new JTextField();
		montoText.setFont(new Font("Arial",Font.BOLD,22));
		montoText.setForeground(Color.black);
		montoText.setHorizontalAlignment(JLabel.CENTER);
		montoText.setBackground(Color.white);
		montoText.setBorder(BorderFactory.createLineBorder(Color.black));
		resultadoEast.add(montoText);
		
		contenedor.repaint();
		
	}
	
	public void pintar() {
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.drawLine(0, 0, 100, 100);
                
                g2d.setColor(Color.red);
                g2d.setStroke(new BasicStroke(3));
                g2d.drawLine(200, 200, 500, 200);
                
                g2d.drawRect(250, 250, 100, 100);
                
                g2d.setColor(Color.green);
                g2d.drawOval(400, 100, 90, 30);
                
                g2d.setStroke(new BasicStroke(5));
                g2d.drawArc(300, 100, 100, 100, 90, 90);
                
                g2d.drawPolygon(new int[] {200,100,300}, new int[] {100,300,500}, 3);
                
                g2d.setColor(Color.orange);
                g2d.fillRect(500, 300, 100, 100);
                
                g2d.fillOval(400, 200, 100, 100);
                
                g2d.fillArc(300, 300, 100, 100, 0, 300);
                
                g2d.fillPolygon(new int[] {400,300,500}, new int[] {200,300,500}, 3);
                
             // Ejemplo para cargar una imagen
                BufferedImage image;
				try {
					image = ImageIO.read(new File("src/imagenes/img.png"));

	                g2d.drawImage(image, 650, 0, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        };
        
        pane.setSize(1200,700);
        pane.setLocation(0,0);
        this.add(pane);
    }
	
	public void casa() {
		JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                //cielo
                g2d.setColor(Color.CYAN);
                g2d.fillRect(0, 0, 1200, 700);
                
                //tierra
                g2d.setColor(Color.decode("#45371C"));
                g2d.fillRect(0, 600, 1200, 70);
           
                //pasto
                g2d.setColor(Color.green);
                g2d.fillRect(0, 550, 1200, 70);
                
                //valla
                g2d.setColor(Color.decode("#B38942"));
                g2d.fillRect(0, 350, 1200, 100);
                
                g2d.setColor(Color.decode("#E0AA55"));
                g2d.fillPolygon(new int[] {10, 40, 70}, new int[] {310, 270, 310}, 3);
                g2d.fillRect(10, 310, 60, 240);
                g2d.fillPolygon(new int[] {90, 120, 150}, new int[] {310, 270, 310}, 3);
                g2d.fillRect(90, 310, 60, 240);
                g2d.fillPolygon(new int[] {180, 210, 240}, new int[] {310, 270, 310}, 3);
                g2d.fillRect(180, 310, 60, 240);
                g2d.fillPolygon(new int[] {270, 300, 330}, new int[] {310, 270, 310}, 3);
                g2d.fillRect(270, 310, 60, 240);
                g2d.fillPolygon(new int[] {900, 930, 960}, new int[] {310, 270, 310}, 3);
                g2d.fillRect(900, 310, 60, 240);
                g2d.fillPolygon(new int[] {990, 1020, 1050}, new int[] {310, 270, 310}, 3);
                g2d.fillRect(990, 310, 60, 240);
                g2d.fillPolygon(new int[] {1080, 1110, 1140}, new int[] {310, 270, 310}, 3);
                g2d.fillRect(1080, 310, 60, 240);
                g2d.fillPolygon(new int[] {1170, 1200, 1230}, new int[] {310, 270, 310}, 3);
                g2d.fillRect(1170, 310, 60, 240);
                
                
                //escalon
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillRect(250, 500, 700, 50);
                
                //chimenea
                g2d.fillRect(750, 30, 100, 130);
                g2d.fillRect(730, 30, 140, 30);
                
                
                //casa
                g2d.setColor(Color.decode("#FFD28A"));
                g2d.fillRect(300, 150, 600, 350);
                g2d.setColor(Color.decode("#45371C"));
                g2d.fillRect(300, 210, 600, 5);
                g2d.fillRect(300, 260, 600, 5);
                g2d.fillRect(300, 310, 600, 5);
                g2d.fillRect(300, 360, 600, 5);
                g2d.fillRect(300, 410, 600, 5);
                g2d.fillRect(300, 460, 600, 5);
                
                
                //puerta
                g2d.setColor(Color.decode("#695732"));
                g2d.fillRect(350, 220, 150, 280);
                g2d.setColor(Color.decode("#45371C"));
                g2d.fillRect(340, 210, 170, 10);
                g2d.fillRect(340, 490, 170, 10);
                g2d.fillRect(340, 210, 10, 290);
                g2d.fillRect(500, 210, 10, 290);
                
                
                //ventana
                g2d.setColor(Color.white);
                g2d.fillRect(650, 220, 200, 150);
                g2d.setColor(Color.RED);
                g2d.fillRect(650, 370, 200, 10);
                g2d.fillRect(650, 210, 200, 10);
                g2d.fillRect(640, 210, 10, 170);
                g2d.fillRect(840, 210, 10, 170);
                g2d.fillRect(748, 220, 10, 150);
                g2d.fillRect(650, 295, 200, 10);
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillRect(630, 380, 230, 20);
                
                //techo
                g2d.setColor(Color.red);
                g2d.fillPolygon(new int[] {260,600,940}, new int[] {150,10,150}, 3);
                
                //perilla
                g2d.setColor(Color.white);
                g2d.fillOval(470, 360, 15, 15);
                
                
            }
        };
        
        panel.setSize(1200,700);
        panel.setLocation(0,0);
        this.add(panel);
		
	}
	
	public void router(String target) {
		
		this.getContentPane().removeAll();
		
		if (target.equals("login"))
			this.login();
		
		if (target.equals("registro"))
			this.registro();
		
		if (target.equals("recovery_password"))
			this.recovery_password();
		
		if (target.equals("p1_menu"))
			this.p1_menu();
		
		if (target.equals("p2_menu"))
			this.p2_menu();
		
		if (target.equals("p3_menu"))
			this.p3_menu();
		if (target.equals("Alta_menu"))
			this.Alta_menu();
		if (target.equals("Baja_menu"))
			this.Baja_menu();
		if (target.equals("Consultar_menu"))
			this.Consultar_menu();
		
		this.setVisible(true);
		this.repaint();
		this.revalidate();
	}
	
	public void menu() {
		JMenuBar barra = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		
		JMenuItem open = new JMenuItem("Abrir");
		JMenuItem close = new JMenuItem("Cerrar");
		JMenuItem save = new JMenuItem("Guardar");
		JMenuItem newFile = new JMenuItem("Nuevo");
		
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(newFile);
		
		barra.add(archivo);
		
		JMenu submenu = new JMenu("Otros");
		archivo.addSeparator();
		
		JMenuItem menuItem = new JMenuItem("An itme in the submenu");
		submenu.add(menuItem);
		
		menuItem = new JMenu("Anothe item");
		submenu.add(menuItem);
		archivo.add(submenu);
		
		JMenu usuarios = new JMenu("Usuarios");
		
		JMenuItem alta = new JMenuItem("Alta");
		JMenuItem baja = new JMenuItem("Baja");
		JMenuItem consultar = new JMenuItem("Consultar");
		usuarios.add(alta);
		usuarios.add(baja);
		usuarios.add(consultar);
		barra.add(usuarios);
		
		
		
		JMenu ayuda = new JMenu("Ayuda");
		
		JMenuItem p1 = new JMenuItem("¿Cómo crear un usuario?");
		JMenuItem p2 = new JMenuItem("¿Cómo acceder al sistema?");	
		JMenuItem p3 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");	
		ayuda.add(p1);
		ayuda.add(p2);
		ayuda.add(p3);
		barra.add(ayuda);
		
		JMenu cuenta = new JMenu("Cuenta");
		JMenuItem acceder = new JMenuItem("Acceder");
		JMenuItem registrarse = new JMenuItem("Registrarse");
		JMenuItem recover_menu = new JMenuItem("Recuperar cuenta");
		cuenta.add(acceder);
		cuenta.add(registrarse);
		cuenta.add(recover_menu);
		
		
		barra.add(cuenta);
		
		this.setJMenuBar(barra);
		
		registrarse.addActionListener(e ->{
			this.router("registro");
		});
		
		acceder.addActionListener(e ->{
			this.router("login");
		});
		
		p1.addActionListener(e ->{
			this.router("p1_menu");
		});
		
		p2.addActionListener(e ->{
			this.router("p2_menu");
		});
		p3.addActionListener(e ->{
			this.router("p3_menu");
		});
		alta.addActionListener(e ->{
			this.router("Alta_menu");
		});
		baja.addActionListener(e ->{
			this.router("Baja_menu");
		});
		consultar.addActionListener(e ->{
			this.router("Consultar_menu");
		});

		
		
		
	}
	
	public void marioBros() {
		JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                //borde
                g2d.setStroke(new BasicStroke(3));
                
                //cielo
                g2d.setColor(Color.CYAN);
                g2d.fillRect(0, 0, 1200, 700);
           
                //piso
                g2d.setColor(Color.pink);
                g2d.fillRect(0, 600, 1200, 100);
                g2d.setColor(Color.black);
                g2d.drawRect(0, 600, 1200, 100);
                
                //tubo
                g2d.setColor(Color.decode("#0E6B1F"));
                g2d.fillRect(700, 400, 150, 200);
                g2d.setColor(Color.black);
                g2d.drawRect(700, 400, 150, 200);
                g2d.setColor(Color.decode("#0E6B1F"));
                g2d.fillRect(680, 370, 190, 30);
                g2d.setColor(Color.black);
                g2d.drawRect(680, 370, 190, 30);
             
                //cuadro verde
                g2d.setColor(Color.decode("#17E340"));
                g2d.fillRect(950, 370, 300, 230);
                g2d.setColor(Color.black);
                g2d.drawRect(950, 370, 300, 230);
                //criculo
                g2d.setColor(Color.gray);
                g2d.fillOval(960, 380, 30, 30);
                g2d.setColor(Color.black);
                g2d.drawOval(960, 380, 30, 30);
                //circulo2
                g2d.setColor(Color.gray);
                g2d.fillOval(960, 560, 30, 30);
                g2d.setColor(Color.black);
                g2d.drawOval(960, 560, 30, 30);
                
                //cuadro azul
                g2d.setColor(Color.decode("#17A6E3"));
                g2d.fillRect(250, 200, 300, 400);
                g2d.setColor(Color.black);
                g2d.drawRect(250, 200, 300, 400);
                //criculo
                g2d.setColor(Color.gray);
                g2d.fillOval(260, 210, 30, 30);
                g2d.setColor(Color.black);
                g2d.drawOval(260, 210, 30, 30);
                //circulo2
                g2d.setColor(Color.gray);
                g2d.fillOval(510, 210, 30, 30);
                g2d.setColor(Color.black);
                g2d.drawOval(510, 210, 30, 30);
                //circulo3
                g2d.setColor(Color.gray);
                g2d.fillOval(510, 560, 30, 30);
                g2d.setColor(Color.black);
                g2d.drawOval(510, 560, 30, 30);
                //sombra
                g2d.fillRect(550, 250, 30, 350);
                
                //cuadro rosa
                g2d.setColor(Color.decode("#FFA1C5"));
                g2d.fillRect(80, 370, 300, 230);
                g2d.setColor(Color.black);
                g2d.drawRect(80, 370, 300, 230);
                //criculo
                g2d.setColor(Color.gray);
                g2d.fillOval(90, 380, 30, 30);
                g2d.setColor(Color.black);
                g2d.drawOval(90, 380, 30, 30);
                //circulo2
                g2d.setColor(Color.gray);
                g2d.fillOval(340, 380, 30, 30);
                g2d.setColor(Color.black);
                g2d.drawOval(340, 380, 30, 30);
                //criculo3
                g2d.setColor(Color.gray);
                g2d.fillOval(90, 560, 30, 30);
                g2d.setColor(Color.black);
                g2d.drawOval(90, 560, 30, 30);
                //circulo4
                g2d.setColor(Color.gray);
                g2d.fillOval(340, 560, 30, 30);
                g2d.setColor(Color.black);
                g2d.drawOval(340, 560, 30, 30);
                //sombra
                g2d.fillRect(380, 420, 30, 180);
                
                //cubos
                g2d.setColor(Color.decode("#D96A29"));
                g2d.fillRect(50, 200, 100, 100);
                g2d.setColor(Color.black);
                g2d.drawRect(50, 200, 100, 100);
                //criculo
                g2d.setColor(Color.black);
                g2d.fillOval(60, 210, 10, 10);
                //criculo2
                g2d.setColor(Color.black);
                g2d.fillOval(130, 210, 10, 10);
                //criculo3
                g2d.setColor(Color.black);
                g2d.fillOval(60, 280, 10, 10);
                //criculo4
                g2d.setColor(Color.black);
                g2d.fillOval(130, 280, 10, 10);
                
                g2d.setColor(Color.decode("#D96A29"));
                g2d.fillRect(270, 20, 100, 100);
                g2d.setColor(Color.black);
                g2d.drawRect(270, 20, 100, 100);
                //criculo
                g2d.setColor(Color.black);
                g2d.fillOval(280, 30, 10, 10);
                //criculo2
                g2d.setColor(Color.black);
                g2d.fillOval(350, 30, 10, 10);
                //criculo3
                g2d.setColor(Color.black);
                g2d.fillOval(280, 100, 10, 10);
                //criculo4
                g2d.setColor(Color.black);
                g2d.fillOval(350, 100, 10, 10);
                
                g2d.setColor(Color.decode("#D96A29"));
                g2d.fillRect(370, 20, 100, 100);
                g2d.setColor(Color.black);
                g2d.drawRect(370, 20, 100, 100);
                //criculo
                g2d.setColor(Color.black);
                g2d.fillOval(380, 30, 10, 10);
                //criculo2
                g2d.setColor(Color.black);
                g2d.fillOval(450, 30, 10, 10);
                //criculo3
                g2d.setColor(Color.black);
                g2d.fillOval(380, 100, 10, 10);
                //criculo4
                g2d.setColor(Color.black);
                g2d.fillOval(450, 100, 10, 10);
                
                g2d.setColor(Color.decode("#D96A29"));
                g2d.fillRect(1000, 150, 100, 100);
                g2d.setColor(Color.black);
                g2d.drawRect(1000, 150, 100, 100);
                //criculo
                g2d.setColor(Color.black);
                g2d.fillOval(1010, 160, 10, 10);
                //criculo2
                g2d.setColor(Color.black);
                g2d.fillOval(1080, 160, 10, 10);
                //criculo3
                g2d.setColor(Color.black);
                g2d.fillOval(1010, 230, 10, 10);
                //criculo4
                g2d.setColor(Color.black);
                g2d.fillOval(1080, 230, 10, 10);
                
                

                
                
            }
        };
        
        panel.setSize(1200,700);
        panel.setLocation(0,0);
        this.add(panel);
		
	}
}

