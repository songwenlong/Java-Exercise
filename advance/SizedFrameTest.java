package ChapterSeven;
import java.awt.*;
import javax.swing.*;

public class SizedFrameTest {
	public static void main(String args[]){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				JFrame frame1 = new SizedFrame();
				frame1.setTitle("SizedFrame");
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(true);
				
				JFrame frame2 = new SizedFrame();
				frame2.setTitle("SizedFrame");
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.setVisible(true);
			}
		});
	}
}

class SizedFrame extends JFrame{
	public SizedFrame(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height; 
		int screenWidth = screenSize.width;
		
		setSize(screenWidth/2, screenHeight/2);
		setLocationByPlatform(true);
		
		Image img = new ImageIcon("E:\\picture\\beauty.jpg").getImage();
		setIconImage(img);
	}
}
