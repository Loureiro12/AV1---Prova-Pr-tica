package Prova1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class qustao2 extends JFrame {

	private JPanel contentPane;
	private JTextField ids;
	private JTextField classes;
	private JTextField tags;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					qustao2 frame = new qustao2();
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
	public qustao2() {
		setType(Type.UTILITY);
		setTitle("Calculadora CSS ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qtde de Seletores IDs");
		lblNewLabel.setBounds(30, 46, 150, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Qtde de Seletores classes");
		lblNewLabel_1.setBounds(30, 98, 169, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qtde de Seletores Tags");
		lblNewLabel_2.setBounds(30, 156, 150, 16);
		contentPane.add(lblNewLabel_2);
		
		ids = new JTextField();
		ids.setBounds(192, 41, 130, 26);
		contentPane.add(ids);
		ids.setColumns(10);
		
		classes = new JTextField();
		classes.setBounds(211, 93, 130, 26);
		contentPane.add(classes);
		classes.setColumns(10);
		
		tags = new JTextField();
		tags.setBounds(211, 151, 130, 26);
		contentPane.add(tags);
		tags.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(ids.getText()) * 100;
				int classe = Integer.parseInt(classes.getText()) * 20;
				int tag = Integer.parseInt(tags.getText()) * 1;
				
				int soma = id + classe + tag;
				
				JOptionPane.showMessageDialog(null, "A quantidade total de pontos é " + soma + "\n IDs = " + id + " Classes = " + classe + " Tags = " + tag);
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(158, 226, 117, 29);
		contentPane.add(btnNewButton);
	}
}
