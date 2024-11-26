import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/img/images.jpg")));
		lblNewLabel.setBounds(264, 52, 332, 339);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar Amigo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarAmigo ca = new CadastrarAmigo();
				ca.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(153, 50, 204));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(130, 430, 189, 35);
		contentPane.add(btnNewButton);
		
		JButton btnVerAmigos = new JButton("Ver Amigos");
		btnVerAmigos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerAmigos va = new VerAmigos();
				va.setVisible(true);
			}
		});
		btnVerAmigos.setForeground(Color.BLACK);
		btnVerAmigos.setBackground(new Color(153, 50, 204));
		btnVerAmigos.setBounds(554, 430, 189, 35);
		contentPane.add(btnVerAmigos);
		
		JButton btnAtualize = new JButton("Atualizar Amigo");
		btnAtualize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atualizar at = new Atualizar();
				at.setVisible(true);
			}
		});
		btnAtualize.setForeground(Color.BLACK);
		btnAtualize.setBackground(new Color(153, 50, 204));
		btnAtualize.setBounds(359, 430, 163, 35);
		contentPane.add(btnAtualize);
		
		JLabel lblNewLabel_1 = new JLabel("Meus Amigos");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(310, 42, 231, 70);
		contentPane.add(lblNewLabel_1);
	}
}
