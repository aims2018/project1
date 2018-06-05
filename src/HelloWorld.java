import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class HelloWorld extends JFrame implements ActionListener {
	private JButton button;
	
	public HelloWorld(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		add(button = new JButton("Change Color"));
		
		button.addActionListener(this);
	}

	private Color createColor() {
		int red = (int)(256*Math.random());
		int green = (int)(256*Math.random());
		int blue = (int)(256*Math.random());
		
		return(new Color(red,green,blue));
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(createColor());
		
		g.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		
		g.drawString("Hello", 100, 300);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //   JOptionPane.showMessageDialog(null,"Hello, World");
		
		HelloWorld helloWorld = new HelloWorld("Java");
		
		helloWorld.setSize(400,400);
		helloWorld.setLocationRelativeTo(null);
		helloWorld.setDefaultCloseOperation(EXIT_ON_CLOSE);
		helloWorld.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		repaint();
		
	}

}
