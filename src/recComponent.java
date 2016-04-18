

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class recComponent extends JComponent{

    public static ArrayList<Rect>lista = new ArrayList<Rect>();
    protected static Thread watek;
  
    

    public recComponent() {
       addMouseListener(new Zdarzenie());
    }

   
    
    public void update() {
        repaint();
    }
    
    
      
    //--------tworzy nowy watek i dodaje do listy
    public void addKwadrat(int x,int y) {
        Rect a = new Rect(x,y);
        watek = new Thread(a);
        watek.start();
        lista.add(a);
        
    }
    
  
 
    public void paint(Graphics g) {
        try {
            for(Rect a : lista) {
                if(a.getHealt() == 0) {                 
                    lista.remove(a);
                }else
                g.drawRect(a.getX(), a.getY(), 30, 30);
              
            }
        }catch(ConcurrentModificationException ex) {
        }
        
    }
  
    
    
    //---------------ZDARZENIE klikniecie myszy
    class Zdarzenie implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub     
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            addKwadrat(e.getX(),e.getY());
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
        
    }

  
    
}
