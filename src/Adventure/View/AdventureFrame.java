package Adventure.View;

import java.applet.AudioClip;
import java.awt.Frame;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Adventure.Controller.AdventureController;


public class AdventureFrame extends JFrame
{
	private AdventureController baseController;
	private AdventurePanel basePanel;
	
	
	public AdventureFrame(AdventureController baseController)
	{
		this.baseController = baseController;
		basePanel = new AdventurePanel(baseController);
		
		//soundPath = getClass().getResource("/Adventure/View/sounds/ahem_x.wav");
		
		setupFrame();
		playMusic();
	}
	
	private void playMusic()
	{

	}
	
	
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,400);
		this.setVisible(true);
		
	}
	

	
}
