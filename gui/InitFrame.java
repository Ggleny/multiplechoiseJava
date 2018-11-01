package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import test.Tema;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class InitFrame extends JFrame {
	public InitFrame(ArrayList<Tema> temas) {
		
		InitFrame me = this;
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblElijaUnTema = new JLabel("Elija un tema");
		panel.add(lblElijaUnTema);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		for (Tema tema : temas) {
			JButton btnNewButton = new JButton(tema.getNombre());
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					QuestionFrame aux = new QuestionFrame(tema.getPreguntas());
					me.setVisible(false);
					aux.setVisible(true);
					aux.pack();
				}
			});
			panel_1.add(btnNewButton);
		}
		
	}

}
