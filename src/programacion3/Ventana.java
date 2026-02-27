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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	public Ventana() {
		
		this.setSize(1200,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("hola");
		this.setBackground(Color.black);
		this.getContentPane().setBackground(Color.gray);
		//this.setLocation(0, 0);
		this.setLayout(null);
		//this.login();
		
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
		
		this.setJMenuBar(barra);
		this.setJMenuBar(barra);
		this.add(barra);
		
		this.users();
		this.setVisible(true);
	
		
	}
	 
	public void login() {
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
	}
	
	public void registro() {
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
}
