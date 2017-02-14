package hw1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//face
		g.setColor(Color.PINK);
		g.fillOval(10, 10, 200, 200);
		//eyes
		g.setColor(Color.lightGray);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		//mouth
		g.fillOval(50, 110, 120, 60);
		//"touch up" the mouth into a smile
		g.setColor(Color.pink);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawSmiley panel = new DrawSmiley();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230, 250);
		application.setVisible(true);
	}

}
