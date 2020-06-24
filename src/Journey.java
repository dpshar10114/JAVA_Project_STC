import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Journey extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
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
					Journey frame = new Journey();
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
	public Journey() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 920, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//haeder
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/transparent.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(57, -5, 800, 200);
		contentPane.add(label);
		
		//title
		JLabel lblUserLogin = new JLabel("JOURNEY DETAILS");
		lblUserLogin.setForeground(new Color(128, 128, 0));
		lblUserLogin.setFont(new Font("Trajan Pro", Font.BOLD, 31));
		lblUserLogin.setBounds(287, 171, 470, 46);
		contentPane.add(lblUserLogin);
		
		//header_text
		JLabel lblNewLabel_1 = new JLabel("Fields marked with * are compulsory to be filled!");
		lblNewLabel_1.setInheritsPopupMenu(false);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(332, 206, 884, 40);
		contentPane.add(lblNewLabel_1);
		
		/* FORM
		 * 
		 */
		//labels
		JLabel lblFirstName = new JLabel("SOURCE CITY : ");
		lblFirstName.setFont(new Font("Arial", Font.BOLD, 13));
		lblFirstName.setBounds(43, 257, 108, 16);
		contentPane.add(lblFirstName);
		
		JLabel lblMiddleName = new JLabel("DATE OF DEPARTURE:");
		lblMiddleName.setFont(new Font("Arial", Font.BOLD, 13));
		lblMiddleName.setBounds(300, 257, 148, 16);
		contentPane.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("DATE OF ARRIVAL:");
		lblLastName.setFont(new Font("Arial", Font.BOLD, 13));
		lblLastName.setBounds(594, 257, 127, 16);
		contentPane.add(lblLastName);
		
		JLabel lblAge = new JLabel("NO OF PASSENGERS:");
		lblAge.setFont(new Font("Arial", Font.BOLD, 13));
		lblAge.setBounds(43, 307, 138, 16);
		contentPane.add(lblAge);
		
		JLabel lblGender = new JLabel("ADULT(>18 & <60):");
		lblGender.setFont(new Font("Arial", Font.BOLD, 13));
		lblGender.setBounds(211, 307, 116, 16);
		contentPane.add(lblGender);
		
		JLabel lblGender1 = new JLabel("CHILDREN(>12 & <18):");
		lblGender1.setFont(new Font("Arial", Font.BOLD, 13));
		lblGender1.setBounds(361, 307, 148, 16);
		contentPane.add(lblGender1);
		
		JLabel lblGender2 = new JLabel("INFANTS(<12):");
		lblGender2.setFont(new Font("Arial", Font.BOLD, 13));
		lblGender2.setBounds(548, 307, 90, 16);
		contentPane.add(lblGender2);
		
		JLabel lblGender3 = new JLabel("SENIOR CTZ.(>60):");
		lblGender3.setFont(new Font("Arial", Font.BOLD, 13));
		lblGender3.setBounds(664, 307, 127, 16);
		contentPane.add(lblGender3);
		
		JLabel lblContactNumber = new JLabel("DESTINATION CITIES:");
		lblContactNumber.setFont(new Font("Arial", Font.BOLD, 13));
		lblContactNumber.setBounds(43, 379, 176, 16);
		contentPane.add(lblContactNumber);
		
		JLabel lblEmailAddress = new JLabel("DESTINATION 1");
		lblEmailAddress.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmailAddress.setBounds(194, 379, 133, 16);
		contentPane.add(lblEmailAddress);
		
		JLabel lblEmailAddress1 = new JLabel("DESTINATION 2");
		lblEmailAddress1.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmailAddress1.setBounds(304, 379, 133, 16);
		contentPane.add(lblEmailAddress1);
		
		JLabel lblEmailAddress2 = new JLabel("DESTINATION 3");
		lblEmailAddress2.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmailAddress2.setBounds(419, 379, 133, 16);
		contentPane.add(lblEmailAddress2);
		
		JLabel lblEmailAddress3 = new JLabel("DESTINATION 4");
		lblEmailAddress3.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmailAddress3.setBounds(531, 379, 133, 16);
		contentPane.add(lblEmailAddress3);
		
		JLabel lblEmailAddress4 = new JLabel("DESTINATION 5");
		lblEmailAddress4.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmailAddress4.setBounds(646, 379, 133, 16);
		contentPane.add(lblEmailAddress4);
		
		JLabel lblEmailAddress5 = new JLabel("DESTINATION 6");
		lblEmailAddress5.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmailAddress5.setBounds(761, 379, 133, 16);
		contentPane.add(lblEmailAddress5);
		
		//fields & menus
		textField = new JTextField();
		textField.setBounds(142, 256, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setBounds(246, 331, 40, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		
		
		
		//end_buttons
		JButton btnSubmit = new JButton("Submit");
		Image img5 = new ImageIcon(this.getClass().getResource("/tick.png")).getImage();
		btnSubmit.setIcon(new ImageIcon(img5));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSubmit.setBounds(236, 486, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton button = new JButton("RESET");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Journey.main(null);
			}
		});
		button.setBounds(589, 486, 89, 23);
		contentPane.add(button);
		
		
		//footer
		JLabel lblNewLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/F_trnsp.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(57, 530, 800, 180);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(405, 331, 40, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(574, 331, 40, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(700, 331, 40, 20);
		contentPane.add(textField_3);
				
	}

}
