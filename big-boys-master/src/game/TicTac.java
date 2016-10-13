package game;
import javax.swing.*;
public class TicTac {
	public void init() {
        
        
    }
    public void start(){
        JFrame window = new JFrame();
        window.setSize(640, 480);
        window.setTitle("Tic Tac Toe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        drawingComponent d = new drawingComponent();
        window.add(d);
    }
    public void paint(Graphics g){
        int mouseY = MouseInfo.getPointerInfo().getLocation().y;
        int mouseX = MouseInfo.getPointerInfo().getLocation().x; 
        
        g.drawString(mouseX, 40, 40);
    }
    public void stop(){
        
    }
    public void destroy(){
        
    }
}
