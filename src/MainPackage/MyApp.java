package MainPackage;

import java.awt.*;
import javax.swing.*;

public class MyApp {
	
	public void createWindow(String windowTitle)
	{
		JFrame appWindow = new JFrame(windowTitle);
		appWindow.setSize(1500,800);
		
		JPanel methods = new JPanel();
		methods.setBounds(0,0,200,800);
		methods.setBackground(Color.DARK_GRAY);
		
		JLabel methodsTitle = new JLabel("Methods");
		methodsTitle.setBounds(20, 30, 100, 50);
		methodsTitle.setForeground(Color.WHITE);
		
		methods.add(methodsTitle);
		appWindow.add(methods);
		
		JPanel title = new JPanel();
		title.setBounds(200,0,1300,100);
		title.setBackground(Color.GRAY);
		
		JLabel titleText = new JLabel("Encryption - Decryption");
		titleText.setBounds(100, 40, 400, 50);
		titleText.setForeground(Color.GREEN);
		
		title.add(titleText);
		appWindow.add(title);
		
		JPanel convert = new JPanel();
		convert.setBounds(200,100,1300,700);
		convert.setBackground(Color.LIGHT_GRAY);
		convert.setLayout(null);
		
		JTextField plainText = new JTextField();
		plainText.setBounds(50,50,550,550);
		
		JTextField cipherText = new JTextField();
		cipherText.setBounds(700,50,550,550);
		
		convert.add(plainText);
		convert.add(cipherText);
		appWindow.add(convert);
		
		appWindow.setResizable(false);
		appWindow.setLayout(null);
		appWindow.setVisible(true);
	}
}
