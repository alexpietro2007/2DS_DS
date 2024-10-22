package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setBackground(new Color(240, 255, 255));
		setForeground(new Color(210, 105, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 624);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setForeground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botao = new JButton("but\u00E3o");
		botao.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		botao.setBackground(new Color(255, 175, 175));
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botao.setBounds(178, 506, 89, 23);
		contentPane.add(botao);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(Principal.class.getResource("/img/1189170.png")));
		img.setBounds(168, 0, 476, 488);
		contentPane.add(img);
		
		JButton buzao = new JButton("buz\u00E3o");
		buzao.setForeground(new Color(148, 0, 211));
		buzao.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		buzao.setBackground(Color.PINK);
		buzao.setBounds(543, 506, 89, 23);
		contentPane.add(buzao);
	}
}
