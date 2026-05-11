package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.User;

public class UsersView {
	
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
}
