package view;

import javax.swing.*;

import controller.RecursionController;

import java.awt.Color;
import java.awt.event.*;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JButton fibonacciButton;
	private JButton factoralButton;
	private JTextField inputField;
	private SpringLayout baseLayout;
	private JTextArea displayArea;


	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("");
		factoralButton = new JButton("");
		inputField = new JTextField("", 20);
		displayArea = new JTextArea(10,30);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}	

	private void setupLayout()
	{
		
	}
	private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.setBackground(Color.MAGENTA);
			this.add(inputField);
			this.add(displayArea);
			this.add(fibonacciButton);
			this.add(factoralButton);
		}
		//listeners
	private void setupListeners()
	{
		
	}
}
