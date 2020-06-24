import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Home1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home1 frame = new Home1();
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
	public Home1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(820,910);
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
		
		JButton btnNewButton = new JButton("");
		Image img2 = new ImageIcon(this.getClass().getResource("/user.png")).getImage();	
		btnNewButton.setIcon(new ImageIcon(img2));
		btnNewButton.setBounds(105,232 ,289 , 280);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				user_login.main(null);
			}
		});
		
		
		
		
		
		JButton btnNewButton1 = new JButton("");
		Image img3 = new ImageIcon(this.getClass().getResource("/admin.png")).getImage();
		btnNewButton1.setIcon(new ImageIcon(img3));
		btnNewButton1.setBounds(514,232 ,289 , 280);
		contentPane.add(btnNewButton1);
		btnNewButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				admin_login.main(null);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/F_trnsp.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(57, 528, 800, 180);
		contentPane.add(lblNewLabel);
		
		
	}
}
