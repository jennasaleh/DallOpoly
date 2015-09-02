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
		
	}
	
	public void draw(Board b) {
		this.getContentPane().removeAll();
		int counter = 0;
		String ownerColor = "";
		for(int i = 0; i < 120; i++) {
			
			if(b.getTile(counter).getOwnedBy() != null ) {
				ownerColor = b.getTile(counter).getOwnedBy().getColor();
			} else {
				ownerColor = "#000000";
			}
			
			if((i < 12) || (i > 107 && i < 120) || (0 == i % 12) || (0 == (i - 11) % 12)) {
				JLabel l = new JLabel("<html><div style=\"text-align: center; border: 2px solid; width: 50px; " + ownerColor + ";\">" 
			+ counter + "<br>" 
			+ "<span style=\"color: #00ff00;\">•</span>" + "<br>" 
			+ "$" + b.getTile(counter).getCost() +  "</div></html>");
				
				add(l);
				counter++;
			}
			
			else
				add(new JLabel());
			
			
		}
		
		this.getContentPane().repaint();
		setSize(899,899);
		setSize(900,900);
	}
	
	
}