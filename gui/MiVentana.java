package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import javax.swing.JFormattedTextField;

public class MiVentana extends JFrame {
	public MiVentana() {
		getContentPane().setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel lblNro1 = new JLabel("N\u00FAmero 1:");
		getContentPane().add(lblNro1);
		
		JFormattedTextField txtNro1 = new JFormattedTextField();
		getContentPane().add(txtNro1);
		
		JLabel lblNro2 = new JLabel("N\u00FAmero 2:");
		getContentPane().add(lblNro2);
		
		JFormattedTextField txtNro2 = new JFormattedTextField();
		getContentPane().add(txtNro2);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "El resultado es " + (Integer.parseInt(txtNro1.getText()) + Integer.parseInt(txtNro2.getText())));
			}
		});
		getContentPane().add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "El resultado es " + (Integer.parseInt(txtNro1.getText()) - Integer.parseInt(txtNro2.getText())));
			}
		});
		getContentPane().add(btnRestar);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "El resultado es " + (Integer.parseInt(txtNro1.getText()) * Integer.parseInt(txtNro2.getText())));
			}
		});
		getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNro2.getText().isEmpty() || Integer.parseInt(txtNro2.getText())==0)
					JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
				else
					JOptionPane.showMessageDialog(null, "El resultado es " + (Double.parseDouble(txtNro1.getText()) / Double.parseDouble(txtNro2.getText())));
			}
		});
		getContentPane().add(btnDividir);
	}
}
