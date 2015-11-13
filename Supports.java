
import java.awt.*;
import java.applet.*;


public class Supports extends Applet
{
  public static void leftsupports(Graphics g)
    {
        for (int count = 105; count <= 175; count+=10)
        {    
            
            Expo.setRandomColor(g);
            Expo.drawLine(g,200,400,count,600);
        }
    }
    
    public static void midsupports(Graphics g)
    {
        //to the left side
        for (int counts = 275; counts <= 515; counts+=10)
        {    
            Expo.setRandomColor(g);
            Expo.drawLine(g,225,400,counts,600);
        }
        //to the right side
        for (int counter = 515; counter <= 755; counter+=10)
        {  
            Expo.setRandomColor(g);
            Expo.drawLine(g,805,400,counter,600);
        }
    }
  
    public static void rightsupports(Graphics g)
    {
        for (int finall = 855; finall <= 925; finall+=10)
        {
            Expo.setRandomColor(g);
            Expo.drawLine(g,830,400,finall,600);
            
            
        }
    }
}