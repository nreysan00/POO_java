package Vistas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		getContentPane().setLayout(null);
		setTitle("INGRESA AL SISTEMA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(147, 61, 86, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(147, 86, 108, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(147, 118, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Usuario = txtUsuario.getText();
				String password = txtPassword.getText();
				
				if (Usuario.isEmpty() || password.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Usuario y contraseña son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					if(Usuario.equals("Admin") && password.equals("")) {
						JOptionPane.showMessageDialog(null, "¡Bienvenido al sistema!", "Information", JOptionPane.INFORMATION_MESSAGE);
						txtUsuario.setText();
						txtPassword.setText();
						
						Home home = new Home();
						home.setExtendedState(MAXIMIZED_BOTH);
						home.setVisible(true);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Usuario incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
						txtUsuario.setText();
						txtPassword.setText();
					}
				}
			}
			
		});
		btnNewButton.setBounds(166, 185, 89, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(147, 143, 108, 20);
		contentPane.add(passwordField);
	}
}
