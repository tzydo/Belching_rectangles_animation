

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.function.ToLongBiFunction;

import javax.swing.JFrame;

public class Frame extends JFrame {
    protected static recComponent kc; 
    private static Dimension dim;
    public static int screenHeight;
    public static int screenWidth;
    private Toolkit tol;
        
    
    public Frame() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tol= Toolkit.getDefaultToolkit();
        dim = tol.getScreenSize();
        setSize(dim.width/2,dim.height/2);
        screenHeight = dim.height/2;
        screenWidth = dim.width/2;
        setTitle("Simple animation");
        setLocationRelativeTo(null);
        kc = new recComponent();
        add(kc);
                
        
        setVisible(true);
        
    }
    
    
    
   
}
