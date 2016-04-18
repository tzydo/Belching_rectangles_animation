

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Rect extends Thread{

    private int pozX;
    private int pozY;
    private int healt;
    private int zmienna =1;
    private int zmienna2 =0;
    
    
    
    public Rect(int x,int y) {
        pozX = x;
        pozY = y;
        healt = 10000;
    }
     
    

    public void run() {  
       while(healt>0) {
           check();
           move();
           Frame.kc.update();
        try {
              Thread.sleep(6);                    
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       }
     
    }
    
  
    
    
    public int getX() {
        return pozX;
    }
    
    
    
    public int getY() {
        return pozY;
    }
    
    
    
    public int getHealt() {
        return healt;
    }
    
    
  
    public void detection() {
        healt -=10;
    }
    
    
    
    private void move() {
        pozY+=zmienna;
        pozX+=zmienna2;
    }
    
    
    
    private void check() {
        if(pozY+60==(Frame.screenHeight)) {
            next(0);
            detection();
        }
        
        
        
        else if(pozX+60 ==(Frame.screenWidth)){
            next(1);
            detection();
        }
        
        
        
        if(pozY < 5) {
            next(2);
            detection();
        }
       
        
        if(pozX < 5) {
            next(3);
            detection();
        }
        
    }
    
    
    public void next(int a) { 
        int x=0;
        
        
        switch (a){
        case 0:
            x = (int)(Math.random()*3);
            
            switch(x) {
                case 0:
                    zmienna = -1;
                    zmienna2 = -1;
                    break;
                case 1:
                    zmienna = -1;
                    zmienna2 =1;
                    break;
                case 2:
                    zmienna = -1;
                    zmienna2 = 0;
                    break; 
                
            }break;
            
            
            
            
        case 1:
            x = (int)(Math.random()*3);
            switch(x) {
            case 0:
                zmienna = -1;
                zmienna2 = 0;
                break;
            case 1:
                zmienna = -1;
                zmienna2 = -1;
                break;
            case 2:
                zmienna = 0;
                zmienna2 = -1;
                break;

            default:
                break;
            }break;
            
            
            
        case 2:
            x = (int)(Math.random()*3);
            switch(x) {
           
            case 0:
                zmienna = 1;
                zmienna2 = -1;
                break;
                
                
            case 2:
                zmienna = 1;
                zmienna2 = 0;
                break;
                
                
            case 3:
                zmienna = 1;
                zmienna2 = 1;
                break;
                
                  
            default:
                break;
            }break;
            
            
            
        case 3:
            x = (int)(Math.random()*3);
           
            switch(x) {
           case 0:
                zmienna = -1;
                zmienna = 1;
                break;
            case 2:
                zmienna = 0;
                zmienna2 = 1;
                break;
                
            case 3:
                zmienna = 1;
                zmienna2 = 1;
                break;
                
                         
                
                default:
                    break;
            }break;
            
        default:
            break;
        
        }
    }
    

    
}
   
