package programacion3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JCheckBox;

public class EvaluaciónUnidad2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtJhonDoe;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EvaluaciónUnidad2 frame = new EvaluaciónUnidad2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EvaluaciónUnidad2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel contenedor = new JPanel();
		contentPane.add(contenedor, BorderLayout.CENTER);
		
		JPanel panel_titulo = new JPanel();
		panel_titulo.setBackground(new Color(0, 0, 255));
		
		JPanel panel_datos_cliente = new JPanel();
		panel_datos_cliente.setBorder(BorderFactory.createTitledBorder("Datos del cliente"));
		
		JPanel panel_datos_factura = new JPanel();
		panel_datos_factura.setBorder(BorderFactory.createTitledBorder("Datos de factura"));
		
		JPanel panel_botones = new JPanel();
		
		JPanel panel_tabla = new JPanel();
		
		JPanel panel_resultados = new JPanel();
		GroupLayout gl_contenedor = new GroupLayout(contenedor);
		gl_contenedor.setHorizontalGroup(
			gl_contenedor.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_titulo, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
				.addComponent(panel_datos_factura, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
				.addGroup(gl_contenedor.createSequentialGroup()
					.addComponent(panel_botones, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(panel_datos_cliente, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
				.addGroup(gl_contenedor.createSequentialGroup()
					.addComponent(panel_tabla, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(panel_resultados, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
		);
		gl_contenedor.setVerticalGroup(
			gl_contenedor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contenedor.createSequentialGroup()
					.addComponent(panel_titulo, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_datos_cliente, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_datos_factura, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_botones, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_tabla, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_resultados, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_9 = new JLabel("SubTotal:");
		
		JLabel lblNewLabel_10 = new JLabel("% Descuento:");
		
		JLabel lblNewLabel_11 = new JLabel("Iva 19%:");
		
		JLabel lblNewLabel_12 = new JLabel("Total factura:");
		
		JLabel lblNewLabel_13 = new JLabel("6600.00");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		textField_4 = new JTextField();
		textField_4.setText("5");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("1254.00");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel lblNewLabel_15 = new JLabel("7524.00");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Valor descontado:");
		
		JLabel lblNewLabel_16 = new JLabel("330.00");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JButton btnNewButton_2 = new JButton("Finalizar factura");
		
		JButton btnNewButton_3 = new JButton("Limpiar");
		GroupLayout gl_panel_resultados = new GroupLayout(panel_resultados);
		gl_panel_resultados.setHorizontalGroup(
			gl_panel_resultados.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_resultados.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_resultados.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_resultados.createSequentialGroup()
							.addComponent(lblNewLabel_12, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(272))
						.addGroup(gl_panel_resultados.createSequentialGroup()
							.addGroup(gl_panel_resultados.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_resultados.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_resultados.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_resultados.createSequentialGroup()
									.addGroup(gl_panel_resultados.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_4, 0, 0, Short.MAX_VALUE)
										.addComponent(lblNewLabel_13, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
									.addGap(18)
									.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_resultados.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)))
					.addGap(18)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_resultados.setVerticalGroup(
			gl_panel_resultados.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_resultados.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_resultados.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_resultados.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addGroup(gl_panel_resultados.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_resultados.createSequentialGroup()
							.addGroup(gl_panel_resultados.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_resultados.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_panel_resultados.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
		);
		panel_resultados.setLayout(gl_panel_resultados);
		
		Object [] table_head = {"Producto", "Cantidad", "Valor", "Subtotal",};
		Object [] [] table_contend = {
			    {"Laptop", "1", "15000", "15000"},
			    {"Mouse", "2", "250", "500"},
			    {"Teclado", "1", "800", "800"},
			    {"Monitor", "2", "3200", "6400"},
			    {"USB 64GB", "3", "180", "540"},
			    {"Audífonos", "1", "1200", "1200"},
			    {"Silla Gamer", "1", "3500", "3500"},
			    {"Webcam", "2", "900", "1800"},
			    {"Disco Duro 1TB", "1", "1800", "1800"},
			    {"Memoria RAM 8GB", "2", "750", "1500"},
			    {"Impresora", "1", "2800", "2800"},
			    {"Tablet", "1", "6000", "6000"},
			    {"Cargador", "2", "300", "600"},
			    {"Cable HDMI", "3", "120", "360"},
			    {"Smartphone", "1", "12000", "12000"},
			    {"Router", "1", "950", "950"},
			    {"Bocinas", "2", "650", "1300"},
			    {"Micrófono", "1", "1100", "1100"},
			    {"Lámpara LED", "2", "200", "400"},
			    {"Power Bank", "3", "400", "1200"},
			    {"Smartwatch", "1", "2500", "2500"},
			    {"Ventilador", "1", "700", "700"},
			    {"Proyector", "1", "4500", "4500"},
			    {"SSD 512GB", "2", "1300", "2600"},
			    {"Cámara", "1", "8000", "8000"},
			    {"Hub USB", "2", "350", "700"},
			    {"Control Gamer", "1", "950", "950"}
			
		};
		
		
		JTable users_table = new JTable(table_contend, table_head);
		JScrollPane scrollPane = new JScrollPane(users_table);
		scrollPane.setLocation(280, 180);
		scrollPane.setSize(450, 200);
		scrollPane.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_tabla.add(scrollPane);
		
		
		JButton verListado = new JButton("Ver listado de facturas");
		verListado.setBackground(new Color(0, 128, 255));
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 255, 64));
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		GroupLayout gl_panel_botones = new GroupLayout(panel_botones);
		gl_panel_botones.setHorizontalGroup(
			gl_panel_botones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_botones.createSequentialGroup()
					.addContainerGap()
					.addComponent(verListado)
					.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		gl_panel_botones.setVerticalGroup(
			gl_panel_botones.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_botones.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addGroup(gl_panel_botones.createParallelGroup(Alignment.BASELINE)
						.addComponent(verListado)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_botones.setLayout(gl_panel_botones);
		
		JLabel lblNewLabel_5 = new JLabel("N° de factura:");
		
		JLabel lblNewLabel_6 = new JLabel("Fecha:");
		
		JLabel lblNewLabel_7 = new JLabel("1");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		JLabel lblNewLabel_8 = new JLabel("2021");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		GroupLayout gl_panel_datos_factura = new GroupLayout(panel_datos_factura);
		gl_panel_datos_factura.setHorizontalGroup(
			gl_panel_datos_factura.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_datos_factura.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(133)
					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(132, Short.MAX_VALUE))
		);
		gl_panel_datos_factura.setVerticalGroup(
			gl_panel_datos_factura.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_datos_factura.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_datos_factura.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel_datos_factura.setLayout(gl_panel_datos_factura);
		
		JLabel lblNewLabel_1 = new JLabel("Documento:");
		
		JLabel lblNewLabel_2 = new JLabel("Direccion:");
		
		textField = new JTextField();
		textField.setText("123456");
		textField.setColumns(10);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 # 123");
		txtCalle.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		
		JLabel lblNewLabel_4 = new JLabel("Telefono:");
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setText("Jhon Doe");
		txtJhonDoe.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("5554433");
		textField_3.setColumns(10);
		GroupLayout gl_panel_datos_cliente = new GroupLayout(panel_datos_cliente);
		gl_panel_datos_cliente.setHorizontalGroup(
			gl_panel_datos_cliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_datos_cliente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_datos_cliente.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_datos_cliente.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCalle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(94)
					.addGroup(gl_panel_datos_cliente.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel_datos_cliente.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtJhonDoe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_panel_datos_cliente.setVerticalGroup(
			gl_panel_datos_cliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_datos_cliente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_datos_cliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtJhonDoe, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_datos_cliente.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_datos_cliente.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_datos_cliente.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCalle, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(13, Short.MAX_VALUE))
						.addGroup(gl_panel_datos_cliente.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_datos_cliente.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		panel_datos_cliente.setLayout(gl_panel_datos_cliente);
		
		JLabel lblNewLabel = new JLabel("Factura");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GroupLayout gl_panel_titulo = new GroupLayout(panel_titulo);
		gl_panel_titulo.setHorizontalGroup(
			gl_panel_titulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_titulo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(325, Short.MAX_VALUE))
		);
		gl_panel_titulo.setVerticalGroup(
			gl_panel_titulo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_titulo.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
		);
		panel_titulo.setLayout(gl_panel_titulo);
		contenedor.setLayout(gl_contenedor);

	}
}
