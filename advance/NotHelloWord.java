package ChapterSeven;
import java.awt.*;
import javax.swing.*;

public class NotHelloWord {
	public static void main(String args[]){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new NotHelloWorldFrame();
				frame.setTitle("NotHelloWorld");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class NotHelloWorldFrame extends JFrame{
	public NotHelloWorldFrame(){
		add(new NotHelloWorldComponent());
		pack();
	}
}

class NotHelloWorldComponent extends JComponent{
	public static final int MESSAGE_X = 75;
	public static final int MESSAGE_Y = 100;
	
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	
	public void paintComponent(Graphics g){
		g.drawString("Not a Hello Word program", MESSAGE_X, MESSAGE_Y);
	}
	public Dimension getPreferredSize(){
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
}