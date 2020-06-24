import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.ScrollPane;
import java.awt.Choice;

public class Passenger extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passenger frame = new Passenger();
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
	public Passenger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 920, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//header logo
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/transparent.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(57, -5, 800, 200);
		contentPane.add(label);
		
		//header
		JLabel lblUserLogin = new JLabel("NEW BOOKING FORM");
		lblUserLogin.setForeground(new Color(128, 128, 0));
		lblUserLogin.setFont(new Font("Trajan Pro", Font.BOLD, 31));
		lblUserLogin.setBounds(287, 171, 470, 46);
		contentPane.add(lblUserLogin);
		
		//header sub text
		JLabel lblNewLabel_1 = new JLabel("Fields marked with * are compulsory to be filled!");
		lblNewLabel_1.setInheritsPopupMenu(false);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(332, 206, 884, 40);
		contentPane.add(lblNewLabel_1);
		
		
		/*FORM
		 * 
		 */
			
		
		JLabel lblFirstName = new JLabel("FIRST NAME:");
		lblFirstName.setFont(new Font("Arial", Font.BOLD, 13));
		lblFirstName.setBounds(121, 257, 90, 16);
		contentPane.add(lblFirstName);
		
		JLabel lblMiddleName = new JLabel("MIDDLE NAME:");
		lblMiddleName.setFont(new Font("Arial", Font.BOLD, 13));
		lblMiddleName.setBounds(382, 257, 108, 16);
		contentPane.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("LAST NAME:");
		lblLastName.setFont(new Font("Arial", Font.BOLD, 13));
		lblLastName.setBounds(649, 257, 90, 16);
		contentPane.add(lblLastName);
		
		JLabel lblAge = new JLabel("AGE:");
		lblAge.setFont(new Font("Arial", Font.BOLD, 13));
		lblAge.setBounds(252, 307, 36, 16);
		contentPane.add(lblAge);
		
		JLabel lblGender = new JLabel("GENDER:");
		lblGender.setFont(new Font("Arial", Font.BOLD, 13));
		lblGender.setBounds(561, 307, 90, 16);
		contentPane.add(lblGender);
		
		JLabel lblContactNumber = new JLabel("CONTACT NUMBER:");
		lblContactNumber.setFont(new Font("Arial", Font.BOLD, 13));
		lblContactNumber.setBounds(252, 368, 133, 16);
		contentPane.add(lblContactNumber);
		
		JLabel lblEmailAddress = new JLabel("EMAIL ADDRESS:");
		lblEmailAddress.setFont(new Font("Arial", Font.BOLD, 13));
		lblEmailAddress.setBounds(252, 334, 133, 16);
		contentPane.add(lblEmailAddress);
		
		JLabel lblResidentialAddress = new JLabel("RESIDENTIAL ADDRESS:");
		lblResidentialAddress.setFont(new Font("Arial", Font.BOLD, 13));
		lblResidentialAddress.setBounds(252, 394, 162, 16);
		contentPane.add(lblResidentialAddress);
		
		JLabel lblGovermentId = new JLabel("GOVERMENT ID:");
		lblGovermentId.setFont(new Font("Arial", Font.BOLD, 13));
		lblGovermentId.setBounds(252, 440, 108, 16);
		contentPane.add(lblGovermentId);
		
		JLabel lblGovermentIdNumber = new JLabel("GOVERMENT ID NUMBER:");
		lblGovermentIdNumber.setFont(new Font("Arial", Font.BOLD, 13));
		lblGovermentIdNumber.setBounds(516, 440, 162, 16);
		contentPane.add(lblGovermentIdNumber);
		
		JLabel label_1 = new JLabel("*");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Arial", Font.BOLD, 18));
		label_1.setBounds(206, 259, 36, 16);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("*");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Arial", Font.BOLD, 18));
		label_3.setBounds(732, 257, 36, 16);
		contentPane.add(label_3);
		
		JLabel label_2 = new JLabel("*");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Arial", Font.BOLD, 18));
		label_2.setBounds(287, 306, 36, 16);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Arial", Font.BOLD, 18));
		label_4.setBounds(619, 306, 36, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Arial", Font.BOLD, 18));
		label_5.setBounds(366, 333, 36, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Arial", Font.BOLD, 18));
		label_6.setBounds(382, 367, 36, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("*");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Arial", Font.BOLD, 18));
		label_7.setBounds(405, 393, 36, 16);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("*");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Arial", Font.BOLD, 18));
		label_8.setBounds(356, 439, 17, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("*");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Arial", Font.BOLD, 18));
		label_9.setBounds(675, 439, 17, 16);
		contentPane.add(label_9);
		
		textField = new JTextField();
		textField.setBounds(216, 256, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(483, 256, 144, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(742, 256, 144, 20);
		contentPane.add(textField_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textArea.setLineWrap(true);
		textArea.setBounds(424, 391, 260, 40);
		contentPane.add(textArea);
		
		JRadioButtonMenuItem rdbtnmntmM = new JRadioButtonMenuItem("M");
		rdbtnmntmM.setBounds(629, 301, 47, 22);
		contentPane.add(rdbtnmntmM);
		
		JRadioButtonMenuItem rdbtnmntmF = new JRadioButtonMenuItem("F");
		rdbtnmntmF.setBounds(686, 301, 47, 22);
		contentPane.add(rdbtnmntmF);
		
		JRadioButtonMenuItem rdbtnmntmOther = new JRadioButtonMenuItem("Other");
		rdbtnmntmOther.setBounds(742, 301, 66, 22);
		contentPane.add(rdbtnmntmOther);
		
		textField_3 = new JTextField();
		textField_3.setBounds(297, 306, 66, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(382, 333, 175, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(395, 367, 175, 20);
		contentPane.add(textField_5);
		
		/* Buttons
		 * 
		 */
		
		JButton btnSubmit = new JButton("Submit");
		Image img5 = new ImageIcon(this.getClass().getResource("/tick.png")).getImage();
		btnSubmit.setIcon(new ImageIcon(img5));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Journey.main(null);
			}
		});
		btnSubmit.setBounds(236, 486, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton button = new JButton("RESET");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Passenger.main(null);
			}
		});
		button.setBounds(589, 486, 89, 23);
		contentPane.add(button);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(688, 439, 175, 20);
		contentPane.add(textField_6);
		
		//footer
		JLabel lblNewLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/F_trnsp.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(57, 530, 800, 180);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
