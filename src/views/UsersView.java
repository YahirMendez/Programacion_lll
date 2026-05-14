package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.HomeController;
import controllers.UsersController;
import models.AuthModel;
import models.User;

public class UsersView {
	
	private UsersController uc;
	
	public UsersView() {
		
	}

	public void tableUsers(ArrayList<User> data_users) {
		
		for (User item: data_users) {
			System.out.println(item.getNombreCompleto());
		}
		
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
		
		
		
		JPanel users = new JPanel();
		users.setSize(1150,610);
		users.setLocation(20, 0);
		users.setBackground(Color.decode("#D4EFFF"));
		users.setLayout(null);
		ventana.add(users);
		
		String columnas[] = {
				"ID",
				"USERNAME",
				"PASSWORD",
				"NOMBRE COMPLETO"
		};
		
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnas);

		for(User item : data_users) {

			Object datos[] = {

					item.getId(),
					item.getUsername(),
					item.getPassword(),
					item.getNombreCompleto()
			};

			model.addRow(datos);
		}
		
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
		add.addActionListener(e ->{
			ventana.dispose();
			addUserForm();
		});
		users.add(add);
		
		JTable tabla = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setLocation(280, 180);
		scrollPane.setSize(450, 200);
		users.add(scrollPane);
		
		ventana.setVisible(true);
		ventana.repaint();
		ventana.revalidate();
	}
	
	public void addUserForm() {
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
		title_login.setText("Añadir usuario");
		title_login.setSize(200, 50);
		title_login.setOpaque(false);
		title_login.setLocation(145, 100);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setForeground(Color.blue);
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JLabel labelNombre = new JLabel();
		labelNombre.setText("Nombre: ");
		labelNombre.setSize(220, 50);
		labelNombre.setOpaque(false);
		labelNombre.setLocation(30, 140);
		labelNombre.setBackground(Color.white);
		labelNombre.setFont(new Font("Arial",Font.BOLD,22));
		labelNombre.setForeground(Color.blue);
		labelNombre.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(labelNombre);
		
		ImageIcon imagenUsuario = new ImageIcon("imagenSilueta.png");
		JLabel labelUsuario = new JLabel();
		labelUsuario.setBounds(20, 180, 50, 50);
		labelUsuario.setIcon(new ImageIcon(imagenSilueta.getImage().getScaledInstance(labelUsuario.getHeight(), labelUsuario.getWidth(), Image.SCALE_SMOOTH)));
		contenedor.add(labelUsuario);
		
		JTextField nombreField = new JTextField();
		nombreField.setSize(300, 50);
		nombreField.setLocation(85,180);
		nombreField.setFont(new Font("Arial",Font.BOLD,22));
		nombreField.setForeground(Color.black);
		nombreField.setHorizontalAlignment(JLabel.CENTER);
		nombreField.setBackground(Color.decode("#D4EFFF"));
		nombreField.setBorder(BorderFactory.createLineBorder(Color.blue));
		contenedor.add(nombreField);
		
		JLabel labelUsername = new JLabel();
		labelUsername.setText("Usuario: ");
		labelUsername.setSize(220, 50);
		labelUsername.setOpaque(false);
		labelUsername.setLocation(30, 240);
		labelUsername.setBackground(Color.white);
		labelUsername.setFont(new Font("Arial",Font.BOLD,22));
		labelUsername.setForeground(Color.blue);
		labelUsername.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(labelUsername);
		
		ImageIcon imagenUsuario2 = new ImageIcon("imagenSilueta.png");
		JLabel labelUsuario2 = new JLabel();
		labelUsuario2.setBounds(20, 280, 50, 50);
		labelUsuario2.setIcon(new ImageIcon(imagenSilueta.getImage().getScaledInstance(labelUsuario2.getHeight(), labelUsuario2.getWidth(), Image.SCALE_SMOOTH)));
		contenedor.add(labelUsuario2);
		
		JTextField usernameField = new JTextField();
		usernameField.setSize(300, 50);
		usernameField.setLocation(85,280);
		usernameField.setFont(new Font("Arial",Font.BOLD,22));
		usernameField.setForeground(Color.black);
		usernameField.setHorizontalAlignment(JLabel.CENTER);
		usernameField.setBackground(Color.decode("#D4EFFF"));
		usernameField.setBorder(BorderFactory.createLineBorder(Color.blue));
		contenedor.add(usernameField);
		
		JLabel labelPassword = new JLabel();
		labelPassword.setText("Contraseña: ");
		labelPassword.setSize(200, 50);
		labelPassword.setOpaque(false);
		labelPassword.setLocation(60, 340);
		labelPassword.setBackground(Color.white);
		labelPassword.setFont(new Font("Arial",Font.BOLD,22));
		labelPassword.setForeground(Color.blue);
		labelPassword.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(labelPassword);
		
		ImageIcon imagenPassword= new ImageIcon("imagenPassword.png");
		JLabel IMG_labelPassword = new JLabel();
		IMG_labelPassword.setBounds(20, 380, 50, 50);
		IMG_labelPassword.setIcon(new ImageIcon(imagenPassword.getImage().getScaledInstance(IMG_labelPassword.getHeight(), IMG_labelPassword.getWidth(), Image.SCALE_SMOOTH)));
		contenedor.add(IMG_labelPassword);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setSize(300, 50);
		passwordField.setLocation(85,380);
		passwordField.setFont(new Font("Arial",Font.BOLD,22));
		passwordField.setForeground(Color.black);
		passwordField.setHorizontalAlignment(JLabel.CENTER);
		passwordField.setBackground(Color.decode("#D4EFFF"));
		passwordField.setBorder(BorderFactory.createLineBorder(Color.blue));
		contenedor.add(passwordField);
	
		JButton add = new JButton();
		add.setText("Guardar");
		add.setLocation(280, 470);
		add.setSize(200, 50);
		add.setFont(new Font("Arial",Font.BOLD,22));
		add.setBackground(Color.blue);
		add.setForeground(Color.white);
		contenedor.add(add);
		
		add.addActionListener(e ->{
			boolean valido =  true;
			
			String nombre = nombreField.getText().trim();
			String user = usernameField.getText().trim();
			String password = new String (passwordField.getPassword()).trim();
			
			if (nombre.isEmpty()) {
				nombreField.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				valido = false;
			}
			else {
				nombreField.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
			}
			
			if (user.isEmpty()) {
				usernameField.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				valido = false;
			}
			else {
				usernameField.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
			}
			
			if (password.isEmpty()) {
				passwordField.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
				valido = false;
			}
			else {
				passwordField.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
			}
			
			if(valido) {
				uc = new UsersController();
				
				System.out.println(user);
				System.out.println(password);
				System.out.println(nombre);
				
				if(uc.addUser(user, password, nombre)) {
					JOptionPane.showMessageDialog(
						null, 
						"Registro exitoso\n\n"+
						"Nombre" + nombre +"\n"+
						"usuario" + user +"\n",
						"Exito",
						JOptionPane.INFORMATION_MESSAGE	
					);
					ventana.dispose();
					uc.ShowUsers();
				}
				else {
					JOptionPane.showMessageDialog(
						null, 
						"No se pudo crear la cuenta.",
						"Aviso",
						JOptionPane.INFORMATION_MESSAGE	
					);
				}
			}
			else {
				JOptionPane.showMessageDialog(
						null, 
						"No se pudo crear la cuenta.",
						"Aviso",
						JOptionPane.INFORMATION_MESSAGE	
				);
			}
		});
		
		
		JButton cancelar = new JButton();
		cancelar.setText("cancelar");
		cancelar.setLocation(60, 470);
		cancelar.setSize(200, 50);
		cancelar.setFont(new Font("Arial",Font.BOLD,22));
		cancelar.setBackground(Color.blue);
		cancelar.setForeground(Color.white);
		contenedor.add(cancelar);
		
		contenedor.repaint();
		contenedor.revalidate();	
		
	}
}
