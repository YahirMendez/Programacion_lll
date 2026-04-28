package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
			ventana.dispose();
		});
		
		contenedor.repaint();
		contenedor.revalidate();	
	}
	
	public void registerView() {
		
	}

	

}
