package programacion3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;

public class Ventana2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana2() {
		RegistroDEUsuarios();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void RegistroDEUsuarios() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel titulo = new JPanel();
		frame.getContentPane().add(titulo, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Registro de usuarios");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.add(lblNewLabel);
		
		JPanel panel_principal = new JPanel();
		frame.getContentPane().add(panel_principal, BorderLayout.CENTER);
		panel_principal.setLayout(new GridLayout(1, 2, 10, 10));
		
		JPanel panel_west = new JPanel();
		panel_west.setBackground(Color.WHITE);
		panel_principal.add(panel_west);
		
		JPanel panel_datos_opcionales = new JPanel();
		panel_datos_opcionales.setBorder(BorderFactory.createTitledBorder("Datos opcionales"));
		panel_datos_opcionales.setBackground(new Color(255, 128, 128));
		panel_west.setLayout(new GridLayout(0, 1, 10, 10));
		
		JPanel panel_datos_generales= new JPanel();
		panel_datos_generales.setBorder(BorderFactory.createTitledBorder("Datos generales"));
		panel_datos_generales.setBackground(new Color(0, 255, 128));
		panel_west.add(panel_datos_generales);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido paterno:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido materno:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de nacimiento:");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Sexo:");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setOpaque(false);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setOpaque(false);
		
		JLabel lblNewLabel_6 = new JLabel("Nacionalidad:");
		
		String [] colonias = {"Mexico", "Colombia", "Argentina"};
		JComboBox comboBox = new JComboBox(colonias);
		
		GroupLayout gl_panel_datos_generales = new GroupLayout(panel_datos_generales);
		gl_panel_datos_generales.setHorizontalGroup(
			gl_panel_datos_generales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_datos_generales.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_datos_generales.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_datos_generales.createParallelGroup(Alignment.LEADING, false)
						.addComponent(rdbtnNewRadioButton_1, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
						.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(143, Short.MAX_VALUE))
		);
		gl_panel_datos_generales.setVerticalGroup(
			gl_panel_datos_generales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_datos_generales.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_datos_generales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_datos_generales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_datos_generales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_datos_generales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_datos_generales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_datos_generales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		panel_datos_generales.setLayout(gl_panel_datos_generales);
		panel_west.add(panel_datos_opcionales);
		
		JLabel lblNewLabel_7 = new JLabel("Descripcion:");
		
		JLabel lblNewLabel_8 = new JLabel("Preferencias:");
		
		JTextArea textArea = new JTextArea();
		
		
		String[] opciones = {"Cantar", "Escuchar musica", "Leer", "Deportes", "Meditar", "Bailar", "Otros"};
		JList list = new JList(opciones);
		JScrollPane scroll = new JScrollPane(list);
		panel_datos_opcionales.add(scroll);
		
		
		GroupLayout gl_panel_datos_opcionales = new GroupLayout(panel_datos_opcionales);
		gl_panel_datos_opcionales.setHorizontalGroup(
			gl_panel_datos_opcionales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_datos_opcionales.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_datos_opcionales.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_datos_opcionales.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
						.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
					.addGap(227))
		);
		gl_panel_datos_opcionales.setVerticalGroup(
			gl_panel_datos_opcionales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_datos_opcionales.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_panel_datos_opcionales.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_datos_opcionales.createParallelGroup(Alignment.TRAILING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(185, Short.MAX_VALUE))
		);
		panel_datos_opcionales.setLayout(gl_panel_datos_opcionales);
		
		JPanel panel_east = new JPanel();
		panel_principal.add(panel_east);
		
		JPanel panel_botones_1 = new JPanel();
		panel_botones_1.setBackground(new Color(0, 255, 128));
		panel_east.setLayout(new GridLayout(0, 1, 10, 10));
		
		JPanel panel_perfil_de_usuario= new JPanel();
		panel_perfil_de_usuario.setBorder(BorderFactory.createTitledBorder("Perfil de usuario"));
		panel_perfil_de_usuario.setBackground(new Color(255, 128, 192));
		panel_east.add(panel_perfil_de_usuario);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setOpaque(false);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox_1.setOpaque(false);
		
		ImageIcon imagenUsuario = new ImageIcon("imagenSilueta.png");
		JLabel labelUsuario = new JLabel("");
		labelUsuario.setBounds(20, 180, 100, 100);
		labelUsuario.setIcon(new ImageIcon(imagenUsuario.getImage().getScaledInstance(labelUsuario.getHeight(), labelUsuario.getWidth(), Image.SCALE_SMOOTH)));
		panel_perfil_de_usuario.add(labelUsuario);
		
		GroupLayout gl_panel_perfil_de_usuario = new GroupLayout(panel_perfil_de_usuario);
		gl_panel_perfil_de_usuario.setHorizontalGroup(
			gl_panel_perfil_de_usuario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_perfil_de_usuario.createSequentialGroup()
					.addGap(94)
					.addComponent(labelUsuario, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(125, Short.MAX_VALUE))
				.addGroup(gl_panel_perfil_de_usuario.createSequentialGroup()
					.addGap(63)
					.addGroup(gl_panel_perfil_de_usuario.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxNewCheckBox_1)
						.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_perfil_de_usuario.setVerticalGroup(
			gl_panel_perfil_de_usuario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_perfil_de_usuario.createSequentialGroup()
					.addContainerGap()
					.addComponent(labelUsuario, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(chckbxNewCheckBox_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(146, Short.MAX_VALUE))
		);
		panel_perfil_de_usuario.setLayout(gl_panel_perfil_de_usuario);
		panel_east.add(panel_botones_1);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(0, 0, 0));
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(0, 0, 0));
		btnSalir.setForeground(new Color(255, 255, 255));
		GroupLayout gl_panel_botones_1 = new GroupLayout(panel_botones_1);
		gl_panel_botones_1.setHorizontalGroup(
			gl_panel_botones_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_botones_1.createSequentialGroup()
					.addGap(104)
					.addGroup(gl_panel_botones_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(187, Short.MAX_VALUE))
		);
		gl_panel_botones_1.setVerticalGroup(
			gl_panel_botones_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_botones_1.createSequentialGroup()
					.addGap(63)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		panel_botones_1.setLayout(gl_panel_botones_1);
	}
}
