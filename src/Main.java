import java.awt.EventQueue;

import javax.swing.JFrame;

public class Main extends JFrame{
	
	public Main() { 
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setSize(1740, 720);
        setResizable(false);
        
        setTitle("Tower Defense Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
            	Main ex = new Main();
                ex.setVisible(true);
            }
        });
    }
	

}
