package Vistas;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jinternalprueba extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfGenero;
	private JInternalFrame labelResultado;
	//private JLabel labelResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jinternalprueba frame = new jinternalprueba();
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
	public jinternalprueba() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		setBackground(SystemColor.window);
		setTitle("Nuevos ingresos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nuevo Empleado");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(83, 29, 217, 14);
		getContentPane().add(lblNewLabel);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(77, 60, 104, 20);
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellidos = new JTextField();
		tfApellidos.setBounds(77, 125, 104, 20);
		getContentPane().add(tfApellidos);
		tfApellidos.setColumns(10);
		
		tfGenero = new JTextField();
		tfGenero.setBounds(77, 94, 104, 20);
		getContentPane().add(tfGenero);
		tfGenero.setColumns(10);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelResultado.setTitle("");        
		        try {
		          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/casopractico","root" ,"");
		          Statement comando=conexion.createStatement();
		          comando.executeUpdate("insert into empleados(nombre,apellidos,genero) values ('"+tfNombre.getText()+"',"+tfApellidos.getText()+"',"+tfGenero.getText()+")");
		          conexion.close();
		          labelResultado.setTitle("se registraron los datos");
		          tfNombre.setText("");
		          tfApellidos.setText("");
		          tfGenero.setText("");
		        } catch(SQLException ex){
		          setTitle(ex.toString());
		        }
			}
		});
		btnNewButton.setBounds(92, 156, 89, 23);
		getContentPane().add(btnNewButton);
		cargarDriver();
	}
		private void cargarDriver() {
		    try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		    }catch(Exception ex) {
		      setTitle(ex.toString());
		    }
		}
	
}

