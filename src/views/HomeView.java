package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.HomeController;
import controllers.UsersController;

public class HomeView {
	
	public HomeView() {
		
	}
	
	public void HomeView() {
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
		
		JButton goToUsers = new JButton("Ir al panel de usuarios");
		goToUsers.setBounds(100, 100, 200, 50);
		contenedor.add(goToUsers);
		
		goToUsers.addActionListener(e ->{
			ventana.dispose();
			UsersController uc = new UsersController();
			uc.ShowUsers();
		});
		
		contenedor.repaint();
		contenedor.revalidate();
	}
}
