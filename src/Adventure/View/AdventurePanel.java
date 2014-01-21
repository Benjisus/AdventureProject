package Adventure.View;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import Adventure.Controller.AdventureController;





public class AdventurePanel extends JPanel
{

	private AdventureController baseController;
	private JButton submitButton;
	private JTextField userInputField;
	private JTextArea chatArea;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private ImageIcon pictureSource;
	private Image baseImage;
	

	public AdventurePanel(AdventureController baseController)
	{
		this.baseController = baseController;

		chatArea = new JTextArea(10, 38);
		submitButton = new JButton("What does thou say");
		userInputField = new JTextField(30);
		textPane = new JScrollPane(chatArea);
		baseLayout = new SpringLayout();
		pictureSource = new ImageIcon(getClass().getResource("/Adventure/View/images/heaven and hell.jpg"));
		setupPanel();
		setupLayout();
		setupListeners();
		startAdventure();
		
	}
	
	
	

	private void startAdventure()
	{

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(userInputField);
		this.add(textPane);
		this.setSize(500, 400);
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		userInputField.setOpaque(false);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 120,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -120,
				SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, userInputField, 50,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, userInputField, -50,
				SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, -40,
				SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 50,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane, -50,
				SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, userInputField, -87,
				SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 50,
				SpringLayout.WEST, this);
	}
	
	
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, getWidth(), getHeight(), null);
	}
	


	private void setupListeners()
	{

	}
	
}
