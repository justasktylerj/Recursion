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
	private JTextArea resultsArea;


	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("get the fibonacci sequence for this number");
		factoralButton = new JButton("get n!");
		inputField = new JTextField(20);
		resultsArea = new JTextArea(10,20);
		setupPanel();
		setupLayout();
		setupListeners();
	}	

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 60, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, factoralButton, 178, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, factoralButton, -4, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -50, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 35, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, resultsArea, -27, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, fibonacciButton, -6, SpringLayout.NORTH, resultsArea);
		baseLayout.putConstraint(SpringLayout.SOUTH, resultsArea, -25, SpringLayout.SOUTH, this);
		
	}
	private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.setBackground(Color.MAGENTA);
			this.add(inputField);
			this.add(resultsArea);
			this.add(fibonacciButton);
			this.add(factoralButton);
			resultsArea.setWrapStyleWord(true);
			resultsArea.setLineWrap(true);
			resultsArea.setText(baseController.getCalculatedValue());
		}
		//listeners
	private void setupListeners()
		{
			fibonacciButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					String userInput = inputField.getText();
					if(checkInput(userInput))
					{
						resultsArea.setText(baseController.doFibonacci(userInput));
					}
				}
			});
		
		}
		private boolean checkInput(String input)
		{
			boolean isNumber = false;
			
			try
			{
				Integer.parseInt(input);
				isNumber = true;
			}
			catch(Exception numberException)
			{
				resultsArea.setText("type in a number!!!!");
			}
			return isNumber;
		}
}
