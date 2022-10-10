package practive;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;


public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static main frame;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new main();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private boolean uppressed=false;
	private boolean downpressed=false;
	
	public static  int width=100;
	public static ImageIcon b = new ImageIcon("box.jpg");
	
	
public static 	JLabel l = new JLabel("Box",b,JLabel.CENTER);
	
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 400);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		UpAction w = new UpAction();
		UpReleased nonw = new UpReleased();
		
		contentPane.getInputMap().put(KeyStroke.getKeyStroke("W"), "w");
		contentPane.getActionMap().put("w", w);
		contentPane.getInputMap().put(KeyStroke.getKeyStroke("released W"), "nonw");
		contentPane.getActionMap().put("nonw", nonw);
		
		DownAction s = new DownAction();
		DownReleased nons = new DownReleased();
		contentPane.getInputMap().put(KeyStroke.getKeyStroke("S"), "s");
		contentPane.getActionMap().put("s", s);
		contentPane.getInputMap().put(KeyStroke.getKeyStroke("released S"), "nons");
		contentPane.getActionMap().put("nons", nons);
		
		
		
		Timer timer = new Timer(1, new ActionListener() {
	        public void actionPerformed(ActionEvent a) {
	        	
	        	if(uppressed ==true) {
	        		
	        		int width2 = width*2;
	        		
	        		//BufferedImage resizedImage = new BufferedImage(width, width);
	        		//Graphics2D g = resizedImage.createGraphics();
	        	//	g.drawImage(b.getImage().getScaledInstance(width, width, DO_NOTHING_ON_CLOSE), 0, 0, width2 , width2 , null);
	        	//	g.dispose();
	        		
	        		
	        		if(width<400) {
	        		width+=20;
	        		repaint();
	        		
	        		contentPane.paint(getGraphics());
	        		main.b.setImage(main.b.getImage().getScaledInstance(main.width,main.width, 0));
	        		}
	        		
	        	}
	        	if(downpressed ==true) {
	        		if(width>20) {
	        		width-=20;
	        		repaint();
	        		
	        		contentPane.paint(getGraphics());
	        		main.b.setImage(main.b.getImage().getScaledInstance(main.width,main.width, 0));
	        		}
	        		////int width2 = width/2;
	        		//BufferedImage resizedImage = new BufferedImage(width2, width2, width2);
	        		//Graphics2D g = resizedImage.createGraphics();
	        		//g.drawImage(b.getImage().getScaledInstance(width, width, DO_NOTHING_ON_CLOSE), 0, 0, width2 , width2 , null);
	        		//g.dispose();
	        		
	        	}
	        	
	        	
	        }});timer.start();
	        
		
		contentPane.add(l);
		
	}
	class UpAction extends AbstractAction{
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			uppressed=true;
			//leftpressed=false;
		}
		
	}
	class UpReleased extends AbstractAction{

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		uppressed=false;
		//leftpressed=false;
	}

	}
	class DownAction extends AbstractAction{
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			downpressed=true;
			//leftpressed=false;
		}
		
	}
	class DownReleased extends AbstractAction{

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		downpressed=false;
		//leftpressed=false;
	}

	}

}

