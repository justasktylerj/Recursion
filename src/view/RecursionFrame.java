package view;

import javax.swing.JFrame;
import controller.RecursionController;

public class RecursionFrame extends JFrame
{
	private RecursionPanel basePanel;
	private RecursionController baseController;
	
	public RecursionFrame(RecursionController baseController)
	{
		this.baseController = baseController;
		basePanel = new RecursionPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);  //installs the panel in the frame
		this.setSize(400,400);
		this.setTitle(""); // find a good size for app
		this.setResizable(false); //can't change size of window
		this.setVisible(true);  //must be last line of setupFrame
	}
	
	public RecursionController getBaseController()
	{
		return baseController;
	}

}
