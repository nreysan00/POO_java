package Vistas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;

public class jframeprueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel labelResultado;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfGenero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframeprueba frame = new jframeprueba();
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
	public jframeprueba() {
		setTitle("Ingresar nuevo empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuevo empleado");
		lblNewLabel.setForeground(SystemColor.activeCaptionBorder);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(141, 24, 139, 20);
		contentPane.add(lblNewLabel);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(141, 55, 111, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellidos = new JTextField();
		tfApellidos.setBounds(141, 91, 111, 20);
		contentPane.add(tfApellidos);
		tfApellidos.setColumns(10);
		
		tfGenero = new JTextField();
		tfGenero.setBounds(141, 122, 111, 20);
		contentPane.add(tfGenero);
		tfGenero.setColumns(10);
		
		JButton btnNewButton = new JButton("Registar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setText("");        
		        try {
		          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/casopractico","root" ,"");
		          Statement comando=conexion.createStatement();
		          comando.executeUpdate("insert into empleado(nombre,apellidos,genero) values ('"+tfNombre.getText()+"','"+tfApellidos.getText()+"','"+tfGenero.getText()+"')");
		          conexion.close();
		          labelResultado.setText("se registraron los datos");
		          tfNombre.setText("");
		          tfApellidos.setText("");
		          tfGenero.setText("");
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }
			}
		});
		btnNewButton.setBounds(163, 153, 89, 23);
		contentPane.add(btnNewButton);
		cargarDriver();
		
		labelResultado = new JLabel("resultado");
	    labelResultado.setBounds(290, 125, 229, 14);
	    contentPane.add(labelResultado);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(39, 58, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setBounds(39, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Género");
		lblNewLabel_3.setBounds(39, 125, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
	
	private void cargarDriver() {
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	    }catch(Exception ex) {
	      setTitle(ex.toString());
	    }
	  }
}
