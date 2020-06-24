import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Font;

public class logo_home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logo_home frame = new logo_home();
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
	public logo_home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(810,910);
		setBounds(0, 0, 800, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/transparent.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(-10, 0, 800, 200);
		contentPane.add(label);
		
		JLabel lblUserLogin = new JLabel("Welcome To Discover");
		lblUserLogin.setForeground(new Color(128, 128, 0));
		lblUserLogin.setFont(new Font("Trajan Pro", Font.BOLD, 35));
		lblUserLogin.setBounds(179, 232, 752, 46);
		contentPane.add(lblUserLogin);
		
		JButton lblNewLabel = new JButton("");
		Image img2 = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(294, 360, 221, 224);
		contentPane.add(lblNewLabel);
		
		JLabel lblClickTheLogo = new JLabel("Click The Logo To Begin!!");
		lblClickTheLogo.setForeground(new Color(128, 128, 0));
		lblClickTheLogo.setFont(new Font("Trajan Pro", Font.BOLD, 34));
		lblClickTheLogo.setBounds(152, 289, 752, 46);
		contentPane.add(lblClickTheLogo);
		lblNewLabel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0)
			{
				Home1.main(null);
			}
		});
		
	
	}
}
