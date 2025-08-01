package Atividades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aluno {
private JFormattedTextField txtN1;
private JFormattedTextField txtN2;
private JFormattedTextField txtN3;
private JFormattedTextField txtN4;
private double numero1;
private double numero2;
private double numero3;
private double numero4;
private double media;
	private JFrame frmAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aluno window = new aluno();
					window.frmAluno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public aluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAluno = new JFrame();
		frmAluno.setTitle("Aluno");
		frmAluno.setBounds(100, 100, 450, 421);
		frmAluno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAluno.getContentPane().setLayout(null);
		try {
			MaskFormatter mask1 = new MaskFormatter("##.##");
			txtN1 = new JFormattedTextField(mask1);
			MaskFormatter mask2 = new MaskFormatter("##.##");
			txtN2 = new JFormattedTextField(mask2);
			MaskFormatter mask3 = new MaskFormatter("##.##");
			txtN3 = new JFormattedTextField(mask3);
			MaskFormatter mask4 = new MaskFormatter("##.##");
			txtN4 = new JFormattedTextField(mask4);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"erro ao formatar","erro",-1);
		}
		JLabel lblBet1 = new JLabel("A Bet da Estrela");
		JLabel lblResultadoFinal = new JLabel("RESULTADO FINAL");
		lblResultadoFinal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResultadoFinal.setBounds(84, 25, 316, 37);
		frmAluno.getContentPane().add(lblResultadoFinal);
		
		JLabel lblNota1 = new JLabel("Primeira Nota");
		lblNota1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota1.setBounds(45, 97, 97, 26);
		frmAluno.getContentPane().add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Segunda Nota");
		lblNota2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota2.setBounds(45, 141, 97, 26);
		frmAluno.getContentPane().add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Terceira Nota");
		lblNota3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota3.setBounds(45, 189, 97, 26);
		frmAluno.getContentPane().add(lblNota3);
		
		JLabel lblN4 = new JLabel("Quarta Nota");
		lblN4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN4.setBounds(45, 238, 97, 26);
		frmAluno.getContentPane().add(lblN4);
		
		//txtN1 = new JFormattedTextField();
		txtN1.setBounds(189, 102, 59, 20);
		frmAluno.getContentPane().add(txtN1);
		
		//txtN2 = new JFormattedTextField();
		txtN2.setBounds(189, 146, 59, 20);
		frmAluno.getContentPane().add(txtN2);
		
		//txtN3 = new JFormattedTextField();
		txtN3.setBounds(189, 194, 59, 20);
		frmAluno.getContentPane().add(txtN3);
		
		//txtN4 = new JFormattedTextField();
		txtN4.setBounds(189, 243, 59, 20);
		frmAluno.getContentPane().add(txtN4);
		
		JButton btnResultado = new JButton("RESULTADO");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtN1.getText());
				txtN1.setText("");
				numero2 = Double.parseDouble(txtN2.getText());
				txtN2.setText("");
				numero3 = Double.parseDouble(txtN3.getText());
				txtN3.setText("");
				numero4 = Double.parseDouble(txtN4.getText());
				txtN4.setText("");
				media = ((numero1+numero2+numero3+numero4)/4);
				if(media >= 06.00) {
					JOptionPane.showMessageDialog(null,"Media : "+media+"\n Aprovado","Aluno",1);
				}
			}
		});
		btnResultado.setBounds(66, 311, 150, 23);
		frmAluno.getContentPane().add(btnResultado);
	}

}
