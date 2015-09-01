package main;

import javax.swing.*;
import java.awt.*;

class GUI extends JFrame
{

	private static final long serialVersionUID = -7751729052798952859L;

	public GUI()
	{
		setTitle("DallOpoly");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1,1);
		setVisible(true);

		setLayout(new GridLayout(0,12));
		
		//add(new JLabel(new ImageIcon("C://Users/plk6272/Documents/GitHub/DallOpoly/images/board.jpg")), BorderLayout.CENTER);
		//setLayout(new FlowLayout());
			
		//add(new JLabel(new ImageIcon("C://Users/plk6272/Documents/GitHub/DallOpoly/images/piece.png")), BorderLayout.NORTH);
		//setLayout(new FlowLayout());
		
		for(int i = 0; i < 120; i++) {
			if((i < 12) || (i > 107 && i < 120) || (0 == i % 12) || (0 == (i - 11) % 12))
			add(new JButton("" + i));
			else
				add(new JLabel());
		}
		

		setSize(800,600);
	}
}