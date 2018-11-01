package gui;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import test.Pregunta;

import javax.swing.JRadioButton;

public class QuestionFrame extends JFrame {
	public QuestionFrame(ArrayList<Pregunta> preguntas) {
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		JLabel lblNewLabel = new JLabel("");
		panel_2.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Verdadero");
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Falso");
		panel_1.add(rdbtnNewRadioButton_1);

		for(int i = 0; i<preguntas.size();i++){
			lblNewLabel.setText(preguntas.get(i).getPregunta());
		}
		
		
	}
}
