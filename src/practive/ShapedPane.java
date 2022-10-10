package practive;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import java.awt.geom.RoundRectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.EtchedBorder;






@SuppressWarnings("serial")
public class ShapedPane extends JPanel{
	
	
	 int MouseX;
 int MouseY;
 int exitX = getWidth()+50;
 boolean recording = false;
	int minX = getWidth()+100;
	public static boolean openned = false;
	
	
	
public ShapedPane() {
		
	
	
	add(main.l);
					
				
					
					
					
					
					
					
					
   }

    public Dimension getPreferredSize() {
        return new Dimension(main.frame.getWidth(), main.frame.getHeight());
    }

    protected void paintComponent(Graphics g) {
        super.getComponents(); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D) g.create();
        RenderingHints hints = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(hints);
        g2d.setColor(getBackground());
        g2d.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(),55,55));
        
        
        Image img1 = Toolkit.getDefaultToolkit().getImage("box.jpg");
        
       
        g2d.drawImage(img1, 0, 30, null);
        g2d.dispose();
        
    }
    

}
