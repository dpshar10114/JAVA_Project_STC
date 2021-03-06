import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSlider;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Dimension;
import java.awt.TextArea;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class user_login extends JFrame {

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
					user_login frame = new user_login();
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
	public user_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 920, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/transparent.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(57, 0, 800, 200);
		contentPane.add(label);
		
		
		
		
		JLabel lblNewLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/F_trnsp.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(70, 530, 800, 180);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserLogin = new JLabel("USER LOGIN");
		lblUserLogin.setForeground(new Color(128, 128, 0));
		lblUserLogin.setFont(new Font("Trajan Pro", Font.BOLD, 31));
		lblUserLogin.setBounds(345, 211, 470, 46);
		contentPane.add(lblUserLogin);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 17));
		lblUsername.setBounds(284, 298, 165, 58);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 17));
		lblPassword.setBounds(284, 344, 165, 58);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(396, 319, 233, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(396, 365, 233, 20);
		contentPane.add(passwordField);
		
		JLabel label_1 = new JLabel("*");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setForeground(new Color(139, 0, 0));
		label_1.setBounds(380, 318, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(new Color(139, 0, 0));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(380, 368, 46, 14);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("Users which have already made a booking can login to Manage / View their booking with \"BookingID\" as UserName & \"Booking_Contact_Number\" as Password! ");
		lblNewLabel_1.setInheritsPopupMenu(false);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 268, 884, 40);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("FOR NEW BOOKING CLICK HERE!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Passenger.main(null);
			}
		});
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setFont(new Font("Trajan Pro", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(128, 128, 0));
		btnNewButton.setInheritsPopupMenu(true);
		btnNewButton.setBounds(284, 447, 377, 46);
		contentPane.add(btnNewButton);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBackground(SystemColor.text);
		btnLogIn.setDefaultCapable(false);
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogIn.setBounds(539, 392, 89, 23);
		contentPane.add(btnLogIn);
		//lblNewLabel_1.setBackground();
	}
}
